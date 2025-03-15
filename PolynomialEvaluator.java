import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0.0;
        double constant = 0.0;

        System.out.println("Please enter a polynomial of the form: f(x) = 3x^3 -5x^2 +1x^4 +9x^6 +3.1x^1 +2:");
        String userInput = keyboard.nextLine();
        System.out.println("Please enter a value for x:");
        double x = keyboard.nextDouble();
        keyboard.close();

        String polynomial = userInput.substring(userInput.indexOf('=') + 1).trim();
        StringTokenizer polySt = new StringTokenizer(polynomial);

        while (polySt.hasMoreTokens()) {
            String term = polySt.nextToken();
            if (term.contains("x")) {
                int variable = term.indexOf('x');
                int hat = term.indexOf('^');
                double coefficient = Double.parseDouble(term.substring(0, variable));
                int exponent = Integer.parseInt(term.substring(hat + 1));

                sum += coefficient * Math.pow(x, exponent);
            } else {
                constant += Double.parseDouble(term);
            }
        }
        System.out.println("f(" + x + ") = " + (sum + constant));
        }
    }