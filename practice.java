// import java.util.*;
// class prc{
//     public static void swap(int a, int b){
//     System.out.println("Before Swapping a = " +a+ " b = "+b);
//     int c = a;
//     a = b;
//     b = c;
//     System.out.println("After Swapping a = " +a+ " b = "+b); 

// }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Two Number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // swap(a, b);
//         System.out.println("Before Swapping a = " +a+ " b = "+b);

//         a = a + b;
//         b = a - b;
//         a  = a - b;

//         System.out.println("After Swapping a = " +a+ " b = "+b);

//     }
// }

// import java.util.*;

// class prc{
//     static void swap(int arr[], int i, int j){
//         int temp = arr[i];

//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void printArray(int arr[]){
//         for(int i =  0; i< arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size- ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int revArr[] = new int [size];

//         System.out.println("Enter array elements- ");
//         for(int i = 0 ;i<size ; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Before Reverse");
//         printArray(arr);

//     int j = 0;
//     for(int i = arr.length-1; i >=0 ;i--){
//         revArr[j++] = arr[i];

//     }
//     System.out.println("\nAfter reverse");
//     printArray(revArr);

//     }

// }

// import java.util.*;

// public class prc {

//     static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     static void swap(int arr[], int i, int j) {
//         int temp = arr[i];

//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void reverse(int arr[], int st, int end) {
//         while(st<end){
//             swap(arr, st, end);
//             st++;
//             end--;
//         }

//     }

//     public static int[] rotateArray(int k, int arr[]) {
//         int n = arr.length;
//         k = k % n;
//         int ans[] = new int[n];
//         int j = 0;
//         for (int i = n - k; i < n; i++) {
//             ans[j++] = arr[i];
//         }
//         for (int i = 0; i < n - k; i++) {
//             ans[j++] = arr[i];
//         }
//         return ans;

//     }

//     public static void inPlaceRotate(int k, int arr[]) {
//         int n = arr.length;
//         reverse(arr, 0, n-k-1);
//         reverse(arr, n-k, n-1);
//         reverse(arr, 0, n-1);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter array Elements");

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter how many times you want to rotate");
//         int k = sc.nextInt();

//         System.out.println("\nBefore rotation");
//         printArray(arr);

//         System.out.println("\nAfter Rotation");
//         //int ans[] = rotateArray(k, arr);
//         inPlaceRotate(k, arr);
//         printArray(arr);

//     }
// }

// import java.util.Scanner;

// class prc{
//     public static int[] makeFreq(int arr[]){
//         int freq [] = new int[10005];
//         for(int i =0; i<arr.length; i++){
//             freq[arr[i]]++;
//         }
//         return freq;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array size");
//         int size = sc.nextInt();

//         int arr[] = new int[size];
//         System.out.println("Enter the array elements");

//         for(int i =0; i <size;i++){
//             arr[i] = sc.nextInt();
//         }

//         int freq[] = makeFreq(arr);

//         System.out.println("Enter number of Query");
//         int q = sc.nextInt();

//         while (q>0) {
//             System.out.println("Enter the number you want to fiend");
//             int num = sc.nextInt();

//             if(freq[num]>0){
//                 System.out.println("yes");
//             }else{
//                 System.out.println("No");
//             }
//             q--;
//         }

//     }
// }

// import java.util.Scanner;

// /**
//  * prc
//  */
// public class prc {
//     static void printArray(int arr[] ){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");

//         }
//     }

//     static void swap (int arr[],int st, int end){
//         int temp = arr[st];
//         arr[st] = arr[end];
//         arr[end] = temp;
//     }

//     static void reverseArray(int arr[]){
//         int n = arr.length;
//         //int ans[] = new int[n];
//         int i = 0;
//         int j = n-1;

//         while (i<j) {
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//         //return ans;
//         printArray(arr);
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//          System.out.println("Enter array size");
//          int s = sc.nextInt();
//          int arr[] = new int[s];

//          System.out.println("Enter array elements");
//          for(int i=0; i<arr.length; i++ ){
//              arr[i] = sc.nextInt();
//          }

//          System.out.println("Before Reverse");
//          printArray(arr);

//          System.out.println("\nAfter Revers ");
//          reverseArray(arr);

//     }
// }

// import java.util.Scanner;

// /**
//  * prc
//  */
// public class prc {

//     static void printArray(int arr[] ){
//                 for(int i = 0; i<arr.length; i++){
//                     System.out.print(arr[i] + " ");

//                 }
//             }

//             static int[] rotateArray(int k , int arr[]){
//                 int n = arr.length;
//                 k = k % n;
//                 int ans[] =new int[n];
//                 int j = 0;
//                 for(int i = n-k; i<n; i++){
//                     ans[j++] = arr[i];
//                 }

//                 for(int i = 0; i<n-k;i++){
//                     ans[j++] = arr[i];
//                 }
//                 return ans;
//             }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//          System.out.println("Enter array size");
//          int s = sc.nextInt();
//          int arr[] = new int[s];

//          System.out.println("Enter array elements");
//          for(int i=0; i<arr.length; i++ ){
//              arr[i] = sc.nextInt();
//          }
//          System.out.println("Enter the Rotate Number");
//          int k = sc.nextInt();

//          System.out.println("Before Rotate");
//          printArray(arr);

//          int ans[] = rotateArray(k, arr);
//          System.out.println("After Rotate");
//          printArray(ans);

//     }
// }

// import java.util.Scanner;

// /**
//  * prc
//  */
// public class prc {
//     static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }
//     }

//     static void swap(int arr[], int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;

//     }
//     static void reverseArray(int arr[]){
//                 int n = arr.length;
//                 // int ans[] = new int[n];
//                 int i = 0;
//                 int j = n-1;

//                 while (i<j) {
//                     swap(arr, i, j);
//                     i++;
//                     j--;
//                 }
//                 // return ans;
//                 // printArray(arr);
//             }

//     static void sortArrayZeroOne(int arr[]){
//         int n = arr.length;
//         int count = 0;
//         int ans [] = new int[n];
//         for(int i = 0 ;i<n; i++){
//             if(arr[i] == 0) count++;
//         }

//         for(int i =0; i<n;i++){
//             if(i<count) ans[i] =0;
//             else ans[i] = 1;
//         }
//         System.out.println("Sorted array= ");
//         printArray(ans);

//     }

//     static void sortArrayZeroOne2(int arr[]){
//         int n = arr.length;
//         int left = 0;
//         int right = n-1;

//         while (left<right) {

//             if(arr[left] == 1 && arr[right] ==0){
//                 swap(arr, left, right);
//                 left++;
//                 right--;
//             }

//             if(arr[left]== 0) left++;
//             if(arr[right] == 1) right--;

//         }
//         System.out.println("\nArray is Sorted");
//         printArray(arr);
//     }

//     static void sortEvenOdd(int arr[]){
//         int n = arr.length;
//         int left = 0;
//         int right = n-1;

//         while(left<right){
//             if(arr[left] % 2 != 0 && arr[right] %2 == 0){
//                 swap(arr, left, right);
//                 left++;
//                 right--;
//             }

//             if(arr[left] %2 == 0) left++;
//             if(arr[right] % 2 != 0) right--;

//         }
//         System.out.println("\nSorted According Even and Odd");
//         printArray(arr);

//     }

//     static int[] sortSqr(int arr[]){
//         int n =arr.length;
//         int left =0 , right = n-1;
//         int ans[] = new int[n];
//         int k =0;

//         while(left<right){
//             if(Math.abs(arr[left])>Math.abs(arr[right])){
//                 ans[k++] = arr[left] * arr[left];
//                 left++;
//             }else{
//                 ans[k++] = arr[right] * arr[right];
//                 right--;
//             }
//         }
//         return ans;

//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//          System.out.println("Enter array size");
//          int s = sc.nextInt();
//          int arr[] = new int[s];

//          System.out.println("Enter array elements");
//          for(int i=0; i<arr.length; i++ ){
//              arr[i] = sc.nextInt();
//          }

//         //  sortArrayZeroOne(arr);

//         //  sortArrayZeroOne2(arr);
//         // sortEvenOdd(arr);

//         int ans[] = sortSqr(arr);
//         reverseArray(ans);
//         System.out.println("Sqr sorted array");
//         printArray(ans);

//     }
// }

// import java.util.Scanner;

// class prc{

//     static void printArray(int arr[]){
//         for(int i = 0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     static void swap(int arr[],int a ,int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     static void reverse(int arr[]){
//         int n = arr.length;
//         int i =0;
//         int j = n-1;
//         while(i<j){
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//         System.out.println("After the reverse");
//         printArray(arr);
//     }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the array size: ");
//     int size = sc .nextInt();
//     int arr[] = new int[size];
//     System.out.println("Enter the array Elements: ");
//     for(int i = 0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }
//     System.out.println("Before Reverse");
//     printArray(arr);
//     reverse(arr);

//   }
// }

// import java.util.Scanner;

// import DP.fibo;

import java.util.Scanner;

import Stack.stackReverse;
import String.str;

/**
 * prc
 */
// import java.util.Scanner;
// public class prc {
// static void printArray(int arr[]){

// for(int i = 0; i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }

// static void prefixSum(int arr[]){
// int n = arr.length;
// int pfxSum[] = new int[n];
// pfxSum[0] = arr[0];
// for(int i =1;i<n;i++){
// pfxSum[i] = pfxSum[i-1] + arr[i];
// }
// System.out.println("Prefix sum is ");
// printArray(pfxSum);

// }

// static int[] inplacePfxSum(int arr[]){
// for(int i = 1; i<arr.length;i++){
// arr[i] = arr[i] + arr[i-1];
// }
// return arr;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter array size:");
// int size = sc.nextInt();
// int arr[] = new int[size];

// System.out.println("Enter array Elements:");
// for(int i = 0;i<size;i++){
// arr[i] = sc.nextInt();

// }
// System.out.println("array is -");
// printArray(arr);

// System.out.println("Enter total no of Query");
// int q = sc.nextInt();
// int prsum[] = inplacePfxSum(arr);
// while(q-- >0){
// System.out.println("Enter range");
// int s = sc.nextInt();
// int e = sc.nextInt();
// int ans = prsum[e] - prsum[s-1];
// System.out.println(" Answer is - "+ ans);

// }

// }
// }
// class prc{
// static void printArray(int arr[]){
// for(int i=0; i<arr.length; i++){
// System.out.print(arr[i]+" ");

// }

// }

// static int findTotalSum(int arr[]){
// int totalsum =0;
// for(int i = 0;i<arr.length;i++){
// totalsum += arr[i];
// }
// return totalsum;
// }

// static boolean findSubArray(int arr[]){
// int totalsum = findTotalSum(arr);
// int prefixSum = 0;

// for(int i = 0;i< arr.length;i++){
// prefixSum += arr[i];
// int sufixSum = totalsum - prefixSum;
// if(prefixSum == sufixSum){
// return true;
// }
// }
// return false;
// }
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter array size: ");
// int size = sc.nextInt();
// int arr[] = new int[size];

// System.out.println("Enter array Elements: ");
// for(int i =0; i<size;i++){
// arr[i] = sc.nextInt();
// }

// System.out.println(findSubArray(arr));

// }
// }

// class prc{
//     public static int altSignSum(int n){
//         if(n == 0) return 0;

//         if( n % 2 == 0){
//             return altSignSum(n-1) - n;
//         }else{
//             return altSignSum(n-1)+n;
//         }
//     }
//     public static int seriesSum(int n){
//         if(n == 0) return 0;
//         return seriesSum(n-1) + n;
//     }
//     public static int fibo(int n){
//         if(n == 0 || n == 1) return n;
//         return fibo(n-1) + fibo(n-2);
//     }

//     public static void table(int n , int k) {
//         if(k == 1){
//             System.out.println(n);
//             return;
//         } 
//         table(n, k-1);
//         System.out.println(n*k);

//     }
//     //power-1
//     public static int powOfNum(int p, int q){
//         if(q == 0) return 1;

//         int smallPow = pow(p, q/2);
//         if(q % 2 == 0) {
//             return smallPow * smallPow;
//         }else{

//             return p * smallPow * smallPow;
//         }
//     }
//     // power -2 
//     public static int pow(int p , int q){
//         if(q == 0) return 1;
//         return pow(p,q-1) * p;
//     }
//     public static int countOfDegits (int n){
//         if(n/10 == 0) return 1;
//         return countOfDegits(n/10)+1;
//     }
//     public static int sumOfDegits(int n){
//         if(n>=0 && n<=9) return n;

//         return sumOfDegits(n/10) + sumOfDegits(n%10);
//     }
//     // public static int fibo(int n ){
//     //     if( n == 0 || n == 1) return n;
//     //      return fibo(n-1 ) + fibo(n -2);
//     // }
//     public static int factorial(int n ){
//         if(n == 0 ) return 1;

//         int val = factorial(n-1);
//         return n * val;

//     }
//     public static void printDec(int n ){
//         if(n == 1){
//             System.out.println("1");
//             return;

//         }

//         System.out.println(n);
//         printDec(n-1);
//     }
//     public static void printInc(int n ){
//         if(n == 1){
//             System.out.println("1");
//             return;
//         }

//         printInc(n-1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // printInc(n);

//         // printDec(n);
//         // System.out.println(factorial(n));

//         // System.out.println(sumOfDegits(12345));
//         // System.out.println(countOfDegits(1204));

//         // System.out.println(pow(5, 4));

//         // System.out.println(powOfNum(5, 4));
//     //    table(5, 6);
//     // System.out.println(fibo(6));
//     // System.out.println(seriesSum(8));
//     System.out.println(altSignSum(4));

//     }
// }
// import java.util.Scanner;

// /**
//  * prc
//  */
// public class prc {
//     // recursive
//     public static boolean recursiveBs(int arr[], int st, int end ,int target){
//         if(st>end) return false;
//         int mid = st + (end -st)/2;
//         if(target == arr[mid]) return true;
//         if(target < arr[mid]){
//             return recursiveBs(arr, st, mid-1, target);
//         }else{
//             return recursiveBs(arr, st+1, end, target);
//         }
//     }

//     // iterative 
//     static  boolean fiendTarget(int arr[],int target){
//         int st = 0;
//         int end = arr.length -1;

//         while(st<=end){
//             int mid  = st +(end - st) /2;
//             if(arr[mid] == target) return true;
//             if(target<arr[mid]){
//                 end = mid -1;
//             }else{
//                 st = mid+1;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size: ");
//         int n =sc.nextInt();
//         System.out.println("Enter array elements");
//         int arr[] =new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] =sc.nextInt();
//         }

//         System.out.println("Enter target");
//         int target = sc.nextInt();
//         System.out.println(fiendTarget(arr, target));

//         System.out.println(recursiveBs(arr, 0, arr.length-1, target));

//     }
// }

// 

/**
 * prc
 */
// public class prc {

//     public static void multiples(int n, int k){
//         if(k == 0) return;
//         multiples(n, k-1);

//         System.out.println(n*k);
//     }

//     public static int sod(int n){
//         if(n == 0) return 0;
//         return sod(n-1) +n;

//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         // System.out.println("Enter the value of n & k");
//         // int n = sc.nextInt();
//         // int k = sc.nextInt();

//         // multiples(n, k);

//         int num = 5;
//         System.out.println(sod(num));
//     }
// }

/**
 * prc
 */

// public class prc {
//     public static int altSignSum(int n){
//         if(n == 0) return 0;
//         if(n % 2 == 0){
//             return altSignSum(n-1) - n;

//         }else{
//             return altSignSum(n-1) + n;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of N");

//         int n = sc.nextInt();
//         System.out.println(altSignSum(n));
//     }
// }

// class prc{
//     public static int igcd(int x, int y){
//         while (x%y != 0 ) {
//             int reminder = x % y;
//             x = y;
//             y = reminder;

//         }
//         return y;
//     }

//     public static int gcd(int x, int y){
//         if(y == 0) return x;
//         return gcd(y, x % y);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new  Scanner(System.in);
//         System.out.println("Enter the value of X & Y");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(igcd(x, y));
//         System.out.println(gcd(x, y));
//     }
// }

/**
 * prc
 */

/**
 * prc
 */

//  public class prc {

//     public static int igcd(int x, int y){
//         while(x % y != 0){
//             int reminder = x % y;
//             x = y;
//             y = reminder;
//         }
//         return y;
//     }

//     public static int gcd(int x, int y){
//         if( y == 0) return x;
//         return gcd(y, x % y);
//     }

//     public static int Lcm(int x, int y){
//         if(y == 0) return x;
//         int gcd = gcd(x,y);
//         return (x * y)/gcd;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Value of X & Y: ");
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         // System.out.println(igcd(x, y));
//         System.out.println("Recursive Gcd- "+ gcd(x, y));
//         System.out.println("Lcm- "+ Lcm(x, y));
//     }
//  }

// class prc{
//     public static boolean fiendElement(int arr[], int target){
//         int st = 0;
//         int end = arr.length-1;

//         while(st <= end){
//             int mid = st + (end - st)/2;
//             if(arr[mid] == target) return true;

//             if(arr[st] == arr[mid] && arr[mid] == arr[end]){
//                 st++;
//                 end--;
//             }else if(arr[mid] <= arr[end]){ //2nd part sorted
//                 if(target > arr[mid] && target <= arr[end]){
//                     st = mid + 1;
//                 }else{
//                     end = mid -1;
//                 }
//             }else{
//                 if(target >= arr[st] && target < arr[mid]){
//                     end = mid -1;
//                 }else{
//                     st = mid + 1;
//                 }
//             }

//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size: ");
//         int n = sc.nextInt();

//         int arr [] = new int[n];

//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter target elements");
//         int target = sc.nextInt();

//         System.out.println(fiendElement(arr, target));
//     }
// }

/**
 * prc
 */

// public class prc {
//     public static void swap(int arr[], int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for(int i =0; i< n-1;i++){
//             boolean flag = false;
//             for(int j = 0; j< n-i-1; j++){
//                 if(arr[j]<arr[j+1]){
//                     swap(arr, j, j+1);
//                     flag = true;
//                 }
//                 if(flag == false) return;

//             }
//         }

//     }

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size: ");

//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter array elements");
//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         bubbleSort(arr);
//         for(int el:arr){
//             System.out.print(el+" ");
//         }
//      }
// }

// class prc{
//     public static void swap(int arr[], int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i<n-1; i++){
//             boolean flag =false;
//             for(int j = 0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     swap(arr, j, j + 1);
//                     flag = true;
//                 }
//             }
//             if(flag == false) return;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array Size");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter array elements: ");
//         for(int i = 0; i<n ;i++){
//             arr[i] = sc.nextInt();
//         }

//         bubbleSort(arr);
//         for(int el: arr){
//             System.out.print(el +" ");
//         }
//     }
// }

/**
 * prc
 */
// public class prc {
//     public static void swap(int arr[], int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void selectionSort(int arr[]){
//         int n = arr.length;

//         for(int i =0; i<n-1; i++){
//             int min_idx = i;
//             for(int j = i+1; j<n; j++){
//                 if(arr[j]<arr[min_idx]){
//                     min_idx = j;
//                 }
//             }
//             swap(arr, i, min_idx);
//         }
//     }

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter array  elements: ");
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         selectionSort(arr);
//         for(int el: arr){
//             System.out.print(el+" ");
//         }
//      }
// }

/**
 * prc
 */

// 
/**
 * prc
 */

// public class prc {
//     public static void swap(int arr[],int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void selectionSort(int arr[]){
//         int n = arr.length;
//         for(int i =0; i<n-1;i++){
//             int min_idx = i;

//             for(int j = i+1; j<n;j++){

//                 if(arr[j]<arr[min_idx]) {
//                     min_idx = j;

//                 }

//             }

//             if(min_idx != i){

//                 swap(arr,i,min_idx);
//             }

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         selectionSort(arr);

//         for(int el: arr){
//             System.out.print(el+ " ");
//         }

//     }
// }

/**
 * prc
 */
// public class prc {

//     public static void swap(int arr[], int a,int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void insertionSort(int arr[]){
//         int  n = arr.length;
//         for(int i =1; i<n; i++){
//             int j = i;
//             while (j>0 && arr[j]<arr[j-1]) {
//                 swap(arr, j, j-1);
//                 j--;

//             }
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter array elements: ");
//         for(int i =0; i< n;i++){
//             arr[i] = sc.nextInt();
//         }

//         insertionSort(arr);

//         for(int el : arr){
//             System.out.print(el+" ");
//         }
//     }
// }

/**
 * prc
 */
// public class prc {
//     public static void swap(int arr[],int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }
//     public static void insertionSort(int arr[]){
//         int  n = arr.length;

//         for(int i =1; i<n-1;i++){
//             int j = i;
//             while(j>0 && arr[j]< arr[j-1]){
//                 swap(arr, j, j-1);
//                 j--;

//             }

//         }
//     }

//      public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter array size:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter array elements");

//         for(int i =0 ; i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         insertionSort(arr);

//         for(int el:arr){
//             System.out.print(el+" ");

//         }

//      }
// }

// public class prc {
//     public static void swap(int arr[], int a,int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;

//     }
//     public static void insertion_sort(int arr[]){
//         int n = arr.length;

//         for(int i =1; i<n; i++){
//             int j = i;
//             while (j>0 && arr[j]<arr[j-1]) {
//                 swap(arr, j, j-1);
//                 j--;

//             }

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array  Size");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter array elements");

//         for(int i = 0; i<n; i++){
//             arr[i]= sc.nextInt();
//         }

//         insertion_sort(arr);

//         for(int el : arr){
//             System.out.print(el +" ");
//         }
//     }
// }

/**
 * prc
 */
// public class prc {
//     public static void swap(int arr[], int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void selectionSort(int arr[]){
//         int n = arr.length;
//         for(int i =0; i<n-1; i++){
//             int min_idx = i;

//             for(int j = i+1; j<n ; j++){
//                 if(arr[j]<arr[min_idx]){
//                     min_idx = j;
//                 }
//             }
//             swap(arr,i,min_idx);
//         }
//     }

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n = sc . nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter the array elements: ");

//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         selectionSort(arr);

//         for(int el: arr){
//             System.out.print(el+" ");
//         }

//      }
// }

/**
 * prc
 */

// public class prc {
//         public static void swap(int arr[], int a, int b){
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for(int i =0; i<n-1; i++){
//             boolean flag = false;
//             for(int j = 0 ; j<n-1;j++){

//                 if(arr[j] > arr[j+1]){
//                     swap(arr, j, j+1);
//                     flag = true;
//                 }

//             }
//             if(flag == false) return;
//         }

//     }

//      public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the size of array");
//                 int n = sc . nextInt();

//                 int arr[] = new int[n];
//                 System.out.println("Enter the array elements: ");

//                 for(int i = 0; i<n; i++){
//                     arr[i] = sc.nextInt();
//                 }
//                 bubbleSort(arr);

//                 for(int el: arr){
//                     System.out.print(el+" ");
//                 }

//              }

// }

/**
 * prc
 */
// public class prc {

//     public static void swap(int arr[], int a, int b){
//                 int temp = arr[a];
//                 arr[a] = arr[b];
//                 arr[b] = temp;
//             }

//             public static void insertion_sort(int arr[]){
//                 int n = arr.length;

//                 for(int i = 1; i<n; i++){
//                     int j = i;

//                     while (j>0 &&  arr[j] < arr[j -1] ) {
//                         swap(arr,j,j-1);
//                         j--;

//                     }
//                 }

//             }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the size of array");
//                 int n = sc . nextInt();

//                 int arr[] = new int[n];
//                 System.out.println("Enter the array elements: ");

//                 for(int i = 0; i<n; i++){
//                     arr[i] = sc.nextInt();
//                 }
//                 insertion_sort(arr);

//                 for(int el: arr){
//                     System.out.print(el+" ");
//                 }

//              }

//     }

/**
 * prc
 */

// public class prc {
//   public static void swap(int arr[], int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;

//   }

//   public static void moveZero(int arr[]){
//     int n = arr.length;

//     for(int i=0; i<n-1; i++){
//       boolean flag = false;
//       for(int j =0; j<n-i-1;j++){
//         if(arr[j] == 0 && arr[j+1] != 0){
//           swap(arr, j, j+1);
//           flag = true;
//         }
//       }

//       if(!flag) return ;
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size: ");
//     int n = sc.nextInt();

//     System.out.println("Enter array  elements ");
//     int arr[] = new  int[n];
//     for(int i =0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     moveZero(arr);

//     for(int el : arr){
//       System.out.print(el + " ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void swap(String str[], int a, int b){
//     String temp = str[a];
//     str[a] = str[b];
//     str[b] = temp;

//   }

//   public static void strSort(String str[]){
//     int n = str.length;

//     for(int i = 0; i< n ; i++){
//       int min_idx = i;
//       for(int j = i+1; j<n ;j++){

//         if(str[j].compareTo(str[min_idx]) < 0){
//           min_idx = j;

//         }
//       }

//       swap(str, i, min_idx);

//     }
//   }

//   public static void main(String[] args) {
//     String str[] = {"apple" , "cat", "bat", "dog" ,"zoom","ab"};
//     strSort(str);

//     for(String el: str){
//       System.out.println(el + " ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void marge(int arr[], int st, int mid, int end){
//     int n1 = mid - st + 1;
//     int n2 = end -mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i = 0;i<n1;i++) left[i] = arr[st+i];
//     for(j=  0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while (i<n1 && j<n2) {
//       if(left[i] < right[j]){

//         arr[k++] = left[i++];
//       }
//       else{
//         arr[k++] = right[j++];
//       } 
//     }

//     while (i<n1) {
//       arr[k++] = left[i++];

//     }

//     while (j<n2) {
//       arr[k++] = right[j++];

//     }

//   }

//   public static void marge_sort(int arr[], int st ,int end){

//     if (st >= end) return;
//     int mid = st + (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("ENTER Array size: ");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements: ");

//     for(int i = 0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);

//     for(int el: arr){
//       System.out.print(el+" ");
//     }

//   }
// }

// class prc{

//   public static void marge(int arr[],int st, int mid,int end){
//     int n1 = mid - st + 1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for( i =0; i<n1; i++) left[i] = arr[st+i];
//     for(j = 0; j<n2;j++) right[j] = arr[mid+1+j];

//     i = 0;
//     j = 0;
//     k = st;

//     while (i<n1 && j<n2) {
//       if(left[i] < right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }

//     }

//     while (i<n1) {
//       arr[k++] = left[i++];

//     }

//     while(j<n2){
//       arr[k++] = right[j++];
//     }
//   }

//   public static void marge_sort(int arr[],int st,int end){
//     if (st == end ) return;
//     int mid = st+(end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);

//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("Enter the size of array:");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter The Array elements: ");

//     for(int i =0; i<n; i++){
//       arr[i] =  sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);

//     for(int el:arr){
//       System.out.println(el+ " ");
//     }
//   }
// }

/**
 * prc
 */

// public class prc {
//   public static void swap(int arr[], int a, int b){
//     int temp = arr[a];
//      arr[a] = arr[b];
//      arr[b] = temp;
//   }

//   //partition
//   public static int partition(int arr[],int st, int end){
//     int pivot = arr[st];
//     int count = 0;

//     for(int i = st+1; i<=end;i++){
//       if(arr[i] <= pivot){
//         count++;
//       }
//     }

//     int pivotIdx = st+count;
//     swap(arr, st, pivotIdx);

//     int i =st, j = end;

//     while(i<pivotIdx && j>pivotIdx){
//       while(arr[i] < arr[pivot]) i++;
//       while(arr[j] > arr[pivot]) j--;

//       if(i<pivotIdx && j>pivotIdx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
//     }
//     return pivotIdx;

//   }

//   public static void quickSort(int arr[], int st ,int end){
//     if(st >= end) return;
//     int pi = partition(arr,st,end);

//     quickSort(arr, st, pi-1);
//     quickSort(arr, pi+1, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array size: ");
//     int n = sc.nextInt();

//     int arr[] = new int[n];

//     System.out.println("Enter array elements:");
//     for(int i =0; i<n;i++){
//       arr[i] = sc.nextInt(); 
//     }

//     quickSort(arr, 0, n-1);
//     for(int el:arr){
//       System.out.print(el+ " ");
//     }

//   }
// }

/**
 * prc
 */

// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[st];
//     int count = 0;

//     for(int i=st+1; i<=end;i++){
//       if(pivort>=arr[i]) count++;
//     }

//     int piv_idx = st + count;
//     swap(arr, st, piv_idx);
//     int i =st, j = end;
//     while (i<piv_idx && j>piv_idx) {
//       while(arr[i] <= pivort){
//         i++;
//       }

//       while(arr[j] > pivort){
//         j--;
//       }

//       if(i<piv_idx && j>piv_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }

//     }

//     return piv_idx;

//   }

//   public static void quickSort(int arr[],int st, int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);

//     quickSort(arr, st, pi-1);
//     quickSort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("Enter array size");
//     int n =sc.nextInt();
//     int arr[] = new  int[n];
//     System.out.println("Enter array size");

//     for(int i =0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quickSort(arr, 0, n-1);

//     for(int el :arr){
//       System.out.print(el+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void display(Node head){
//     Node temp = head;
//     while(temp != null){
//       System.out.print(temp.data+" ");
//       temp = temp.next;
//     }

//   }

//   public static void displayRic(Node head){
//     if(head == null) return;
//     System.out.print(head.data+" ");
//     displayRic(head.next);

//   }

//   public static int length(Node head){
//     int count = 0;
//     while (head != null) {
//       count++;
//       head = head.next;

//     }
//     return count;
//   }

//   //--------------
//   public static int lengthRic(Node head){

//     if (head == null) return 0;

//     return 1+lengthRic(head.next);

//   }
//   public static class Node{
//     int data;
//     Node next;

//     Node(int data){
//       this.data = data;

//     }

//   }

//    public static void main(String[] args) {

//     Node a = new Node(4);
//     Node b = new Node(5);
//     Node c = new Node(6);
//     Node d = new Node(8);
//     Node e = new Node(7);

//     // System.out.println(a.data);
//     a.next = b;
//     b.next = c;
//     c.next = d;
//     d.next = e;

//     display(a);
//     System.out.println();
//     displayRic(a);
//     System.out.println();
//     System.out.println("Length is - "+length(a));
//     System.out.println("Ric Length - "+lengthRic(a));

//    }
// }

//-------------------------------------------- LINKED LIST ------------------------------------------------------------------

// public class prc {
//   public static class Node {
//     int data;
//     Node next;

//     Node(int data){
//       this.data = data;

//     }

//   }

//   public static class linkedList {

//     Node head = null;
//     Node tail = null;

//     //insert at Staart

//     void insertAtStart(int data){
//       Node temp = new Node(data);
//       if(head == null){
//         head = tail =  temp;
//       }else{
//         temp.next = head;
//         head = temp;
//       }
//     }

//     void insertAtEnd(int data){
//       Node temp = new Node(data);

//       if(head == null){
//         head = temp;
//       }else{
//         tail.next = temp;
//       }
//         tail = temp;
//     }

//     void insertAt(int idx, int data){
//       Node t =  new Node(data);
//       Node temp = head;

//       if(idx == size()){
//         insertAtEnd(data);
//         return;
//       }else if(idx==0){
//         insertAtStart(data);
//         return;
//       }else if(idx<0 || idx>size()){
//         System.out.println("Invalid index");
//       }

//       for(int i=0;i< idx-1;i++){
//         temp = temp.next;

//       }
//       t.next = temp.next;
//       temp.next = t;
//     }

//     int getAt(int idx){
//       Node temp = head;

//       for(int i =0; i<idx; i++){
//         temp = temp.next;
//       }
//       return temp.data;

//     }

//     //Delete

//     void deleteAt(int idx){
//       if(idx == 0){
//         head = head.next;
//         return;
//       }
//       Node temp = head;
//       for(int i = 0; i<idx-1;i++){
//         temp = temp.next;
//       }
//       if(size()-1 == idx) tail = temp;
//       temp.next = temp.next.next;
//     }

//     void display(){
//       Node temp = head;

//       while (temp != null) {
//         System.out.print(temp.data+" ");
//         temp = temp.next;

//       }
//     }

//     int size(){
//       Node temp = head;
//       int count = 0;
//       while(temp != null){
//         count++;
//         temp = temp.next ;
//       }
//       return count;
//     }

//   }

//    public static void main(String[] args) {
//     linkedList li = new linkedList();
//     li.insertAtEnd(3);
//     li.insertAtEnd(4);
//     li.insertAtEnd(6);
//     li.insertAtEnd(9);
//     li.insertAtStart(7);
//     li.insertAt(2, 12);
//     li.insertAt(0, 32);

//     li.display();
//    // System.out.println("Size is- "+li.size());
//    //System.out.println("Element is - "+ li.getAt(3));
//    System.out.println("\nTail is- "+li.tail.data);
//    System.out.println();
//    li.deleteAt(0);
//    li.display();
//    System.out.println("\nTail is- "+li.tail.data);

//    }
//
//--------------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * prc
 */
// public class prc {

//   public static void marge(int arr[],int st,int mid,int end){
//     int n1 = mid-st+1;
//     int n2 = end-mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++){
//       left[i] = arr[st + i];
//     }
//     for(j=0;j<n2;j++){
//       right[j] = arr[mid+1+j];
//     }

//     i=0;
//     j=0;
//     k=st;

//     while (i<n1 && j<n2) {
//       if(left[i]<= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }

//     }

//     while (i<n1) {
//       arr[k++] = left[i++];

//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }

//   }

//   public static void margeSort(int arr[],int st, int end){
//     if(st>=end) return;

//     int mid = st + (end -st)/2;
//     margeSort(arr, st, mid);
//     margeSort(arr, mid + 1, end);
//     marge(arr, st, mid, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new  Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i =0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     margeSort(arr, 0, n-1);

//     for (int i : arr) {
//       System.out.print(i+" ");

//     }

//   }
// }

// class prc{
//   public static void marge(int arr[],int st,int mid ,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while (i<n1 && j<n2) {
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }

//     }
//     while (i<n1) {
//       arr[k++] = left[i++];

//     }
//     while (j<n2) {
//       arr[k++] = right[j++];

//     }

//   }
//   public static void margeSort(int arr[],int st,int end){
//     if(st>=end) return;
//     int mid = st + (end-st)/2;
//     margeSort(arr, st, mid);
//     margeSort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[]= new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     margeSort(arr, 0, n-1);

//     for(int i : arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static class Node{
//     int data;
//     Node next;

//     public Node(int data){
//       this.data = data;

//     }
//   }

//   public static class linkedList{
//     Node head = null;
//     Node tail = null;
//     int size = 0;
// //Display
//     void display(){
//       Node temp = head;
//       while(temp != null){
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//       }
//     }
// //insert At start
//     void insertAtStart(int data){
//       Node temp = new Node(data);
//       if(head==null) {
//         head = tail = temp;
//       }else{
//         temp.next = head;
//         head = temp;
//       }
//       size++;
//     }

//     //insert at end

//     void insertAtEnd(int data){
//       Node temp = new Node(data);
//       if(head == null){
//         head = tail = temp;
//       }else{
//         tail.next = temp;
//         tail = temp;
//       }
//       size++;

//     }
//  // insert At Any index

//     void insertAt(int idx,int data){
//       Node t = new Node(data);
//       Node temp = head;

//       if(idx == size){
//         insertAtEnd(data);
//         return;
//       }else if(idx == 0){
//         insertAtStart(data);
//         return;
//       }

//       for(int i = 0; i<idx-1; i++){
//         temp = temp.next;

//       }
//       t.next = temp.next;
//       temp.next = t;
//       size++;
//     }

//     //Delete at any idx

//     void deleteAt(int idx){

//       if(idx == 0){
//         head = head.next;
//         size--;
//         return;
//       }
//       Node temp = head;
//       for(int i=0;i<idx-1;i++){
//         temp = temp.next;
//       }
//       temp.next = temp.next.next;
//       tail = temp;
//       size--;
//     }

//     //get element at any idx

//     int getNodeAt(int idx){
//       Node temp = head;
//       for(int i=0; i< idx ; i++){
//          temp = temp.next;
//       }
//       return temp.data;
//     }

//   }

//   public static void main(String[] args) {
//     linkedList li = new linkedList();
//     li.insertAtStart(2);
//     li.insertAtStart(5);
//     li.insertAtEnd(7);
//     li.insertAtEnd(18);
//     li.display();
//     li.insertAt(0, 9);
//     System.out.println();
//     li.display();
//     li.deleteAt(0);
//     System.out.println();
//     li.display();
//     System.out.println(li.size);
//     System.out.println();
//     System.out.println("Element is idx-" +li.getNodeAt(2));
//     // System.out.println(li.tail.data);

//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void marge(int  arr[],int st ,int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j <n2){

//       if(left[i]<= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }

//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];

//     }
//   }

//   public static void margesort(int arr[], int st, int end){

//     if(st>=end) return;
//     int mid = st + (end - st)/2;
//     margesort(arr, st, mid);
//     margesort(arr, mid+1, end);
//     marge(arr,st,mid,end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Array size:");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter Array elements:");

//     for(int i = 0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     margesort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i= st + 1; i<arr.length;i++){
//       if(arr[i]<= pivort){
//         count++;
//       }
//     }

//     int pivort_idx = st + count;
//     swap(arr, st, pivort_idx);

//     int i = st;
//     int j = end;

//     while (i < pivort_idx && j> pivort_idx) {
//       while(arr[i] <= pivort){
//         i++;
//       }
//       while(arr[j]>pivort){
//         j--;
//       }
//       if(i<pivort_idx  && j> pivort_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }

//     }
//     return pivort_idx;

//   }

//   public static void quick_sort(int arr[], int st,int end){
//     if(st>=end) return;

//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//      System.out.println("Enter array size");
//      int n = sc.nextInt();

//      int arr[] = new int[n];
//      System.out.println("Enter array elements");

//      for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();

//      }

//     quick_sort(arr, 0, n-1);

//     for(int i: arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {
//   //swap
//   public static void swap(int arr[], int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   //partition
//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[st];
//     int count = 0;

//     for(int i=st+1; i<arr.length;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }

//     int pivort_idx = st + count;

//     swap(arr,st,pivort_idx);

//     int i =st;
//     int j = end;

//     while(i< pivort_idx && j>pivort_idx){
//       while (arr[i]<pivort) {
//         i++;

//       }
//       while(arr[j]>pivort){
//         j--;
//       }

//       if(i<pivort_idx && j>pivort_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
//     }
//     return pivort_idx;
//   }

//   public static void quick_sort(int arr[], int st, int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr,st,pi-1);
//     quick_sort(arr,pi+1,end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0 ;i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static int recursiveBS(int arr[],int st,int end,int target){
//     if(st>end) return -1;
//     int mid = st + (end - st)/2;
//     if(arr[mid]==target) return mid;

//     else if(target<arr[mid]){
//       return recursiveBS(arr, st, mid-1, target);
//     }else{
//       return recursiveBS(arr, mid+1, end, target);
//     }
//   }

//   public static int binarySearch(int arr[],int target){
//     int st = 0;
//     int end = arr.length-1;
//     while(st<=end){
//       int mid = st +(end-st)/2;
//       if(arr[mid] == target) return mid;

//       if(target<arr[mid]){
//         end = mid -1;
//       }else{
//         st = mid +1;
//       }
//     }
//     return -1;

//   }

//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//       System.out.println("Array size");
//       int n = sc.nextInt();
//       int arr[] = new int[n];

//       System.out.println("Enter array elements");
//       for(int i=0; i<n;i++){
//         arr[i] = sc.nextInt();
//       }
//       System.out.println("Enter target");
//       int target = sc.nextInt();

//       System.out.println(binarySearch(arr, target));
//       System.out.println("recursive BS - " + recursiveBS(arr, 0, n-1, target));
//    }
// }

/**
 * prc
 */

// public class prc {

//   public static int rBS(int arr[],int st,int end,int target){
//     if(st> end) return -1;
//     int mid = st +(end - st)/2;
//     if(arr[mid] == target) return mid;
//     else if(target<arr[mid]){
//       return rBS(arr, st, mid-1, target);
//     }else{
//       return rBS(arr, mid+1, end, target);
//     }

//   }
//   public static int bs(int arr[],int target){
//     int st = 0;
//     int end = arr.length-1;

//     while(st<= end){
//       int mid = st + (end -st)/2;
//       if(arr[mid] ==  target) return mid;
//       else if(target<arr[mid]){
//         end = mid -1;
//       }else{
//         st = mid +1;
//       }
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i =0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter target: ");
//     int target = sc.nextInt();
//     System.out.println(bs(arr, target));
//     System.out.println("Recursive- "+ rBS(arr, 0, n-1, target));

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i=st+1; i<= end; i++){
//       if(arr[i]<= pivort) count++;
//     }

//     int pivort_idx = st + count;
//     swap(arr, st, pivort_idx);

//     int i = st;
//     int j = end;

//     while (i< pivort_idx && j>pivort_idx) {
//       while (arr[i] <= pivort) {
//         i++;
//       }
//       while(arr[j]> pivort){
//         j--;
//       }
//       if(i<pivort_idx && j>pivort_idx){
//         swap(arr,i,j);
//         i++;
//         j--;
//       }

//     }
//     return pivort_idx;

//   }
//   public static void quick_sort(int arr[],int st,int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr,0,n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i=st+1;i<=end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }
//     int piv_idx = st+count;
//     swap(arr,st,piv_idx);

//     int i =st;
//     int j = end;

//     while(i<piv_idx && j>piv_idx){
//       while(arr[i]<=pivort){
//         i++;
//       }
//       while(arr[j] > pivort){
//         j--;
//       }

//       if(i<piv_idx && j>piv_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
//     }
//     return piv_idx;
//   }

//   public static void quick_sort(int arr[],int st,int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */

// public class prc {
//   public static void marge(int arr[], int st, int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i] < right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }

//   }

//   public static void marge_sort(int arr[],int st, int end){
//     if(st>=end) return;

//       int mid = st + (end -  st)/2;
//       marge_sort(arr, st, mid);
//       marge_sort(arr, mid+1, end);
//       marge(arr, st, mid, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n ;i++){
//       arr[i] = sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */

// public class prc {
//   public static void marge(int arr[], int st,int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;
//     while(i<n1 && j<n2){
//       if(left[i] < right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }
//   }

//   public static void marge_sort(int arr[], int st, int end){
//     if(st>=end) return;
//     int mid = st+(end-st)/2;

//     marge_sort(arr, st, mid);
//     marge_sort(arr,mid+1, end);
//     marge(arr, st, mid, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n ;i++){
//       arr[i] = sc.nextInt();
//     }
//     marge_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[], int a, int b) {
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[], int st, int end) {
//     int pivort = arr[st];
//     int count = 0;
//     for (int i = st + 1; i <= end; i++) {
//       if (arr[i] < pivort) {
//         count++;
//       }
//     }

//     int piv_idx = st + count;
//     swap(arr, st, piv_idx);

//     int i = st;
//     int j = end;

//     while (i < piv_idx && j > piv_idx) {
//       while (arr[i] <= pivort) {
//         i++;
//       }
//       while (arr[j] > pivort) {
//         j--;
//       }

//       if (i < piv_idx && j > piv_idx) {
//         swap(arr, i, j);
//         i++;
//         j--;

//       }
//     }
//     return piv_idx;

//   }

//   public static void quick_sort(int arr[], int st, int end) {
//     if (st >= end)
//       return;
//     int pi = partition(arr, st, end);

//     quick_sort(arr, st, pi - 1);
//     quick_sort(arr, pi + 1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();

//     }

//     quick_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   }
// }

// class prc{
//   public static void swap(int arr[], int a , int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count =0;
//     for(int i=st+1;i<=end;i++){
//       if(arr[i]<= pivort){
//         count++;
//       }
//     }

//     int piv_idx = st+count;
//     swap(arr, st, piv_idx);

//     int i=st;
//     int j = end;
//     while (i<piv_idx && j>piv_idx) {
//       while (arr[i]<= pivort) {
//         i++;
        
//       }
//       while(arr[j]>pivort){
//         j--;
//       }

//       if(i<piv_idx && j>piv_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
      
//     }
//     return piv_idx;

//   }
//   public static void quick_sort(int arr[],int st, int end){
//     if(st>=end) return ;
//     int pi = partition(arr, st, end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Array size: ");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter Array Elements");
//     for(int i=0;i<n;i++){
//       arr[i] =sc.nextInt();
//     }
    
//     quick_sort(arr, 0, n-1);

//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */

 /**
  * prc
  */

//  public class prc {
//   public static void swap(int arr[],int a ,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void bubbleSort(int arr[]){
//     int n = arr.length;
//     boolean flag = false;

//     for(int i=0;i<n-1;i++){
//       for(int j=0; j<n-i-1;j++){
//         if(arr[j] > arr[j+1]){
//           swap(arr,j,j+1);
//           flag = true;
//         }

//       }
//       if(flag == false) return ;
//     }
//   }
 
//   public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println("Enter array size:");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements: ");

//     for(int i=0; i<n ;i++){
//       arr[i] =sc.nextInt();
//     }

//     bubbleSort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
//  }


// class prc{
//   //Recursion
//   public static boolean RecBS(int arr[],int st,int end, int target){

//     if(st>end) return false;
//     int mid = st + (end - st)/2;
    
//     if(arr[mid] == target) return true;
//     else if(target < arr[mid]){
//       return RecBS(arr, st, mid-1, target);
//     }else{
//       return RecBS(arr, mid+1, end, target);
//     }
//   }
//   public static int binarySearch(int arr[],int target){
//     int st =0;
//     int end = arr.length-1;

//     while(st <= end){
//       int mid = st + (end - st)/2;
//       if(arr[mid] == target) return mid;
//       else if(target < arr[mid]){
//         end = mid -1;
//       }else{
//         st = mid + 1;
//       }
//     }
//     return -1;

//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int  arr[] = {1,2,3,4,5};
//     System.out.println("Enter target");
//     int target = sc.nextInt();

//     System.out.println("Result is - "+binarySearch(arr, target));
//     System.out.println("Recursion BS - "+ RecBS(arr, 0, arr.length-1, target));
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void bubble_sort(int arr[]){
  
//     int n = arr.length;
//     for(int i =0; i<n-1;i++){
    
//       boolean flag = false;
//       for(int j =0; j<n-i-1; j++){
//         if(arr[j] > arr[j+1]){
//           swap(arr,j,j+1);
//           flag = true;
//         }
//       }
//       if(flag == false){
//         return;
//       }
//     }
//   }

//   public static void selectionSort(int arr[]){
//     int n = arr.length;
//     for(int i =0;i<n-1;i++){
//       int min_idx = i;
//       for(int j = i+1;j<n;j++){
//         if(arr[j] < arr[min_idx]){
//           min_idx = j;
//         }
//       }
//       swap(arr, i, min_idx);
//     }
//   }

//   public static void insertion_sort(int arr[]){
//     int n = arr.length;
//     for(int i =1;i <n;i++){
//       int j = i;
//       while(j>0 && arr[j]<arr[j-1]){
//         swap(arr, i, j-1);
//         j--;                                                                                                                                                                                                                                                                                                                            
//       }
//     }
//   }



//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new  int[n];
//     System.out.println("Enter array elements");

//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     bubble_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//  System.out.println("Selection sort-");
//     selectionSort(arr);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//     System.out.println("Insertion sort - ");
//     insertion_sort(arr);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void swap(int arr[], int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i =st+1;i<= end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }

//     int piv_idx = st + count;
//     swap(arr,st,piv_idx);

//     int i = st;
//     int j = end;

//     while(i < piv_idx && j>piv_idx){
//       while(arr[i] <= pivort ){
//         i++;
//       }
//       while(arr[j]> pivort){
//         j--;
//       }

//       if(i < piv_idx && j > piv_idx){
//         swap(arr,i,j);
//         i++;
//         j--;
//       }
//     }
//     return piv_idx;
//   }

//   public static void quick_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);

//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//    quick_sort(arr, 0, n-1);
//    for(int i: arr){
//     System.out.print(i+" ");
//    }
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void marge(int arr[],int st, int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;

//     for( i=0; i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){

//       if(left[i]<right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }
//     while(i<n1){
//       arr[k++] = left[i++];
//     }

//     while(j<n2){
//       arr[k++] = right[j++];
//     }
  
//   }
//   public static void marge_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int mid = st + (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
    
//     int arr[] = new int[n];
//     System.out.println("Enter the array elements: ");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }

//   }
// }


/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;

//   }
//   public static void bubble_sort(int arr[]){
//     int n = arr.length;
//     for(int i=0; i<n-1;i++){
//       for(int j=0; j<n-i-1;j++){
//         if(arr[j]>arr[j+1]){
//           swap(arr,j,j+1);

//         }
//       }
//     }
//   }

//   public static void insertion_sort(int arr[]){
//     int n = arr.length;
//     for(int i = 1; i<n; i++){
//       int j = i;
//       while (arr[j] < arr[j-1]) {
//         swap(arr, j-1, j); 
//         j--;
//       }

//     }

//   }

//  public static void selectionSort(int arr[]){
//   int n = arr.length;
//   for(int i=0; i<n-1; i++){
//     int min = i;
//     for(int j=i+1;j<n;j++){
//       if(arr[j] < arr[min]){
//         min = j;
       
//       }
//     }
//     swap(arr, i, min);
//   }
//  }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size:");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0; i<n;i++){
//       arr[i] =  sc.nextInt();
//     }
//     bubble_sort(arr);

//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   System.out.println("insertion sort -");
//     insertion_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//     System.out.println(arr[3]);
//     System.out.println("Selection sort");
//     selectionSort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     sout
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void  swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

  // public static void bubble_sort(int arr[]){
  //   int n = arr.length;
  //   for(int i=0; i<n-1; i++){
  //     for(int j=0;j<n-i-1;j++){
  //       if(arr[j]>arr[j+1]){
  //         swap(arr, j, j+1);
  //       }
  //     }
  //   }
  // }

  // public static void insertion_sort(int arr[]){
  //   int n = arr.length;
  //   for(int i=1;i<n;i++){
  //     int j =i;
  //     while (j>0 && arr[j] < arr[j-1])  {
  //       swap(arr,j,j-1);
  //       j--;
        
  //     }
  //   }
  // }

  // public static void rev_insertion_sort(int arr[]){
  //   int n = arr.length;
  //   for(int i=1;i<n;i++){
  //     int j = i;
  //     while (j>0 && arr[j] > arr[j-1]) {
  //       swap(arr, j, j-1);
  //       j--;      
  //     }
      
  //   }
  // }


  // public static void selectionSort(int arr[]){
  //   int n = arr.length;
  //   for(int i= 0;i<n -1;i++){
  //     int min = i;
  //     for(int j= i+1;j<n;j++){
  //       if(arr[j] < arr[min]){
  //         min =j;
  //       }
  //     }
  //     swap(arr,i,min);

  //   }
  // }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }


//     System.out.println("insertion sort");
//     insertion_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//     System.out.println("REV insertion sort");
//     rev_insertion_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void indsertion_Sort(int arr[]){
//     int n = arr.length;
//     for(int i=1;i<n;i++){
//       int j = i;
//       while(j>0 && arr[j]<arr[j-1]){
//         swap(arr, j, j-1);
//         j--;
//       }
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }
//     indsertion_Sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
   
// }


/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
    
//   }
//   public static void selectionSort(int arr[]){
//     int n = arr.length;
//     for(int  i=0;i<n-1;i++){
//       int min = i;
//       for(int j = i+1;j<n;j++){
//         if(arr[min] > arr[j]){
//           min = arr[j];
//         }
//       }
//       swap(arr,i,min);
//     }
//   }

//   public static void insertionSort(int arr[]){
//     int n = arr.length;
//     for(int i = 1;i<n;i++){
//       int j = i;
//       while(j>0 && arr[j] < arr[j-1]){
//         swap(arr, j-1, j);
//         j--;
//       }
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n =  sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     insertionSort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//     System.out.println("Selection sort");
//     selectionSort(arr);
//     for(int i:  arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static void bubble_sort(int arr[]){
//     int n = arr.length;
//     for(int i=0; i<n-1;i++){
//       for(int j=0; j<n-i-1;j++){
//         if(arr[j]> arr[j+1]){
//           swap(arr, j+1, j);
//         }
//       }
//     }
//   }

//   public static void selectionSort(int arr[]){
//     int n = arr.length;
//     for(int i=0;i<n-1;i++){
//       int min = i;
//       for(int j=i+1; j<n;j++){
//         if(arr[j] < arr[min]){
//           min = j;
//         }
//       }
//       swap(arr,i,min);
//     }

//   }

//   public static void insertion_sort(int arr[]){
//     int  n = arr.length;
//     for(int i = 1;i<n;i++){
//       int j = i;
//       while(j>0 && arr[j]<arr[j-1]){
//         swap(arr, j-1, j);
//         j--;
//       }
//     }

//   }


//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements:");

//     for(int i =0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     bubble_sort(arr);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
    
//     insertion_sort(arr);
//     System.out.println("insertion sort");
//     for(int i: arr){
//       System.out.print(i+" ");
//     }

//     selectionSort(arr);
//     System.out.println("Selection sort");
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void marge(int arr[],int st, int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int [n2];

//     int i ,j,k;
//     for( i=0;i<n1;i++) left[i] = arr[st+i];
//     for( j=0; j<n2;j++) right[j] = arr[mid+1+j];

//     i = 0;
//     j = 0;
//     k = st;

//     while(i<n1 && j<n2){
//       if(left[i] < right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }
//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }

//   }

//   public static void marge_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int mid = st + (end-st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);

//   }

//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of array");
//     int n = sc.nextInt();
//     int arr[] = new int[n];

//     System.out.println("Enter array elements");

//     for(int i=0; i<n;i++){
//       arr[i]  = sc.nextInt();
//     }
//      marge_sort(arr, 0, n-1);
//      for(int i: arr){
//       System.out.print(i+" ");
//      }

//    }
// }

/**
 * prc
 */
// public class prc {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[], int st, int end){
//     int n = arr.length;
//     int pivort = arr[st];
//     int count = 0;

//     for(int i=1; i<= end ;i++){
//       if(arr[i]<= pivort){
//         count++;
//       }

//     }

//     int pi_idx = st+count;
//     swap(arr, st, pi_idx);
//     int i = st;
//     int j = end;

//     while(i< pi_idx && j>pi_idx){
//      while (arr[i] <= pivort) {
//       i++; 
//      }
//      while(arr[j]>pivort){
//       j--;
//      }

//      if(i<pi_idx && j>pi_idx){
//       swap(arr,i,j);
//       i++;
//       j--;
//      }
      

//     }
//     return pi_idx;

//   }

//   public static void quick_sort(int arr[], int st, int end){
//     if(st>=end) return ;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
    
//   }
// }

// class prc{
//   public static void marge(int arr[], int st,int mid, int end){

//     int n1 = mid -st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for( i=0; i<n1;i++) left[i] = arr[st+i];
//     for( j=0; j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;
//     while(i<n1 && j<n2){
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];

//       }else{
//         arr[k++] = right[j++];

//       }
//     }
//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }


//   }

//   public static void marge_sort(int arr[],int st, int end){
//     if(st >= end) return;
//     int mid = st + (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n; i++){
//       arr[i] =  sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// class prc{

//   public static void swap(int arr[],int a ,int b){
//     int temp=arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[st];
//     int count =0;
//     for(int i=st+1; i<= end; i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
     
//     }

//     int pi_idx = st + count;
//     swap(arr, st, pi_idx);

//     int i = st;
//     int j = end;
//     while(i < pi_idx && j>pi_idx){
//     while(arr[i] < pivort){
//       i++;
//     }
//     while(arr[j]> pivort){
//       j--;
//     }

//       if(i<pi_idx && j>pi_idx){
//         swap(arr,i,j);
//         i++;
//         j--;
//       }
//     }
//     return pi_idx;
//   }


//   public static void quick_sort(int arr[], int st, int end){
//     if(st>= end) return;
    
//     int pi  = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("ENTER ARRAY ELEMENTS");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();

//     }

//     quick_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }


// class prc{

//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[], int st ,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i=st+1; i<=end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }

//     int pi_idx = st + count;
//     swap(arr, st, pi_idx);

//     int i =st ;
//     int j =end;
//     while (i< pi_idx && j>pi_idx) {
//       while (arr[i]<= pivort) {
//         i++;
        
//       }
//       while(arr[j] > pivort){
//         j--;
//       }

//       if(i< pi_idx && j>pi_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
      
//     }
//     return pi_idx;

    
//   }

//   public static void quick_sort(int arr[],int st, int end){
//     if(st >= end) return ;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter size of the array");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }


//   }
// }


/**
 * prc
 */
// public class prc {

//   public static boolean binarySearch(int arr[], int target){
//     int st = 0;
//     int end = arr.length-1;

//     while(st<=end){
//       int mid = st + (end -st)/2;
//       if(target == mid) return true;
//       if(arr[mid] < target){
//         st = mid+1;
//       }else{
//         end = mid-1;
//       }

//     }
//     return false;

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];

//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();

//     }
//     System.out.println("Enter Target");
//     int target = sc.nextInt();
//     System.out.println(binarySearch(arr, target));


//   }
// }

/**
 * prc
 */
// public class prc {
//   public static void marge(int arr[], int st, int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//    int i,j,k;
//    for(i=0;i<n1;i++) left[i] = arr[st+i];
//    for(j=0;j<n2;j++) right[j] = arr[mid+1+j];
//    i=0;
//    j=0;
//    k=st;

//    while(i<n1 && j<n2){
//     if(left[i] <= right[j]){
//       arr[k++] = left[i++];
//     }else{
//       arr[k++] = right[j++];
//     }
//    }
//    while(i<n1){
//     arr[k++] = left[i++];
//    }
//    while(j<n2){
//     arr[k++] = right[j++];
//    }


//   }
//   public static void margeSort(int arr[],int st, int end){
//     if(st>=end) return ;
//     int mid = st+ (end-st)/2;
//     margeSort(arr, st, mid);
//     margeSort(arr, mid+1, end);
//     marge(arr, st, mid, end);


//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }
//     margeSort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }


//   }
// }

/**
 * prc
 */

// public class prc {
//   public static int searchRotateBs(int arr[]){
//     int st = 0;
//     int end = arr.length-1;
//     int ans = -1;
//     while (st <= end) {
//       int mid = st + (end-st)/2;
//       if(arr[mid]>arr[end]){
//         st = mid+1;
//       }else{
//         end = mid -1;
//         ans = mid;
//       }
      
//     }
//     return ans;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();

//     }
    
//     System.out.println(searchRotateBs(arr));

//   }
// }

/**
 * prc
 */
// public class prc {

//   public static void main(String[] args) {
//     System.out.println('a');
//   }
// }

/**
 * practice
 */
// public class practice {
//   public static int fiendIndexBs(int arr[],int target){
//     int st =0;
//     int end = arr.length-1;
//     while(st<=end){
//       int mid = st+(end-st)/2;
//       if(arr[mid] == target) return mid;
//       else if(arr[mid]< arr[end]){
//         if(target> arr[mid] && target < arr[end]){
//           st = mid+1;
//         }else{
//           end = mid-1;
//         }
//       }else{
//         if(arr[st]<= target && target < arr[mid]){
//           end = mid-1;
//         }else{
//           st = mid+1;
//         }
//       }
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     Scanner sc  = new Scanner(System.in);
//     System.out.println("Enter array size: ");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter target element:");
//     int target = sc.nextInt();
//     System.out.println(fiendIndexBs(arr, target));

   
//   }
// }

/**
 * practice
 */
// public class practice {

//   public static int fiendIndexBs(int arr[], int target){
//     int st=0;
//     int end = arr.length-1;
//     while(st<=end){
//       int mid = st+(end-st)/2;
//       if(arr[mid] == target) return mid;

//       else if(arr[mid] < arr[end]){
//         if(target>arr[mid] && target<arr[end]){
//           st = mid+1;
//         }else{
//           end = mid-1;
//         }
//       }else{
//         if(arr[st] <= target && target<arr[mid]){
//           end = mid-1;
//         }else{
//           st = mid+1;
//         }
//       }
//     }
//     return -1;

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements:");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }
    
//     System.out.println("Enter target");
//     int target = sc.nextInt();
//     System.out.println(fiendIndexBs(arr, target));

//   }
// }

/**
 * practice
 */
// public class practice {
//   public static int[] sufixSum(int arr[]){
//     int ans[] = new int[arr.length];
//     ans[arr.length-1] = arr[arr.length-1];
//     for(int i=arr.length-2;i>=0; i--){
//       ans[i] = arr[i] + ans[i+1];

//     }
//     return ans;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }
    
//     int result[] = sufixSum(arr);

//     for(int i:result){
//       System.out.print(i+" ");
//     }

//   }
// }

/**
 * practice
 */

// public class practice {
//   public static int fiendIndexBS(int arr[],int target){
//     int st = 0;
//     int end = arr.length-1;
//     while(st <= end){
//       int mid = st + (end - st)/2;
//       if(target == arr[mid]) return mid;
//       else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
//         st++;
//         end--;
//       }else if(arr[mid] <= arr[end]){
//         if(target > arr[mid] && target <= arr[end]){
//           st = mid+1;

//         }else{
//           end = mid-1;
//         }

//       }else{
//         if(target>= arr[st] && target < arr[mid]){
//           end = mid-1;
//         }else{
//           st = mid+1;
//         }
//       }
//     }
//     return -1;

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] =  new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();

//     }
//     System.out.println("Enter Target");
//     int target = sc.nextInt();
//     System.out.println(fiendIndexBS(arr, target));
//   }
// }

/**
 * practice
 */

// public class practice {
//   public static void marge(int arr[],int st,int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[i+st];
//     for(j=0;j<n2;j++) right[j] = arr[j+mid+1];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while (i<n1) {
//       arr[k++] = left[i++];
      
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];
      
//     }


//   }
//   public static void marge_sort(int arr[],int st,int end){
//     if(st>=end) return;
//     int mid = st+ (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }


//   }
// }

/**
 * practice
 */
// public class practice {
//   public static void marge(int arr[],int st,int mid,int end){
//     int n1 = mid -st+1;
//     int n2 = end - mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i]<= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while (i<n1) {
//       arr[k++] = left[i++];
      
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];
      
//     }
//   }
//   public static void marge_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int mid = st + (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
    
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n  = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }
//     marge_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * practice
 */
// public class practice {

//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count =0;
//     for(int i=st+1; i<= end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }
//     int piv_idx = st+count;
//     swap(arr, st, piv_idx);

//     int i = st;
//     int j = end;

//     while( i<piv_idx && j>piv_idx){
//       while(arr[i]<= pivort){
//         i++;
//       }
//       while(arr[j] > pivort){
//         j--;
//       }

//       if(i<piv_idx && j>piv_idx){
//         swap(arr, i, j);
//       }
//     }
//     return piv_idx;

//   }
//   public static void quickSort(int arr[],int st,int end){
//     if(st>end) return;
//     int pi = partition(arr,st,end);
//     quickSort(arr, st, pi-1);
//     quickSort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[]  = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }

//     quickSort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * practice
 */

// public class practice {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i=st+1;i<=end;i++){
//       if(arr[i]<= pivort){
//         count++;
//       }
//     }

//     int pi_idx = st+count;
//     swap(arr, st, pi_idx);

//     int i = st;
//     int j= end;

//     while(i< pi_idx && j>pi_idx){
//       while (arr[i]<pi_idx) {
//         i++;
        
//       }
//       while (arr[j]>pi_idx) {
//         j--;
        
//       }
//       if(i<pi_idx && j>pi_idx){
//         swap(arr, i, j);
//       }
//     }
//     return pi_idx;
//   }
//   public static void quickSort(int arr[], int st,int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quickSort(arr, st, pi-1);
//     quickSort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }

//     quickSort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

/**
 * practice
 */

// public class practice {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;
//     for(int i=st+1;i<=end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }
//     int pi_idx = st+count;
//     swap(arr,st,pi_idx);

//     int i=st;
//     int j= end;
    
//     while (i<pi_idx && j>pi_idx) {
//       while (arr[i]<= pivort) {
//         i++;
        
//       }
//       while (arr[j]>pivort) {
//         j--;
        
//       }
//       if(i<pi_idx && j>pi_idx){
//         swap(arr, i, j);
//       }
      
//     }
//     return pi_idx;
//   }

//   public static void quick_sort(int arr[], int st,int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1,end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size: ");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter Array Elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

// public class practice {
//   public static void marge(int arr[],int st,int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end -mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;
//     while (i<n1 && j<n2) {
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];
        
//       }else{
//         arr[k++] = right[j++];
//       }
      
//     }
//     while (i<n1) {
//       arr[k++] = left[i++];
      
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];
      
//     }
//   }
//   public static void marge_sort(int arr[],int st,int end){
//     if(st>=end) return ;
//     int mid = st + (end-st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size: ");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }
//     marge_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
    
//   }
// }

// public class practice {
//   public static void marge(int arr[],int st,int mid,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i,j,k;
//     for( i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0; j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;
//     while (i<n1 && j<n2) {
//       if(left[i]<= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
      
//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];
      
//     }


//   }
//   public static void marge_sort(int arr[],int st,int end){
//     if(st>=end) return;
//     int mid = st+(end-st)/2;

//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }

//   public static void main(String[] args) {
    
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     System.out.println("Enter array elements");
//     int arr[] = new int[n];

//     for(int i=0;i<arr.length;i++){
//       arr[i] = sc.nextInt();

//     }
//     marge_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// public class practice {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
 
//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[st];
//     int count = 0 ;
//     for(int i=st+1; i<= end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }

//     int pivot_index = st+count;
//     swap(arr, st, pivot_index);

//     int i = st;
//     int j = end;

//     while (i<pivot_index  && j>pivot_index) {
//       while (arr[i] <= pivort) {
//          i++;        
//       }
//       while (arr[j]> pivort) {
//         j--;
        
//       }

//       if(i<pivot_index && j>pivot_index){
//         swap(arr, i, j);
//       }
      
//     }
//     return pivot_index;
//   }
//   public static void quick_sort(int arr[], int st,int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
    
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter aray elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// public class practice {
//   public static void marge(int arr[],int st,int mid ,int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];
    
//     int i,j,k;
//     for( i=0;i<n1;i++) left[i] = arr[i+st];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];
//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i]<= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }
//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while (j<n2) {
//       arr[k++] = right[j++];
      
//     }

//   }
//   public static void marge_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int mid = st+ (end-st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr,st,mid,end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }
//    marge_sort(arr, 0, n-1);
//    for(int i:arr){
//     System.out.print(i+" ");
//    }
    
//   }
// } 

// public class practice {
//   public static void marge(int arr[],int st,int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;
//     int left[] = new int[n1];
//     int right[] = new int [n2];

//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while (i<n1 && j<n2) {
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }

//     }
//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }

//   }
//   public static void marge_sort(int arr[],int st,int end){
//     if(st>= end) return;
//     int mid = st + (end-st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st, mid, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }
//    marge_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

// public class practice {
//   public static void swap(int arr[], int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }
//   public static int partition(int arr[],int st, int end){
//     int pivort = arr[0];
//     int count = 0;
//     for(int i=st+1;i<=end;i++){
//       if(arr[i]<=pivort){
//         count++;
//       }
//     }
//     int pi_idx = st+count;
//     swap(arr, st, pi_idx);

//     int i=st;
//     int j=end;
//     while (i<pi_idx && j>pi_idx) {

//       while (i<= pivort) {
//         i++; 
//       }
//       while(j>pivort){
//         j--;
//       }
//       if(i<pi_idx && j>pi_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
      
//     }
//     return pi_idx;

//   }
//   public static void quick_sort(int arr[],int st,int end){
//     if(st>=end)return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1,end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i: arr){
//       System.out.print(i+" ");
//     }
//   }
// }

// public class practice {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;

//   }
//   public static void bubble_sort(int arr[]){
//     for(int i=0;i<arr.length-1;i++){
//         for(int j=0;j<arr.length-1-i;j++){
//           if(arr[j]>arr[j+1]){
//             swap(arr, j,j+1);
//           }
//         }
//       }
//     }

  

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements:");

//     for(int i=0; i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     bubble_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }

// public class practice {

//   public static void marge(int arr[],int st,int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int [n2];

//     int i,j,k;

//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i]<= right[j]){
//         arr[k++]  = left[i++];
//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }

//     while(j<n2){
//       arr[k++] = right[j++];
//     }

//   }

//   public static void marge_sort(int arr[],int st,int end){
//     if(st>=end) return;
//     int mid = st + (end - st)/2;
//     marge_sort(arr, st, mid);
//     marge_sort(arr, mid+1, end);
//     marge(arr, st,mid, end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array Size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");

//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     marge_sort(arr, 0, n-1);

//     for(int i:arr){
//       System.out.print(i+" ");
//     }


//   }
// }

// public class practice {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static int partition(int arr[],int st,int end){
//     int pivort = arr[st];
//     int count = 0;

//     for(int i = st+1;i<= end;i++){
//       if(arr[i] <= pivort){
//         count++;
//       }
//     }

//     int pi_idx = count+st;
//     swap(arr,st,pi_idx);

//     int i = st;
//     int j = end;
    
//     while(i< pi_idx && j >pi_idx){
//       while(arr[i] <= pivort){
//         i++;
//       }
//       while(arr[j]>pivort){
//         j--;
//       }
      
//       if(i< pi_idx && j>pi_idx){
//         swap(arr, i, j);
//         i++;
//         j--;
//       }
//     }
//     return pi_idx;

//   }

//   public static void quick_sort(int arr[],int st, int end){
//     if(st>=end) return;
//     int pi = partition(arr,st,end);
//     quick_sort(arr, st, pi-1);
//     quick_sort(arr, pi+1, end);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     quick_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// public class practice {
//   public static void swap(int arr[],int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void bubble_sort(int arr[]){
//     int n = arr.length;
//     for(int i=0;i<n-1;i++){   
//       for(int j=0;j<n-i-1;j++){
//         if(arr[j] > arr[j+1]){
//           swap(arr,j,j+1);

//         }

//       }
//     }

//   }

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
//     }

//     bubble_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// public class practice {
//   public static void swap(int arr[], int a, int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void bubble_sort(int arr[]){
//     int n = arr.length;

//     for(int i=0;i<n-1;i++){
//       for(int j = 0;j<n-i-1;j++){
//         if(arr[j] > arr[j+1]){
//           swap(arr,j,j+1);
//         }

//       }
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter size of array");
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     System.out.println("Enter array elements");
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     bubble_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }
// }

// public class practice {
//   public static void swap(int arr[],int a,int b){
//     int temp = arr[a];
//     arr[a] = arr[b];
//     arr[b] = temp;
//   }

//   public static void bubble_sort(int arr[]){
//     int n = arr.length;
//     for(int i=0;i<n-1;i++){
//       boolean flag = false;
//       for(int j=0; j<n-i-1; j++){
//         if(arr[j]>arr[j+1]){
//           swap(arr,j,j+1);
//           flag = true;
//         }
//       }
//       if(flag == false) return;
//     }
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n = sc.nextInt();

//     int arr[] = new int[n];
//     for(int i=0;i<n;i++){
//       arr[i] = sc.nextInt();
      
//     }

//     bubble_sort(arr);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
// }


// 

// public class practice {
//   public static void marge(int arr[],int st,int mid, int end){
//     int n1 = mid - st +1;
//     int n2 = end - mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];
    
//     int i,j,k;
//     for(i=0;i<n1;i++) left[i] = arr[st+i];
//     for(j=0;j<n2;j++) right[j] = arr[mid+1+j];

//     i=0;
//     j=0;
//     k=st;

//     while(i<n1 && j<n2){
//       if(left[i] <= right[j]){
//         arr[k++] = left[i++];

//       }else{
//         arr[k++] = right[j++];
//       }
//     }

//     while(i<n1){
//       arr[k++] = left[i++];
//     }
//     while(j<n2){
//       arr[k++] = right[j++];
//     }
//   }
//   public static void marge_sort(int arr[],int st, int end){
//     if(st>= end) return ;
//    int mid = st + (end-st)/2;
//    marge_sort(arr, st, mid);
//    marge_sort(arr, mid+1, end);
//   marge(arr,st,mid,end);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size");
//     int n =sc.nextInt();
//     int arr[] = new int[n];

//     System.out.println("Enter array elements");
//     for(int i=0;i<n;i++){

//       arr[i] = sc.nextInt();
//     }
//     marge_sort(arr, 0, n-1);
//     for(int i:arr){
//       System.out.print(i+" ");
//     }


//   }
// }

public class practice {
  public static void swap(int arr[],int a,int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  public static int partition(int arr[],int st,int end){
    int pivort = arr[st];
    int count=0;

    for(int i=st+1;i<=end;i++){
      if(arr[i]<= pivort){
        count++;
      }
      
    }
    int piv_idx = count+st;
    swap(arr,piv_idx,st);

    int i = st;
    int j = end;

    while(i < piv_idx && j > piv_idx){
     while (arr[i] <= pivort) {
      i++;
      
     }
     while(arr[j]> pivort){
      j--;
     }

     if(i<piv_idx && j>piv_idx){
      swap(arr, i, j);
     }

    }
    return piv_idx;
  }
  public static void quick_sort(int arr[],int st, int end){
    if(st>end) return;
    int pi = partition(arr,st,end);
    quick_sort(arr, st, pi-1);
    quick_sort(arr, pi+1, end);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements");

    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    quick_sort(arr, 0, n-1);
    for(int i:arr){
      System.out.print(i+" ");
    }
  }
}