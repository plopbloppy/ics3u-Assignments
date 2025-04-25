public class Pizza {

    public String cheese;
    public String sauce;
    public int numberOfSlices;
    protected double bank;

    public Pizza() {
        this.sauce = "tomato";
        this.numberOfSlices = 8;
    }

    public Pizza(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public Pizza(String cheese, String sauce, int numberOfSlices) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.numberOfSlices = numberOfSlices;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    protected double getBank() { //somehow can still be used by the public
        return bank;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public void eatPizza() {
        if (numberOfSlices >= 1) {
            numberOfSlices--;
            System.out.println("Nom nom nom");
        } else {
            System.out.println("No more slices! ᴖ̈");
        }
    }

    public void tasteCheese() {
        switch (cheese.toLowerCase()) {
            case "cheddar":
                System.out.println("The cheddar is sharp and tangy, adding a unique burst of flavour on the pizza.");
                break;
            case "parmesan":
                System.out.println("The parmesan has a strong aroma and has a wonderfully rich taste.");
                break;
            case "mozarella":
                System.out.println("The mozarella, melted beautifully on the pizza, creates a delightful cheese pull.");
                System.out.println("It is certain that the mozarella will have a delicious milk flavour!");
                break;
            case "ricotta":
                System.out.println("The ricotta is creamy and refreshing. Its mild flavour makes it suitable for any pizza!");
                break;
            default:
                System.out.println("The cheese is soft and nicely contrasts the crispy crust.");
                break;
        }
    }

    public double calculateBill() {
        double costOfCheese = cheese.toLowerCase() == "cheddar" ? 2.0 : 2.5;
        double costOfSauce = sauce.toLowerCase() == "tomato" ? 1.0 : 1.5;
        double costOfSlices = numberOfSlices * 2.5;

        return costOfCheese + costOfSauce + costOfSlices;
    }

    public double payBill(double money) {
        if (money > calculateBill()) {
            bank += calculateBill();
            return money - calculateBill();
        } else if (money == calculateBill()) {
            bank += calculateBill();
            return 0.0;
        } else {
            System.out.println("Please pay full amount!");
            return money;
        }
    }
}
