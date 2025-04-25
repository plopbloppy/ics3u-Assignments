public class VegetarianPizza extends Pizza {
    
    public String vegetables;

    public VegetarianPizza() {
        this.vegetables = "onion, bell pepper";
        this.numberOfSlices = 8;
    }

    public VegetarianPizza(String vegetables) {
        this.vegetables = vegetables.replaceAll("[^a-zA-Z, ]", "");
    }

    public VegetarianPizza(String cheese, String sauce, int numberOfSlices) {
        super();
        this.sauce = sauce;
        this.numberOfSlices = numberOfSlices;
    }
}