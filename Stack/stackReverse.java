package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stackReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("eNTER THE STACK SIZE");
        int n = sc.nextInt();
        System.out.println("eNTER STACK ELEMENTS");

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);
        Stack<Integer> revSt = new Stack<>();

        while(st.size()>0){
            int a = st.pop();
            revSt.push(a);
        }
        System.out.println(revSt);
    }
    
}
