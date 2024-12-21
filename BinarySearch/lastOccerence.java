package BinarySearch;

import java.util.Scanner;

public class lastOccerence {
    
    public static int lastIdx(int arr[], int target){
        int st = 0;
        int end = arr.length - 1;
        int last = -1;

        while (st<=end) {
            int mid = st + (end -st)/2;
            if(target == arr[mid]){
                last = mid;
                st = mid +1;
            }else if( target < arr[mid]){
                end = mid-1;
                
            }else{
                st = mid+1;

            }        
        }
        return last;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int target = sc.nextInt();

        System.out.println(lastIdx(arr, target));
        
    }
    
}
