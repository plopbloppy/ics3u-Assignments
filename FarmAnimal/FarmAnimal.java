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

        gift = switch (happiness) {
            case 5 -> "button";
            case 10 -> "coin";
            case 15 -> "flower";
            default -> null;
        };
        return gift;
    }

    public String eat() {
        if (isFull) {
            return ("Your animal is full!");
        } else {
            happiness += 2;
            isFull = true;
            return "Your animal is satisfied! +2 happiness";
        }
    }

    //implement gifting system
    public String pet() {
        happiness += 5;
        return (name != null ? name : "Your animal") + " is very happy today! +5 happiness";
    }

    public String sleep() {
        age++;
        happiness += 20;
        isFull = false;
        return "Zzz.";
    }
}