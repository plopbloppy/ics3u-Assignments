import java.util.HashSet;
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

    public static void placePiece(final int ROW_ADJUSTMENT, String[][] board, String turn, String input) {
        String col = input.substring(0, 1);
        int row = Integer.parseInt(input.substring(1));

        switch (col) {
            case "A" -> board[row + ROW_ADJUSTMENT][1] = ("|" + turn);
            case "B" -> board[row + ROW_ADJUSTMENT][2] = ("|" + turn);
            case "C" -> board[row + ROW_ADJUSTMENT][3] = ("|" + turn + "|");
        }
    }

    public static boolean checkForWin(final int ROW_ADJUSTMENT, String[][] board, String turn, String input) {
        String letterCol = input.substring(0, 1);
        int row = Integer.parseInt(input.substring(1)) + ROW_ADJUSTMENT;
        int col = 0;
        int verticalWinCounter = 0;
        int horizontalWinCounter = 0;
        boolean diagonalWin = false;    

        switch (letterCol) {
            case "A" -> col = 1;
            case "B" -> col = 2;
            case "C" -> col = 3;
        }

        for (int i = 2; i < 5; i++) {
            if (board[i][col].contains(turn)) {
                verticalWinCounter++;
            }
        }

        for (int i = 1; i < 4; i++) {
            if (board[row][i].contains(turn)) {
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
        HashSet<String> playsMade = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        final int MAX_TOLERANCE = 8;
        final int ROW_ADJUSTMENT = 1;
        int i = 0;
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
        System.out.println("To place your piece, enter the column and the row, in the form of 'A1' (case-sensitive).");

        while (true) {
            String turn = i % 2 == 0 ? "o" : "x";
            board(board);
            System.out.println("Turn: " + turn);

            System.out.println("Place your piece:");
            input = keyboard.next();

            Pattern pattern = Pattern.compile("[ABC]+[1-3]");
            Matcher matcher = pattern.matcher(input);
            boolean matchFound = matcher.find();

            if (matchFound) {
                if (playsMade.contains(input)) {
                    System.out.println("That move has already been entered!");
                    i--;
                } else {
                    placePiece(board, turn, input);
                    if (checkForWin(board, turn, input)) {
                        board(board);
                        System.out.println("Player '" + turn + "' has won!!!");
                        keyboard.close();
                        System.exit(1);
                    } else if (i == MAX_TOLERANCE) {
                        board(board);
                        System.out.println("Game is a tie!");
                        keyboard.close();
                        System.exit(1);
                    }
                }
            } else {
                System.out.println("Please use the correct form! (e.g. B3)");
                i--;
            }
            System.out.println("-------------");
            playsMade.add(input);
            i++;
        }
    }
}