import farmanimalenums.Gender;

/**
* Birds have extra interactions.
*
* @author Kaili Tang
* @author Agincourt CI
* @version 6.0 Build 9000 - April 2025
*/

public class Bird extends FarmAnimal {

    /** the number of eggs collected */
    public int eggs;
    /** the number of sunflower seeds collected */
    public int sunflowerSeeds;
    /** the age of an adult bird */
    final int ADULT_AGE = 2;

    /**
    * constructor that creates a bird with age and gender
    *
    * @param age the age
    * @param gender the gender
    */
    public Bird(int age, Gender gender) {
        super(age, gender);
    }

    /**
    * constructor that creates a bird with age, gender and name
    *
    * @param age the age
    * @param gender the gender
    * @param name the name
    */
    public Bird(int age, Gender gender, String name) {
        super(age, gender, name);
    }
    
    /**
    * returns the number of eggs collected from this bird
    *
    * @return number of eggs
    */
    public int getNumberOfEggs() {
        return eggs;
    }

    /** 
    * returns the number of sunflower seeds collected for this bird
    *
    * @return number of sunflower seeds
    */
    public int getNumberOfSunflowerSeeds() {
        return sunflowerSeeds;
    }

    /**
    * returns whether this bird is an adult
    *
    * @return true if is adult or false if not
    */
    protected boolean isAdult() {
        return age >= ADULT_AGE;
    }

    /**
    * returns whether this bird is female
    *
    * @return true if is female or false if not
    */
    protected boolean isFemale() {
        return "FEMALE".equals(gender.name());
    }

    /**
    * returns whether this bird can lay eggs
    *
    * @return true if this bird is an adult female false if not
    */
    protected boolean canLayEggs() {
        return isAdult() && isFemale();
    }

    /**
    * this bird lays an egg if it is an adult female
    *
    * @return number of eggs +1 and number of gifts +1 (true) or "Your bird can't lay eggs!" (false)
    */
    public String layEgg() {
        if (canLayEggs()) {
            eggs++;
            numberOfGifts++;
            return (name != null ? name : "Your bird") + " has laid an egg! +1 egg";
        } else {
            return (name != null ? name : "Your bird") + " can't lay eggs!";
        }
    }

    /** if this bird has laid at least one egg, boil the egg */
    public String boilEgg() {
        if (eggs >= 1) {
            eggs--;
            return "The egg is perfectly cooked!";
        } else {
            return "Not enough eggs!";
        }
    }

    /**
    * this bird eats food and gains 2 happiness if it is not full
    * under the same condition, if the user has at least 25 sunflower seeds, 
    * this bird will eat sunflower seeds and gain 5 happiness
    *  
    * @return happiness +2 or 5 (if sunflower seeds >= 25) or "Your bird is full!"
    */
    @Override
    public String eat() {
        if (isFull) {
            return "Your bird is full!";
        } else {
            isFull = true;
            
            if (sunflowerSeeds >= 25) {
                happiness += 5;
                return "Your bird is especially happy! +5 happiness";
            } else {
                happiness += 2;
                return "Nom nom nom! +2 happiness";
            }
        }
    }

    /**
    * harvests sunflower seeds
    * 
    * @return sunflower seeds +50
    */
    public String harvestSunflower() {
        sunflowerSeeds += 50;
        return "You harvested 50 sunflower seeds! +50 seeds";
    }
}
