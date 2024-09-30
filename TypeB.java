public class TypeB extends Thing{
    public int timeSinceLast;

    public TypeB(int row, int col, int dir, int timeSince){
        super(row, col, dir);
        lab = 'b';
        timeSinceLast = timeSince;
    }

    public String toString(){
        return super.toString();
    }
}
