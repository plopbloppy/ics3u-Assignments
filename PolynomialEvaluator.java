import java.util.Scanner;

import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a polynomial in the form of f(x) = 3x^3 -5x^2 +2:");
        String polynomial = keyboard.next();
        System.out.println("Please enter a value for x:");
        double x = keyboard.nextDouble();
        keyboard.close();

        StringTokenizer token = new StringTokenizer(polynomial, " ");

        while (token.hasMoreTokens()) {
            String temp = token.nextToken();
            for (int i = 0; i < temp.length(); i++) {
                if (Character.isDigit(temp.charAt(i))) {
                    System.out.println(temp.charAt(i));
                }
            }
        }
    }
}