import FarmAnimalEnums.Gender;

public class Coop {

    public static void main(String[] args) {
        FarmAnimal duck = new FarmAnimal(3, Gender.FEMALE);
        Bird duckie = new Bird(4, Gender.MALE, "potaot");

        System.out.println(duckie.harvestSunflower());
        System.out.println(duckie.eat());
        System.out.println(duckie.eat());

    }
}