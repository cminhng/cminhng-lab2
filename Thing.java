import java.util.*;

public abstract class Thing {
    public Random rand = new Random(System.currentTimeMillis());
    public int  row, col, dir;
    public char lab;

    public Thing(int row, int col, int dir){
        this.row = row;
        this.col = col;
        this.dir = dir;
    }

    public void rightTurn(){
        dir = (dir + 1) % 4;
    }

    public void leftTurn(){
        dir = (dir + 3) % 4;
    }

    public void maybeTurn(){
        int i = rand.nextInt(3);
        if (i == 1) {
            this.rightTurn();
          }
    
          if (i == 2) {
            this.leftTurn();
          }
    }
    
    //what is this
    public void step(){
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }


    public String toString(){
        return row + " " + col + " " + lab;
    };
}