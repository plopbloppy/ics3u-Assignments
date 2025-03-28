import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        HashSet<String> dictionary = new HashSet<String>();
        BufferedReader inputStream = null;
        String line = null;

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            while ((line = inputStream.readLine()) != null) {
                dictionary.add(line);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error opening file!");
            System.exit(1);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        System.out.println("Please enter your sentence:");
        String input = keyboard.nextLine().trim();

        String word = input.contains(".") ? input.substring(0, input.indexOf(".")) : input;

        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            String isValid = dictionary.contains(words[i].toLowerCase()) ? "<valid>" : "<invalid>";
            System.out.println((i + 1) + "." + words[i] + " " + isValid);
        }
        keyboard.close();
    }
}
