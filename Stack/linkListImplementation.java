package Stack;

public class linkListImplementation {
    public static class Node{ // user Defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Empty stack");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }
        // peek

        int peek(){
            if(head == null){
                System.out.println("Empty stack");
                return -1;
            }
            return head.val;

        }

//display
       void displayRecursive(Node h){
        if(h == null) return;
        displayRecursive(h.next);
        System.out.print(h.val+" ");
       }
        void display(){
            displayRecursive(head);
            System.out.println();
        }
        //display reverse
        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
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
        st.displayRev();
        // System.out.println(st.peek());
        
    }
    
}
