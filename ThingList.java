import java.util.Random;

public class ThingList {
    private int count;
    public Node head;

    private class Node {
        Thing data;
        Node next;

        public Node(Thing thing){
            this.data = thing;
            this.next = null;
        }
    }

    public ThingList(){
        count = 0;
        head = null;
    }

    public int count(){
        return count;
    }

    private boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void addThing(Thing t){
        //case: list is initially empty
        if(this.isEmpty()){
            head = new Node(t);
        }else{
            Node it = head;
            //find tail
            while(it.next != null){
                it = it.next;
            }
            //add to tail
            it.next = new Node(t);
        }
        count++;
    }

    public void printAll(){
        //loop thru list and print all
        if(!this.isEmpty()){
            Node it = head;
            while(it.next != null){
                System.out.println(it.data.toString());
                it = it.next;
            }
        }
    }

    public void moveAll(Random rand){
        //loop thru list and move all
        if(!this.isEmpty()){
            Node it = head;
            while(it.next != null){
                it.data.maybeTurn(rand);
                it.data.step();
                it = it.next;
            }
        }
    }
}
