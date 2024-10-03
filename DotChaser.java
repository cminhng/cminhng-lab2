import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    int count = 0;
    
    //create a list to hold all Things
    ThingList llist = new ThingList();

    while( true ) {
      // Every N rounds, add another typeA, typeB, typeC Thing.
      if( llist.count() % N == 0 ) {

        // Add a typeA thing to the list.
        TypeA tA = new TypeA(45, 50);
        llist.addThing(tA);

        // Add a typeB thing to the list
        TypeB tB = new TypeB(55, 50);
        llist.addThing(tB);

        // Add a typeC thing to the list
        TypeC tC = new TypeC(55, 50);
        llist.addThing(tC);
      }
      
      // Print out each thing.
      llist.printAll();
      System.out.println("done");
      System.out.flush();

      // Move each thing.
      llist.moveAll(rand);

      count++;
    }
  }
}
