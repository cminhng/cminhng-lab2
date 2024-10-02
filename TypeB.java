import java.util.Random;

public class TypeB extends Thing{
    public int timeSinceLast;

    public TypeB(int row, int col){
        super(row, col);
        lab = 'b';
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

        if (timeSinceLast == 10) {
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
        super.step();
    }

    public String toString(){
        return super.toString();
    }
}
