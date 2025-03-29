import java.util.Scanner;

public class TicTacToe {
    public static void board(String[][] board, int i) {
        for (String[] row : board) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void placePiece(String[][] board, int i, String input, String turn) {
        String col = input.substring(0, 1);
        int row = Integer.parseInt(input.substring(1));

        switch (col) {
            case "A":
                if (board[row + 1][1].contains("_")) {
                    board[row + 1][1] = ("|" + turn);
                } else {
                    i--;
                    System.out.println("That spot is taken!");
                    System.out.println("Please pick another spot.");
                }
                break;
            case "B":
                if (board[row + 1][2].contains("_")) {
                    board[row + 1][2] = ("|" + turn);
                } else {
                    i--;
                    System.out.println("That spot is taken!");
                    System.out.println("Please pick another spot.");
                }
                break;
            case "C":
                if (board[row + 1][3].contains("_")) {
                    board[row + 1][3] = ("|" + turn + "|");
                } else {
                    i--;
                    System.out.println("That spot is taken!");
                    System.out.println("Please pick another spot.");
                }
                break;
            default:
                i--;
                System.out.println("Please use the correct form! (e.g. C2)");
        }
    }

    public static void checkForWin(int i, String[][] board, String input, String turn) {
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
        int i = 0;

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
            try {
                String turn = i % 2 == 0 ? "o" : "x";
                board(board, i);
                System.out.println("Turn: " + turn);
                System.out.println("Place your piece:");
                String input = keyboard.next();

                placePiece(board, i, input, turn);
                checkForWin(i, board, input, turn);
                System.out.println("-------------");
            } catch (NumberFormatException e) {
                i--;
                System.out.println("Please use the correct form! (e.g. B3)");
                System.out.println("-------------");
            } catch (ArrayIndexOutOfBoundsException e) {
                i--;
                System.out.println("Not an valid spot!");
                System.out.println("-------------");
            }
            i++;
        }
    }
}
