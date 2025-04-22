public class Pizza {

    public String cheese;
    public String sauce;
    public int numberOfSlices;

    public Pizza(String cheese) {
        this.cheese = cheese;
    }

    public Pizza(String cheese, String sauce) {
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public Pizza(String cheese, String sauce, int numberOfSlices) {
        this.cheese = cheese;
        this.sauce = sauce;
        this.numberOfSlices = numberOfSlices;
    }

    protected void setCheese(String cheese) {
        this.cheese = cheese;
    }

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected void setNumberOfSlices(int numberOfSlices) {
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
}
