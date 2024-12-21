package BinarySearch;

import java.util.Scanner;

public class rotated_Duplicate_BS {

    public static boolean searchElement(int arr[], int target){
        int st = 0;
        int end = arr.length-1;
        
        while(st <= end ){
            
            int mid = st + (end - st)/2;
            if(arr[mid] == target) return true;

            if(arr[st] == arr[mid]&& arr[mid] == arr[end]){
                st++;
                end--;
            }else if(arr[mid]<= arr[end]){
                if(target<=arr[end] && target>arr[mid]){
                    st = mid +1;
                }else{
                    end = mid -1;
                }
            }else{
                if(target>= arr[st] && target< arr[mid]){
                    end = mid - 1;
                }else{
                    st = mid +1;
                }

            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(searchElement(arr, target));
    }
    
}
