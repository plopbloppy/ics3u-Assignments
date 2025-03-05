import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        main:
        while (true) {
            System.out.println("Please enter your guess:");
            double x = keyboard.nextDouble();
            
            while (true) {
                double function = 6 * Math.pow(x, 4) - 13 * x * x * x - 18 * x * x + 7 * x + 6;
                double derivative = 24 * x * x * x - 39 * x * x - 36 * x + 7;
                double root = x - function / derivative;
                
                if (Math.abs(Math.abs(x) - Math.abs(root)) >= 0.0001) {
                    x = root;
                    System.out.println(root);
                } else {
                    System.out.println("The closest root was: " + x + ".");
                    System.out.println("Would you like to try again? [y/n]");
                    
                    if  (Character.toLowerCase(keyboard.next().charAt(0)) == 'n') {
                        keyboard.close();
                        break main;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}