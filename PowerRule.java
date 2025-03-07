import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String derivative1 = "f'(x) = ";
        String derivative2 = "f''(x) = ";

        System.out.println("Please enter the coefficients:");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter the exponents:");
        String exponents = keyboard.nextLine();
        keyboard.close();

        String[] coefData = coefficients.split(" ");
        String[] expData = exponents.split(" ");  

        for (int i = 0; i < coefData.length; i++) {
            double coefficient = Double.parseDouble(coefData[i]) * Integer.parseInt(expData[i]);
            double exponent = Integer.parseInt(expData[i]) - 1;
            derivative1 +=  coefficient + "x^" + exponent + " ";

            double coefficient2 = coefficient * exponent;
            double exponent2 = exponent - 1;
            derivative2 +=  coefficient2 + "x^" + exponent2 + " ";
        }
        System.out.println("Your first derivative is: " + derivative1);
        System.out.println("Your second derivative is: " + derivative2);
    }
}
