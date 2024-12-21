package Stack;

import java.util.Stack;

public class removeConSubSeq {
    public static int[] removeSubSeq(int arr[]){
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(st.size() == 0 || arr[i] != st.peek())  st.push(arr[i] );
            
            else if(arr[i] == st.peek()){
                if(i == n-1 || arr[i] != arr[i+1]) st.pop();

            }
        }

        int newArr[] = new int[st.size()];
        int m = st.size();
        for(int i=m-1;i>=0;i--){
            newArr[i] = st.pop();
        }
        return newArr; 
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,4,4,4,5,5,6,7,7,7,2,8};
        int result[] = removeSubSeq(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    
}
