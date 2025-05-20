import farmanimalenums.Gender;

/** 
 * Interactive farm game taht allows the user to take care of farm animals!
 * 
 * @author Kaili Tang
 * @author Agincourt CI
 * @version 1.0 - April 2025
 */
public class FarmAnimal {

    /** the age of the farm animal in years */
    public int age;

    /** the gender of the farm animal */
    public Gender gender;

    /** the name of the farm animal */
    public String name;

    /** the amount of friendship you have with the farm animal, increases through interactions */
    public int friendship;

    /** the amount of gifts the farm animal has given, dependent on friendship */
    public int numberOfGifts;

    /** determines whether the farm animal has already eaten in the day or not */
    protected boolean isFull;

    
    /**
     * constructor that creates a farm animal with age and gender
     *
     * @param age the age
     * @param gender the gender
     */
    public FarmAnimal(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }


    /** 
     * constructor that creates a farm animal with age, gender and name
     * 
     * @param age the age
     * @param gender the gender
     * @param name the name
     */
    public FarmAnimal(int age, Gender gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    /**
     * returns the age of this farm animal
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * returns the gender of this farm animal
     *
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * returns the name of this farm animal
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * returns the level of friendship with this farm animal
     *
     * @return the friendship level
     */
    public int getFriendshipLevel() {
        return friendship;
    }

    /**
     * returns the number of gifts collected from this farm animal
     *
     * @return the number of gifts
     */
    public int getNumberOfGifts() {
        return numberOfGifts;
    }

    /**
     * sets the age of this farm animal
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * sets the gender of this farm animal
     *
     * @param gender the new gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * sets the name of this farm animal
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * calls the name of this farm animal, if it has one
     * 
     * @return name or neutral call
     */
    protected String callName() {
        return name != null ? name : "Your animal";
    }

    /**
     * determines the type of gift this farm animal will give if friendship is in between 0 and 40
     *
     * @returns the type of gift (true) or null (false)
     */
    protected String dropGift() {
        String gift;

        if (friendship < 10) {
            gift = "berry";
        } else if (friendship < 20) {
            gift = "copper coin";
        } else if (friendship < 30) {
            gift = "lily";
        } else if (friendship < 40) {
            gift = "apple";
        } else {
            gift = null;
        }
        return gift;
    }

    /** this farm animal eats and gains 2 friendship if it is not full */
    public void eat() {
        if (isFull) {
            System.out.println(callName() + " is full!");
        } else {
            friendship += 2;
            isFull = true;
            System.out.println("Nom nom nom! +2 friendship");
        }
    }

    /**
     * pets this farm animal and gain 3 friendship
     * this farm animal gives a gift if friendship is in between 0 and 40, and number of gifts increases by 1
     */
    public void pet() {
        if (dropGift() != null) {
            numberOfGifts++;
            System.out.println(callName() + " has found something for you: " + dropGift());
        }

        friendship += 3;
        System.out.println(callName() + " is very happy today! +3 friendship");
    }

    /**
     * this farm animal sleeps, ages 1 year, and gains 5 friendship
     * sleeping allows the farm animal to eat again
     */
    public void sleep() {
        age++;
        friendship += 5;
        isFull = false;
        System.out.println("Zzz. +5 friendship");
    }
}