public class TypeA extends Thing {

    public TypeA(int row, int col, int dir){
        super(row, col, dir);
        lab = 'r';
    }

    protected void rightTurn(){
        super.rightTurn();
    }

    protected void leftTurn(){
        super.leftTurn();
    }

    protected void maybeTurn(){
        super.maybeTurn();
    }

    protected void step(){
        super.step();
    }

    public String toString(){
        return super.toString();
    }
}
