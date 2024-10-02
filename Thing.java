import java.util.*;

public abstract class Thing {

    protected Random rand = new Random(System.currentTimeMillis());
    public int  row, col, dir;
    // dir: 0=North, 1=East, 2=South, 3=West.
    public char lab;

    public Thing(int row, int col){
        this.row = row;
        this.col = col;
        dir = 0;
    }

    protected void rightTurn(){
        dir = (dir + 1) % 4;
    }

    protected void leftTurn(){
        dir = (dir + 3) % 4;
    }

    protected void maybeTurn(){
        int i = rand.nextInt(3);
        if (i == 1) {
            this.rightTurn();
        }
    
        if (i == 2) {
            this.leftTurn();
        }
    }
    
    protected void step(){
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    public String toString(){
        return row + " " + col + " " + lab;
    };
}