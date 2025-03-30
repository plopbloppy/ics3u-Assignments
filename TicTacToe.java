import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class TicTacToe {
    public static void board(String[][] board) {
        for (String[] row : board) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void placePiece(String[][] board, String turn, String input) {
        String col = input.substring(0, 1);
        int row = Integer.parseInt(input.substring(1));

        switch (col) {
            case "A":
                board[row + 1][1] = ("|" + turn);
                break;
            case "B":
                board[row + 1][2] = ("|" + turn);
                break;
            case "C":
                board[row + 1][3] = ("|" + turn + "|");
                break; 
        }
    }

    public static void checkForWin(int i, String[][] board, String turn, String input) {
        String col = input.substring(0, 1);
        int winCounter = 0;

        switch (col) {
            case "A":
                for (i = 2; i < 5; i++) {
                    winCounter = board[i][1].contains(turn) ? winCounter++ : 0;
                }
                if (winCounter == 3) {
                    System.out.println("'" + turn + "' has won!!!");
                }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        HashSet<String> playsMade = new HashSet<String>();
        int i = 0;
        String turn = i % 2 == 0 ? "o" : "x";
        String input = "";        

        String[][] board = { { "   ", " A ", "B ", "C" },
                { "   ", " _ ", "_ ", "_" },
                { "1  ", "|_", "|_", "|_|" },
                { "2  ", "|_", "|_", "|_|" },
                { "3  ", "|_", "|_", "|_|" } };

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println(
                "In this game, your objective is to have three consequence pieces diagonally or in a row/column.");
        System.out.println("'o' plays first, and 'x' plays second.");
        System.out.println("To place your piece, enter the column and the row, in the form of 'A1'.");

        while (true) {
            board(board);
            System.out.println("Turn: " + turn);
    
            try {
                System.out.println("Place your piece:");
                input = keyboard.next();

                Pattern pattern = Pattern.compile([A-C]);
                Matcher matcher = pattern.matcher("Vdfasdfasd");
                boolean matchFound = matcher.find();

                if (input.matches(/[A-C])) {
                    if (playsMade.contains(input)) {
                        System.out.println("That move has already been entered!");
                        i--;
                    } else {
                        placePiece(board, turn, input);
                        checkForWin(i, board, turn, input);
                    }
                } else {
                    System.out.println("Please use the correct form! (e.g. C2)");
                }
                     
                System.out.println("-------------");
            } catch (NumberFormatException e) {
                System.out.println("Please use the correct form! (e.g. B3)");
                System.out.println("-------------");
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not an valid spot!");
                System.out.println("-------------");
                i--;
            }
            playsMade.add(input);
            i++;
        }
    }
}
