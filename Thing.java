import java.util.*;

public abstract class Thing {

    protected int row;
    protected int col;
    protected int dir;
    // dir: 0=North, 1=East, 2=South, 3=West.
    protected char lab;

    public Thing(int row, int col){
        this.row = row;
        this.col = col;
        dir = 0;
    }

    public void rightTurn(){
        dir = (dir + 1) % 4;
    }

    public void leftTurn(){
        dir = (dir + 3) % 4;
    }

    public abstract void maybeTurn(Random rand);
    
    public void step(){
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    public String toString(){
        return row + " " + col + " " + lab;
    };
}