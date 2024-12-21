package BinarySearch;

import java.util.Scanner;

public class fiendEle {
    //  Using Recursion


    public static boolean recursiveBS(int arr[], int st, int end, int target){
        if (st > end) return false;
        int mid = st + (end - st) / 2;
        if (target == arr[mid]) return true;
        else if (target > arr[mid]) {
            return recursiveBS(arr, mid + 1, end, target);
        } else {
            return recursiveBS(arr, st, mid - 1, target);
        }
    }

    // Normal process
    public static int fiendTarget(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target) return 1;

            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;

            }
            
        }
        return -1;

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target");

        int target = sc.nextInt();
        int st = 0;
        int end = arr.length -1;
        System.out.println(fiendTarget(arr, target));
        System.out.println(recursiveBS(arr, st, end,target));
        
        
    }
    
}
