package Stack;
import java.util.*;

import java.util.Stack;

public class reverseStackRecursion {
    public static void pushAtButton(Stack<Integer>st,int top){
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty()){
           rt.push( st.pop());
        }
        st.push(top);

        while (!rt.isEmpty()) {
            st.push(rt.pop());
            
        }
        
    }
    public static void reverse(Stack<Integer>st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtButton(st, top);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size - ");
        int n = sc.nextInt();
        Stack<Integer>st = new Stack<>();
        System.out.println("Enter Elements");
       
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            st.push(a);
        }

        reverse(st);
        System.out.println(st);


    }
    
}
