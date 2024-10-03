import java.util.Random;

public class TypeC extends TypeB{
    public TypeC(int row, int col){
        super(row, col);
        lab = 'm';
        timeSinceLast = 0;
    }

    public void maybeTurn(Random rand){
        int lastTurn = rand.nextInt(2);
        timeSinceLast++;
        if(timeSinceLast == 3){
            timeSinceLast = 0;
            if (lastTurn == 1) {
                this.rightTurn();
                this.step();
            }

            if (lastTurn == 2) {
                this.leftTurn();
                this.step();
            }
        }
    }
    
    public String toString(){
        return super.toString();
    }
}
