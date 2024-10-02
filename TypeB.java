public class TypeB extends Thing{
    public int timeSinceLast;

    public TypeB(int row, int col){
        super(row, col);
        lab = 'b';
        timeSinceLast = 0;
    }

    protected void rightTurn(){
        super.rightTurn();
    }

    protected void leftTurn(){
        super.leftTurn();
    }

    protected void maybeTurn(){
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

    protected void step(){
        super.step();
    }

    public String toString(){
        return super.toString();
    }
}
