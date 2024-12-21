package Stack;
import java.util.*;

public class blancedBracket {
    public static boolean isBalanced(String str){
        int n = str.length();
        Stack<Character>st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{
                if(st.size() ==0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));

        
    }
    
}
