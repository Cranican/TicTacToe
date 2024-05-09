package components;

public class Board {
    private int height;
    private int width;
    private char[][] board;

    public Board(int size) {
        this.height = size;
        this.width = size;
        this.board = new char[size][size];
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new char[height][width];
    }

    public void addPiece(char piece, int[] pos) {
        this.board[pos[0]][pos[1]] = piece;
    }

    public boolean winCheck(char player) {
        boolean verticalWin = this.verticalWin(player);
        boolean horizontalWin = this.horizontalWin(player);
        boolean diagonalWin = this.diagonalWin(player);
        return verticalWin || horizontalWin || diagonalWin;
    }

    private boolean verticalWin(char player) {
        for (int i = 0; i < this.width; i++) {
            boolean hasWon = true;
            for (int j = 0; j < this.height; j++) {
                if (this.board[width][height] != player) {
                    hasWon = false;
                    break;
                }
            }
            if (hasWon) return true;
        }
        return false;
    }

    private boolean horizontalWin(char player) {
        return false;
    }

    private boolean diagonalWin(char player) {
        return false;
    }

    @Override
    public String toString() {
        return "hey there";
    }
}
