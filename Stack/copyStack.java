// copy a stack using same Order
package Stack;

import java.util.*;

public class copyStack {
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

        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        for(int i=1;i<=n;i++){
            int a = st.pop();
            temp.push(a);
        }
        System.out.println(temp);
        Stack<Integer> resultSt = new Stack<>();
        for(int i=1;i<=n;i++){
            int a = temp.pop();
            resultSt.push(a);
        }
        System.out.println(resultSt);
    }
    
}
