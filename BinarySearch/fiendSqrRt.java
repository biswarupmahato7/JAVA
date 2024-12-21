package BinarySearch;

import java.util.Scanner;

// Find the square root of the given non negative value x. Round it off to the nearest floor integer value.
// Input: x = 4
// Output: 2
// Input: x = 11
// Output: 3

public class fiendSqrRt {

    public static int perfectSqr(int x) {
        int st = 1;
        int end = x;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;

            if (val == x) {
                return mid;
            } else if (val > x) {
                end = mid - 1;
            } else {
                st = mid + 1;
                ans = mid; //for non perfect Sqrt
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val of X");
        int x =sc.nextInt();
      
        System.out.println(  perfectSqr(x));

    }

}
