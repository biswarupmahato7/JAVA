package Queue;

public class circularQueue {
    public static class circularQArr {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];
//add
        public void add(int val)throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is Full!");
                
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;

            }
            size++;
        }
        // remove
        public int remove() throws Exception{
           
            if(size == 0){
                throw new Exception("Queue is Empty");

            }else if(front == arr.length-1){
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }
            int val = arr[front];
            front++;
            size--;
            return val;
        }

        //peek
        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else return arr[rear];

        }

        // empty
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }else if(front <= rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }else if(rear<front){
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();

        }
    
        
    }
    public static void main(String[] args) throws Exception{
        circularQArr q = new circularQArr();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        //q.display();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.display();
        q.remove();
        q.remove();
        q.display();
        q.add(9);
        q.add(10);
        q.display();
       
        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
    
}
