package BinarySearch;

import java.util.Scanner;

public class firstOccerence {

    public static int idxOFFirstOcc(int arr[],int target){
        int st = 0;
        int end = arr.length-1;
        int firstIdx = -1;

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(target == arr[mid]){
                firstIdx = mid;
                end = mid -1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                st = mid +1;
            }
            
        }
        return firstIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n  = sc.nextInt();
        System.out.println("Enter Array Elements");
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int target = sc.nextInt();
        int idx = idxOFFirstOcc(arr, target);
        System.out.println(idx);
    }
    
}
