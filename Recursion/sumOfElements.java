package Recursion;

import java.util.Scanner;

public class sumOfElements {
    public static int sumOfDigits(int arr[], int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        return arr[idx] + sumOfDigits(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Some of digits is : "+sumOfDigits(arr, 0));
        
    }
    
}
