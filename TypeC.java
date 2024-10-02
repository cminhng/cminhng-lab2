import java.util.Random;

public class TypeC extends TypeB{

    public TypeC(int row, int col){
        super(row, col);
        lab = 'y';
    }

    public void rightTurn(){
        super.rightTurn();
    }

    public void leftTurn(){
        super.leftTurn();
    }

    public void maybeTurn(Random rand){
        super.maybeTurn(rand);
    }

    public void step(){
        final int[] d = {1, 1, -1, -1};
        row += d[dir];
        col += d[dir];
    }

    public String toString(){
        return super.toString();
    }
}
