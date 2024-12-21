package Queue;

import Opps.fraction;

public class arrayImp {
    public static class queueArray {
        int f = -1;
        int r = -1;
        int size =0;
        int arr[] = new int[5];
//add
        public void add(int val){
            if( r == arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            if(f == -1){
                f= r=0;
                arr[0] = val;
                
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        //remove

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size --;
            if (size == 0) { // Reset pointers when queue becomes empty
                f = -1;
                r = -1;
            }
            return x;
        }
//peek
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
            }else{
                for(int i = f; i<= r; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();

            }
          
        }
        
    }
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
    
}
