package BinarySearch;

import java.util.Scanner;

public class rotatedBS_2 {

    public static int searchTarget(int arr[], int target){
        int st = 0;
        int end = arr.length-1;

        while(st<=end){
            int mid = st + (end - st)/2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] < arr[end]){ // mid to end is sorted
                if(target>arr[mid] && target<= arr[end]){
                    st = mid +1;
                }else{
                    end = mid -1;
                }
            }else{ // start to mid is sorted
                if(target>= arr[st] && target<arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
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

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(searchTarget(arr, target));

    }

    
    
}
