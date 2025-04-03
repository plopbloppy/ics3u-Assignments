import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicTacToe {
    
    public static void board(String[][] board) {
        for (String[] row : board) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static int[] returnIndex(String input) {
        int[] choices = new int[2];
        String letterCol = input.substring(0, 1);
        int row = Integer.parseInt(input.substring(1));
        int col = 0;

        switch (letterCol) {
            case "A":
                col = 1;
                break;
            case "B":
                col = 2;
                break;
            case "C":
                col = 3;
                break;
        }
        choices[0] = row + 1;
        choices[1] = col;
        return choices;
    }

    public static void placePiece(String[][] board, String turn, int[] choices) {
        board[choices[0]][choices[1]] = choices[1] == 3 ? "|" + turn + "|" : "|" + turn;
    }

    public static boolean checkForWin(String[][] board, String turn, int[] choices) {
        int verticalWinCounter = 0;
        int horizontalWinCounter = 0;
        boolean diagonalWin = false;

        for (int i = 2; i < 5; i++) {
            if (board[i][choices[1]].contains(turn)) {
                verticalWinCounter++;
            }
        }

        for (int i = 1; i < 4; i++) {
            if (board[choices[0]][i].contains(turn)) {
                horizontalWinCounter++;
            }
        }

        if (board[2][1].contains(turn) && board[3][2].contains(turn) && board[4][3].contains(turn) ||
                board[4][1].contains(turn) && board[3][2].contains(turn) && board[2][3].contains(turn)) {
            diagonalWin = true;
        }
        boolean win = verticalWinCounter == 3 || horizontalWinCounter == 3 || diagonalWin;
        return win;
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final int MAX_PLAYS = 9;
        String input;

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

        for (int i = 0; i < MAX_PLAYS; i++) {
            String turn = i % 2 == 0 ? "o" : "x";
            board(board);
            System.out.println("Turn: " + turn);

            System.out.println("Place your piece:");
            input = keyboard.nextLine().toUpperCase();

            Pattern pattern = Pattern.compile("^[ABC]+[1-3]$");
            Matcher matcher = pattern.matcher(input);
            boolean matchFound = matcher.find();

            if (matchFound) {
                int[] choices = returnIndex(input);

                if (board[choices[0]][choices[1]].contains("o") || board[choices[0]][choices[1]].contains("x")) {
                    System.out.println("That move has already been entered!");
                    i--;
                } else {
                    placePiece(board, turn, choices);

                    if (checkForWin(board, turn, choices)) {
                        board(board);
                        System.out.println("-------------");
                        System.out.println("Player '" + turn + "' has won!!! GG!");
                        keyboard.close();
                        System.exit(1);
                    }
                }
                System.out.println("-------------");
            } else {
                System.out.println("Not a valid input!");
                System.out.println("-------------");
                i--;
            }
        }
        board(board);
        System.out.println("-------------");
        System.out.println("Game is a tie! GG!");
        keyboard.close();
    }
}
