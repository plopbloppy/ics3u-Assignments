import farmanimalenums.Gender;
/**
* Interactive farm game that allows the user to take care of farm animals!
* With this subclass and previous bird subclass, chickens have extra interactions.
*
* @author Kaili Tang
* @author Agincourt CI
* @version 6.0 Build 9000 - April 2025
*/

public class Chicken extends Bird {

    /**
    * constructor that creates a chicken with age and gender
    * 
    * @param age age of chicken
    * @param gender gender of chicken: male/female
    */
    public Chicken(int age, Gender gender) {
        super(age, gender);
    }  

    /**
    * constructor that creates a chicken with age, gender and name
    *
    * @param age age of chicken
    * @param gender gender of chicken: male/female
    * @param name name of chicken
    */
    public Chicken(int age, Gender gender, String name) {
        super(age, gender, name);
    }

    //WIP
    @Override
    public String eat() {
        super.eat();
        return "Peck peck! +2 happiness";
    }

    /**
    * pet chicken and gain 3 happiness
    * if chicken is an adult, it will make a sound
    * if chicken is a baby, it will make a different sound
    *  
    * @return sound of bird
    */
    @Override
    public String pet() {
        super.pet();

        if (isAdult()) {
            return (isFemale() ? "Cluck cluck!" : "Bu-gawwwk!") + " +3 happiness";
        } else {
            return "Cheep cheep! +3 happiness";
        }
    }

    /**
    * returns chicken flying
    * if chicken is an adult, it will fly over the fence
    * if chicken is a baby, it will fly for a short while
    *
    * @return flying chicken
    */
    public String fly() {
        return "Your chicken" + (isAdult() ? " titters over the fence!" : " flies for a short while!");
    }
}