/**
 * Birds have extra interactions.
 *
 * @author Kaili Tang
 * @author Agincourt CI
 * @version 1.0 - April 2025
 */
public class Bird extends FarmAnimal {

    /** the number of eggs collected */
    public int eggs;

    /** the number of sunflower seeds collected */
    public int sunflowerSeeds;

    /** the cooking level, increases when a dish is made */
    public int cookingLevel;

    /** the minimum age of an adult bird */
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
     * calls the name of this bird, if it has one
     * 
     * @return name or neutral call
     */
    @Override
    protected String callName() {
        return name != null ? name : "Your bird";
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
     * @return the number of sunflower seeds
     */
    public int getNumberOfSunflowerSeeds() {
        return sunflowerSeeds;
    }

    /**
     * returns whether this bird is an adult
     *
     * @return true (is adult) or false (not adult)
     */
    protected boolean isAdult() {
        return age >= ADULT_AGE;
    }

    /**
     * returns whether this bird is female
     *
     * @return true (is female) or false (not female)
     */
    protected boolean isFemale() {
        return "FEMALE".equals(gender.name());
    }

    /**
     * returns whether this bird can lay eggs
     *
     * @return true (is adult female) false (not adult female)
     */
    protected boolean canLayEggs() {
        return isAdult() && isFemale();
    }

    /** this bird lays an egg if it is an adult female */
    public void layEgg() {
        if (canLayEggs()) {
            eggs++;
            numberOfGifts++;
            System.out.println(callName() + " has laid an egg! +1 egg");
        } else {
            System.out.println(callName() + " can't lay eggs!");
        }
    }

    /**
     * this bird eats food and gains 2 friendship if it is not full
     * under the same condition, if the user has at least 25 sunflower seeds, 
     * this bird will eat 25 sunflower seeds and gain 5 friendship
     */
    @Override
    public void eat() {
        if (isFull) {
            System.out.println(callName() + " is full!");
        } else {
            isFull = true;
            
            if (sunflowerSeeds >= 25) {
                friendship += 5;
                sunflowerSeeds -= 25;
                System.out.println(callName() + " is especially happy! +5 friendship");
            } else {
                friendship += 2;
                System.out.println("Nom nom nom! +2 friendship");
            }
        }
    }

    /** if this bird has laid at least one egg, boil the egg */
    public void boilEgg() {
        if (eggs >= 1) {
            eggs--;
            cookingLevel++;
            System.out.println("The egg is perfectly cooked! +1 cooking level");
        } else {
            System.out.println("Not enough eggs!");
        }
    }

    /** harvests sunflower seeds */
    public void harvestSunflower() {
        sunflowerSeeds += 50;
        System.out.println("You harvested 50 sunflower seeds! +50 seeds");
    }
}