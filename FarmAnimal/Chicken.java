import FarmAnimalEnums.Gender;

public class Chicken extends Bird {

    public Chicken(int age, Gender gender) {
        super(age, gender);
    }


    @Override
    public String eat() {
        super.eat();
        return "Peck peck! +2 happiness";
    }

    @Override
    public String pet() {
        super.pet();

        if (isAdult()) {
            return (isFemale() ? "Cluck cluck!" : "Bu-gawwwk!") + " +5 happiness";
        } else {
            return "Cheep cheep! +5 happiness";
        }
    }

    
    
}
