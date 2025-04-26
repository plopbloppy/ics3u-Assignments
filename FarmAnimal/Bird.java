import FarmAnimalEnums.Gender; 

public class Bird extends FarmAnimal {

    public int numberOfEggs;
    final int ADULT_AGE = 2;
    
    public Bird(int age, Gender gender) {
        super(age, gender);
    }

    public Bird(int age, Gender gender, String name) {
        super(age, gender, name);
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    protected boolean isAdult() {
        return age >= ADULT_AGE;
    }

    protected boolean isFemale() {
        return "FEMALE".equals(gender.name());
    }
    
    protected boolean canLayEggs() {
        return isAdult() && isFemale();
    }

    public String layEgg() {
        if (canLayEggs()) {
            numberOfEggs++;
            numberOfGifts++;
            return (name != null ? name : "Your bird") + " has laid an egg! +1 egg";
        } else {
            return (name != null ? name : "Your bird") + " can't lay eggs!";
        }
    }

    public String boilEgg() {
        if (numberOfEggs >= 1) {
            numberOfEggs--;
            return "The egg is perfectly cooked!";
        } else {
            return "Not enough eggs!";
        }
    }
}
