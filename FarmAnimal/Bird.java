import FarmAnimalEnums.Gender;

public class Bird extends FarmAnimal {

    public int eggs;
    public int sunflowerSeeds;
    final int ADULT_AGE = 2;

    public Bird(int age, Gender gender) {
        super(age, gender);
    }

    public Bird(int age, Gender gender, String name) {
        super(age, gender, name);
    }

    public int getNumberOfEggs() {
        return eggs;
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
            eggs++;
            numberOfGifts++;
            return (name != null ? name : "Your bird") + " has laid an egg! +1 egg";
        } else {
            return (name != null ? name : "Your bird") + " can't lay eggs!";
        }
    }

    public String boilEgg() {
        if (eggs >= 1) {
            eggs--;
            return "The egg is perfectly cooked!";
        } else {
            return "Not enough eggs!";
        }
    }

    @Override
    public String eat() {
        if (isFull) {
            return "Your animal is full!";
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

    public String harvestSunflower() {
        sunflowerSeeds += 50;
        return "You harvested 50 sunflower seeds! +50 seeds";
    }
}