import java.util.Scanner;

public class TicTacToe {
    public static void board(int userInput) {
        String[][] board = { { " 1 |", "2 |", "3" },
                { " 4 |", "5 |", "6" },
                { " 7 |", "8 |", "9" } };

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // int spot = board[row][col].indexOf(String.valueOf(userInput));
                // board[spot][spot] = "o";
                System.out.print(board[row][col] + " ");
                
            }
            System.out.println();
        }
        
    }

    public static String checkForWins() {
        return "You win!";
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println(
                "In this game, your objective is to have three consequence pieces diagonally or in a row/column.");
        System.out.println("'o' plays first, and 'x' plays second.");
        System.out.println("You get to play first!");

        while (true) {
            board(userInput);
            // need to write a try/catch for this
            System.out.println("Please choose a square to place your piece:");
            userInput = keyboard.nextInt();
            checkForWins();
        }
    }
}