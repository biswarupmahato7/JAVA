package Recursion;

import java.util.Scanner;

import String.str;

public class printArray {
    public static void printArray(int arr[], int idx){
        int n = arr.length;
        if(idx == n) return ;
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("The Array is- ");

        printArray(arr, idx);
    }
    
}
