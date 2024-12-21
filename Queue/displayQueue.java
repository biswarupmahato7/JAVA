package Queue;

import java.util.*;

public class displayQueue {
   public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
  Queue<Integer> q2 = new LinkedList<>();

    for(int i=1;i<=4;i++){
        System.out.print(q.peek() +" ");
        int a = q.remove();
        q.add(a);
    }

   }

}
