public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza = new Pizza(2);
        VegetarianPizza pizza2 = new VegetarianPizza("ONIONS, potato, beet");
        
        pizza.eatPizza();
        pizza2.eatPizza();
        System.out.println("----------------------");

        String[] vegetablesSt = pizza2.getVegetables();

        for (int i = 0; i < vegetablesSt.length; i++) {
            System.out.println(vegetablesSt[i]);
        }
        
    }
}
