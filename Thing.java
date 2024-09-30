public abstract class Thing {
    
    public int  row, col, dir;
    public char lab;

    public Thing(int row, int col, int dir){
        this.row = row;
        this.col = col;
        this.dir = dir;
    }

    public String toString(){
        return row + " " + col + " " + lab;
    };
}