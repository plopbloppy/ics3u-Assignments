import farmanimalenums.Gender;

/**
* Interactive farm game that allows the user to take care of farm animals!
* With this subclass, birds now have extra interactions.
*
* @author Kaili Tang
* @author Agincourt CI
* @version 6.0 Build 9000 - April 2025
*/

public class Bird extends FarmAnimal {

    public int eggs;
    public int sunflowerSeeds;
    final int ADULT_AGE = 2;

    /**
    * constructor that creates a bird with age and gender
    *
    * @param age age of bird
    * @param gender gender of bird: male/female
    */
    public Bird(int age, Gender gender) {
        super(age, gender);
    }

    /**
    * constructor that creates a bird with age, gender and name
    *
    * @param age age of bird
    * @param gender gender of bird: male/female
    * @param name name of bird
    */
    public Bird(int age, Gender gender, String name) {
        super(age, gender, name);
    }
    
    /**
    * returns number of eggs collected from bird
    *
    * @return number of eggs
    */
    public int getNumberOfEggs() {
        return eggs;
    }

    /**
    * returns whether bird is adult
    *
    * @return if bird is adult
    */
    protected boolean isAdult() {
        return age >= ADULT_AGE;
    }

    /**
    * returns whether bird is female
    *
    * @return if bird is female
    */
    protected boolean isFemale() {
        return "FEMALE".equals(gender.name());
    }

    /**
    * returns whether bird can lay eggs
    *
    * @return if bird is an adult female
    */
    protected boolean canLayEggs() {
        return isAdult() && isFemale();
    }

    /**
    * if bird is an adult female, it lays egg
    *
    * @return if bird can lay eggs, number of eggs + 1 and number of gifts + 1 
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

    /**
    * if there is at least one egg, boil egg
    */
    public String boilEgg() {
        if (eggs >= 1) {
            eggs--;
            return "The egg is perfectly cooked!";
        } else {
            return "Not enough eggs!";
        }
    }

    /**
    * if not full, bird eats food and gains 5 happiness
    * if user has at least 25 sunflower seeds, bird will eat sunflower seeds and gain 5 happiness
    * otherwise, it will gain 2 happiness
    *  
    * @return if not full, happiness +2 or 5 (if sunflower seeds >= 25), otherwise "Your bird is full!"
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
                return "Nom nom nom! +2 happiness";
            }
        }
    }

    /**
    * harvests sunflower seeds
    * 
    * @return sunflower seeds + 50
    */
    public String harvestSunflower() {
        sunflowerSeeds += 50;
        return "You harvested 50 sunflower seeds! +50 seeds";
    }
}