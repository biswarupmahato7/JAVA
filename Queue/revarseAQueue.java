package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revarseAQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);
        int n = qu.size();
        for(int i=0;i<n;i++){
            st.push(qu.remove());
        }

        for(int i=0;i<n;i++){
            qu.add(st.pop());
        }

        System.out.println(qu);
    }
    
}
