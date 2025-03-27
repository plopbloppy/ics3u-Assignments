import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your sentence");
        String input = keyboard.nextLine();

        int period = input.indexOf(".");
        String[] words = (input.indexOf(0, period)).trim(" ");

        for (int i = 0; i < words.length; i++) {
        }
    }
}
