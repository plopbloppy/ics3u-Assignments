import farmanimalenums.Gender;

/**
* Interactive farm game that allows the user to take care of farm animals!
*
* @author Kaili Tang
* @author Agincourt CI
* @version 6.0 Build 9000 - April 2025
*/

public class FarmAnimal {

    /** the age of the farm animal in years */
    public int age;
    /** the gender of the farm animal (male/female) */
    public Gender gender;
    /** the name of the farm animal */
    public String name;
    /** the amount of happiness the farm animal has, increases through interactions */
    public int happiness;
    /** the amount of gifts the farm animal has given, dependent on happiness */
    public int numberOfGifts;
    /** determines whether the farm animal has already eaten in the day or not */
    protected boolean isFull;

    /**
    * constructor that creates a farm animal with age and gender
    *
    * @param age age of farm animal
    * @param gender gender of farm animal (male/female)
    */
    public FarmAnimal(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    /**
    * constructor that creates a farm animal with age, gender and name
    *
    * @param age age of farm animal
    * @param gender gender of farm animal: male/female
    * @param name name of farm animal
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
    * returns the happiness level of this farm animal
    *
    * @return the amount of happiness
    */
    public int getHappiness() {
        return happiness;
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

    //NEED TO STOP POSSIBILITY OF SAME NAME FOR SAME ANIMAL
    protected boolean sameName(FarmAnimal animal) {
        return this.name.equalsIgnoreCase(animal.getName());
    }

    /**
    * determines the type of gift this farm animal will give if happiness is in between 0 and 40
    *
    * @returns the type of gift (true) or null (false)
    */
    protected String dropGift() {
        String gift;

        if (happiness < 10) {
            gift = "berry";
        } else if (happiness < 20) {
            gift = "coin";
        } else if (happiness < 30) {
            gift = "flower";
        } else if (happiness < 40) {
            gift = "apple";
        } else {
            gift = null;
        }
        return gift;
    }

    /** 
    * this farm animal eats and gains 2 happiness if it is not full
    *
    * @returns +2 happiness (true) or "Your animal is full!" (false)
    */
    public String eat() {
        if (isFull) {
            return "Your animal is full!";
        } else {
            happiness += 2;
            isFull = true;
            return "Nom nom nom! +2 happiness";
        }
    }

    /**
    * pets this farm animal and gain 3 happiness
    * this farm animal gives a gift if happiness is in between 0 and 40, and number of gifts increases by 1
    *
    * @return +3 happiness and gift (true) or null (false)
    */
    public String pet() {
        if (dropGift() != null) {
            numberOfGifts++;
            System.out.println((name != null ? name : "Your animal") + " has found something for you: " + dropGift());
        }

        happiness += 3;
        return (name != null ? name : "Your animal") + " is very happy today! +3 happiness";
    }

    /**
    * this farm animal sleeps, ages 1 year, and gains 5 happiness
    * sleeping allows the farm animal to eat again
    *
    * @return +5 happiness, +1 age
    */
    public String sleep() {
        age++;
        happiness += 5;
        isFull = false;
        return "Zzz. +5 happiness";
    }
}
