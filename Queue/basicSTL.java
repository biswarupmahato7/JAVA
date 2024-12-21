package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1); // add in queue
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);

        System.out.println(qu.size());
        qu.remove(); // works in FIFO
      System.out.println(  qu.peek());
        System.out.println(qu.isEmpty());
    }
}
