package BinarySearch;

// Problems on Binary Search
// A rotated sorted array is a sorted array on which rotation operation has been performed some
// number of times. Given a rotated sorted array, find the index of the minimum element in the array.
// Follow 0-based indexing.
// It is guaranteed that all the elements in the array are unique.
// Input :
// Array = [3, 4, 5, 1, 2]
// Output :
// 3

import java.util.Scanner;

public class rotatedBS {

    public static int minElement(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st)/2;

            if (arr[mid] >= arr[arr.length - 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
                ans = mid;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Small element idx is- "+ minElement(arr));

    }

}
