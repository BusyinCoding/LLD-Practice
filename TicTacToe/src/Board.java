public class Board {
    int size;
    PlayingPiece[][] board;
    Board(int size)
    {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public PieceType getPieceType(int row, int col)
    {
        if(board[row][col] != null)
        {
            return board[row][col].pieceType;
        }
        return null;
    }

}
