package LinkedlList;

// Finding Nth Node from the end of Linked List


public class nthNodeLast {
   
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
 // Normal method
    public static Node nThElement(Node head, int n){
        int size = 0;
        Node temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int idx = size - n;
        temp = head;

        for(int i=0; i<idx;i++){
            temp = temp.next;

        }
        return temp;
        
    }

    //Optimized Method

    public static Node nthElement2(Node head, int n){
        Node first = head;
        Node slow = head;

        for(int i=0; i<n;i++){
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(2);
        Node e = new Node(7);
        Node f = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        Node result = nThElement(a, 2);

        System.out.println("\nresult is- "+result.data);

        //optimized fun call
        Node result2 = nthElement2(a, 2);
        System.out.println("\nOptimized result is- "+result2.data);
        
    }
    
}
