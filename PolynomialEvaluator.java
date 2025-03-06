import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String function = "f(x) = ";
        double sum = 0.0;

        System.out.println("Please enter a polynomial in the form of f(x) = 3x^3 -5x^2 +2:");
        String polynomial = keyboard.nextLine();
        System.out.println("Please enter a value for x:");
        double x = keyboard.nextDouble();
        keyboard.close();

        StringTokenizer polySt = new StringTokenizer(polynomial);
        int term = polynomial.indexOf('x');
        // int hat = indexOf('^');

        while (polySt.hasMoreTokens()) {
            System.out.println(term);

            // double coefficient = Double.parseDouble(coeffSt.nextToken());
            // int exponent = Integer.parseInt(expSt.nextToken());

            // function += coefficient + "x^" + exponent + " ";
            // sum += coefficient * Math.pow(x, exponent);
            }
        }
        // System.out.println("Your polynomial function is:" + function);
        // System.out.println("Your polynomial at x = " + x + " is: f(" + x + ") = " + sum);
    }