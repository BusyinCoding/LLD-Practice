import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeService {

    Board board;
    Deque<Player> players;

    public void initializeGame() {
        players = new LinkedList<>();
        Player p1 = new Player("Japleen", new PlayingPieceO());
        Player p2 = new Player("Fiza", new PlayingPieceX());
        players.add(p1);
        players.add(p2);
        board = new Board(3);
    }

    public void startGame() {
        System.out.println("Starting the game");
        boolean gameWon = false;
        while (!gameWon) {
            printBoard();
            Player firstPlayer = players.getFirst();
            System.out.println("" + firstPlayer.name + "'s turn");
            Scanner scanner = new Scanner(System.in);
            System.out.println("" + firstPlayer.name + " please enter row");
            int row = scanner.nextInt();
            System.out.println("" + firstPlayer.name + " please enter col");
            int col = scanner.nextInt();
            boolean pieceAdded = addPiece(row, col, firstPlayer.playingPiece);
            if (!pieceAdded) {
                players.addFirst(firstPlayer);
                System.out.println("Invalid Move, try again");
                continue;
            }
            players.removeFirst();
            players.addLast(firstPlayer);
            gameWon = checkWin(firstPlayer.playingPiece, row, col);
            if (gameWon) {
                System.out.println("Game won by " + firstPlayer.name);
            }
            boolean draw = isDraw();
            if (draw) {
                System.out.println("Game Drawn");
                break;
            }
        }
    }

    public boolean isDraw() {
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                if (board.board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean checkWin(PlayingPiece piece, int row, int col) {
        boolean rowFilled = false;
        boolean colFilled = false;
        boolean DiagonalFilled = false;
        boolean reverseDiagonalFilled = false;
        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] != piece) {
                rowFilled = false;
                break;
            }
            rowFilled = true;
        }
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][col] != piece) {
                colFilled = false;
                break;
            }
            colFilled = true;
        }
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][i] != piece) {
                DiagonalFilled = false;
                break;
            }
            DiagonalFilled = true;
        }
        //reverse digonal
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][board.size - i - 1] != piece) {
                reverseDiagonalFilled = false;
                break;
            }
            reverseDiagonalFilled = true;
        }
        return rowFilled || colFilled || DiagonalFilled || reverseDiagonalFilled;
    }


    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if (board.board[row][col] == null) {
            board.board[row][col] = piece;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                if (board.board[i][j] == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board.getPieceType(i, j) + " ");
                }
            }
            System.out.println();
        }
    }


}
