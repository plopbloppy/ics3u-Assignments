import farmanimalenums.Gender;

/**
* Interactive farm game that allows the user to take care of farm animals!
*
* @author Kaili Tang
* @author Agincourt CI
* @version 6.0 Build 9000 - April 2025
*/

public class FarmAnimal {

    public int age;
    public Gender gender;
    public String name;
    public int happiness;
    public int numberOfGifts;
    protected boolean isFull;

    /**
    * constructor that creates a farm animal with age and gender
    *
    * @param age age of farm animal
    * @param gender gender of farm animal: male/female
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
    * returns the age of farm animal
    *
    * @return age of farm animal
    */
    public int getAge() {
        return age;
    }

    /**
    * returns the gender of farm animal
    *
    * @return gender of farm animal
    */
    public Gender getGender() {
        return gender;
    }

    /**
    * returns the name of farm animal
    *
    * @return name of farm animal
    */
    public String getName() {
        return name;
    }

    /**
    * returns the happiness level of farm animal
    *
    * @return amount of happiness of farm animal
    */
    public int getHappiness() {
        return happiness;
    }

    /**
    * returns the number of gifts collected from farm animal
    *
    * @return amount of gifts collected from farm animal
    */
    public int getNumberOfGifts() {
        return numberOfGifts;
    }

    /**
    * sets age of farm animal
    *
    * @param age new age of farm animal
    */
    public void setAge(int age) {
        this.age = age;
    }

    /**
    * sets gender of farm animal
    *
    * @param gender new gender of farm animal
    */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
    * sets name of farm animal
    *
    * @param name new name of farm animal
    */
    public void setName(String name) {
        this.name = name;
    }

    //NEED TO STOP PPL FROM USING THE SAME NAME FOR ANIMAL
    protected boolean sameName(FarmAnimal animal) {
        return this.name.equalsIgnoreCase(animal.getName());
    }

    /**
    * depending on amount of happiness, farm animal might give gift
    *
    * @returns type of gift if 0 < happiness < 40, otherwise null
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
    * if not full, farm animal eats and gains 2 happiness
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
    * pet farm animal and gain 3 happiness
    * farm animal will give gift if gift is not null, and number of gifts increases by 1
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
    * farm animal will sleep, age 1 year, and gain 5 happiness
    */
    public String sleep() {
        age++;
        happiness += 5;
        isFull = false;
        return "Zzz. +5 happiness";
    }
}