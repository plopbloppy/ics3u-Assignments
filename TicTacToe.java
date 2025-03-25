import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    public static String turn(int i, int userInput) {
        String turn = i % 2 == 0 ? "o" : "x";
        return turn;
    }

    public static void board(String[][] board, int i, int userInput) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].contains(Integer.toString(userInput))) {
                    board[row][col] = turn(i, userInput);
                }
                System.out.print(board[row][col] + " | ");
                
            }
            System.out.println();
        }
    }

    // public static String checkForWins() {
    //     
    // }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final int MAX_TOLERANCE = 9;
        int userInput = 0;

        String[][] board = { { "1", "2", "3" },
                { "4", "5", "6" },
                { "7", "8", "9" } };
            
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println(
                "In this game, your objective is to have three consequence pieces diagonally or in a row/column.");
        System.out.println("'o' plays first, and 'x' plays second.");

        for (int i = 0; i < MAX_TOLERANCE; i++) {
            board(board, i, userInput);
            System.out.println("Turn: " + turn(i, userInput));
        
            try {
                System.out.println("Please choose a square to place your piece:");
                userInput = keyboard.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Not a number from 1 to 9!");
            }  
        }
    }
}