/**
 * Chickens have extra interactions.
 *
 * @author Kaili Tang
 * @author Agincourt CI
 * @version 1.0 - April 2025
 */
public class Chicken extends Bird {

    /** the number of jars of mayo */
    public int jarsOfMayo;

    /** the number of egg salad dishes */
    public int eggSalad;

    /**
     * constructor that creates a chicken with age and gender
     * 
     * @param age the age
     * @param gender the gender
     */
    public Chicken(int age, Gender gender) {
        super(age, gender);
    }  

    /**
     * constructor that creates a chicken with age, gender and name
     *
     * @param age the age
     * @param gender the gender
     * @param name the name
     */
    public Chicken(int age, Gender gender, String name) {
        super(age, gender, name);
    }

    /**
     * calls the name of this chicken, if it has one
     * 
     * @return name or neutral call
     */
    @Override
    protected String callName() {
        return name != null ? name : "Your animal";
    }

    /**
     * determines the type of gift this chicken will give if friendship is in between 0 and 40
     *
     * @return the type of gift (true) or null (false)
     */
    @Override
    protected String dropGift() {
        String gift;

        if (friendship < 10) {
            gift = "feather";
        } else if (friendship < 20) {
            gift = "silver coin";
        } else if (friendship < 30) {
            gift = "tulip";
        } else if (friendship < 40) {
            gift = "gold egg";
        } else {
            gift = null;
        }
        return gift;
    }

    /**
     * pets this chicken and gain 3 friendship
     * if this chicken is an adult, it will make a sound
     * if this chicken is a baby, it will make a different sound
     * if friendship if in between 0 an 40, this chicken will drop a gift
     */
    public void pet() {
        if (dropGift() != null) {
            numberOfGifts++;
            System.out.println(callName() + " has found something for you: " + dropGift());
        }

        if (isAdult()) {
            System.out.println((isFemale() ? "Cluck cluck!" : "Bu-gawwwk!") + " +3 friendship");
        } else {
            System.out.println("Cheep cheep! +3 friendship");
        }

        friendship += 3;
    }

    /** if there are sufficient ingredients produced from this chicken, make mayo */
    public void makeMayo() {
        if (eggs >= 2) {
            eggs -= 2;
            jarsOfMayo++;
            cookingLevel += 2;
            System.out.println("You succesfully made mayo! +2 cooking level");
        }
    }

    /** if there are sufficient ingredients produced from this chicken, make egg salad */
    public void cookEggSalad() {
        if (eggs >= 3 && jarsOfMayo >= 1) {
            eggs -= 3;
            jarsOfMayo --;
            eggSalad++;
            cookingLevel += 4;
            System.out.println("You cook a delicious and filling egg salad! +4 cooking level");
        }
    }

    /**
     * prints this chicken flying
     * if this chicken is an adult, it will fly over the fence
     * if this chicken is a baby, it will fly for a short while
     */
    public void fly() {
        System.out.println(callName() + (isAdult() ? " titters over the fence!" : " flies for a short while!"));
    }
}