package Stack;

public class arrayImplementation {
    public static class  Stack {
        private int arr[] = new int[5];

        private int idx = 0;
/// push
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
/// peek
        int peek(){
            if(idx == 0){
                System.out.println("Empty Stack");
                return -1;
            }
            return arr[idx-1];
        }
/// pop
        int pop(){
            if(idx == 0){
                System.out.println("Empty Stack");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;

        }
// Display
        void display(){
            if(idx == 0) {
                System.out.println("Empty Stack");
            }

            for(int i=0;i<= idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
// Size
        int size(){
            return idx;
        }
//is Empty
       boolean isEmpty(){
        if(idx == 0) return true;
        else return false;
       }
//is Full
      boolean isFull(){
        if(idx == arr.length) return true;
        else return false;
      }
// is Capacity
      int isCapacity(){
        return arr.length;
      }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
       System.out.println( st.size());

        st.pop();
        st.display();
        st.push(7);
        st.push(7);
        st.display();
        System.out.println(st.peek());
        //st.push(7);
        
    }
    
}
