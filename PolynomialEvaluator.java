import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String function = "f(x) = ";
        double sum = 0.0;
        double constant = 0.0;

        System.out.println("Please enter a polynomial in the form of f(x) = 3x^3 -5x^2 +2:");
        String userInput = keyboard.nextLine();
        String polynomial = userInput.substring(userInput.indexOf('=') + 1);

        System.out.println("Please enter a value for x:");
        int x = keyboard.nextInt();
        keyboard.close();

        StringTokenizer polySt = new StringTokenizer(polynomial);

        while (polySt.hasMoreTokens()) {
            String term = polySt.nextToken();
            int variable = term.indexOf('x');
            int hat = term.indexOf('^');
            double coef = Double.parseDouble(term.substring(0, variable + 1));
            int exp = Integer.parseInt(term.substring(hat + 1));

            function += coef + "x^" + exp + " ";
            sum += coef * Math.pow(x, exp);
            }
        System.out.println("Your polynomial function is:" + function);
        System.out.println("Your polynomial at x = " + x + " is: f(" + x + ") = " + sum);
        }
    }