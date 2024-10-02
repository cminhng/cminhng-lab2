public class TypeC extends TypeB{

    public TypeC(int row, int col){
        super(row, col);
        lab = 'y';
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
        final int[] d = {1, 1, -1, -1};
        row += d[dir];
        col += d[dir];
    }

    public String toString(){
        return super.toString();
    }
}
