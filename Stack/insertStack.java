package Stack;
//insert at any index
import java.util.Scanner;
import java.util.Stack;

import Recursion.sumOfElements;

public class insertStack {
    /**
     * @param args
     */
    public static void main(String[] args) {
           Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Stack size");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter stack elements");

        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println("Original\n"+st);

        System.out.println("Enter index");
        int idx = sc.nextInt();
       System.out.println("Enter the value you want to insert");
       int val = sc.nextInt();


        Stack<Integer>temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop());
                                                    
        }
        st.push(val);
     while(temp.size()>0){
        st.push(temp.pop());

     }
     System.out.println(st);
    }
    
    
}
