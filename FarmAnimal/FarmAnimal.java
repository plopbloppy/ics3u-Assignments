import FarmAnimalEnums.Gender;

public class FarmAnimal {

    public int age;
    public Gender gender;
    public String name;
    public int happiness;
    protected boolean isFull;
    public int numberOfGifts;

    public FarmAnimal(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    public FarmAnimal(int age, Gender gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getNumberOfGifts() {
        return numberOfGifts;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected boolean sameName(FarmAnimal animal) {
        return this.name.equalsIgnoreCase(animal.getName());
    }

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

    public String eat() {
        if (isFull) {
            return "Your animal is full!";
        } else {
            happiness += 2;
            isFull = true;
            return "Nom nom nom! +2 happiness";
        }
    }

    public String pet() {
        happiness += 3;

        if (dropGift() != null) {
            numberOfGifts++;
            System.out.println((name != null ? name : "Your animal") + " has found something for you: " + dropGift());
        }
        
        return (name != null ? name : "Your animal") + " is very happy today! +5 happiness";
    }

    public String sleep() {
        age++;
        happiness += 5;
        isFull = false;
        return "Zzz.";
    }
}