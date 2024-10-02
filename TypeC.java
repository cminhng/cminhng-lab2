import java.util.Random;

public class TypeC extends TypeB{
    public TypeC(int row, int col){
        super(row, col);
        lab = 'm';
        timeSinceLast = 0;
    }

    public void rightTurn(){
        super.rightTurn();
    }

    public void leftTurn(){
        super.leftTurn();
    }

    public void maybeTurn(Random rand){
        int i = rand.nextInt(3);
        timeSinceLast++;

        if (timeSinceLast == 2) {
            timeSinceLast = 0;

            if (i == 1) {
            this.rightTurn();
            }

            if (i == 2) {
            this.leftTurn();
            }
        }
    }
    
    public void step(){
        final int[] dr = {1, 5, -3, -1}, dc = {12, 2, -1, -11};
        row += dr[dir];
        col += dc[dir];
    }
    
    public String toString(){
        return super.toString();
    }
}
