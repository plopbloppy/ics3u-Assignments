public class AnimalFarm {

    public static void main(String[] args) {
        FarmAnimal duck = new FarmAnimal(3, Gender.FEMALE);
        Bird duckie = new Bird(4, Gender.MALE, "potaot");
        Bird ducke = new Chicken(4, Gender.MALE, "potaot");

        duck.pet();
        duckie.pet();
        ducke.pet();
        ducke.pet();
        ducke.pet();
        ducke.pet();
    }
}