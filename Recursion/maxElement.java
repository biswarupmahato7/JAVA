package Recursion;

import java.util.Scanner;

public class maxElement {
    public static int fiendMax(int arr[] , int idx){
        if(idx == arr.length -1) return arr[idx];

        return Math.max(arr[idx], fiendMax(arr, idx + 1));
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the array size");
        int n = sc.nextInt();

        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Max Element is- "+fiendMax(arr, 0));
    }
    
}
