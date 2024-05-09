// import components.Game;
import components.Board;

public class Main {
    public static void main(String[] args) {
        Board myBoard = new Board(3);
        myBoard.addPiece('X', new int[]{0,0});
        myBoard.addPiece('X', new int[]{0,1});
        myBoard.addPiece('X', new int[]{0,2});
        String x = myBoard.winCheck('X') ? "X has won" : "X has lost";
        System.out.println(x);
    }
}