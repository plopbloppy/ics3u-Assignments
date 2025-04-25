public class VegetarianPizza extends Pizza {
    
    public String vegetables;

    public VegetarianPizza() {
        super();
        this.vegetables = "onion, bell pepper";
    }

    public VegetarianPizza(int numberOfSlices) {
        super(numberOfSlices);
        this.vegetables = "onion, bell pepper";
    }

    public VegetarianPizza(String vegetables) {
        super();
        this.vegetables = vegetables.replaceAll("[^a-zA-Z,]", "");
    }

    public VegetarianPizza(String cheese, String sauce, String vegetables, int numberOfSlices) {
        super(cheese, sauce, numberOfSlices);
        this.vegetables = vegetables.replaceAll("[^a-zA-Z,]", "");
    }

    public String[] getVegetables() {
        String[] vegetablesSt = vegetables.toLowerCase().split(",");
        return vegetablesSt;
    }
}