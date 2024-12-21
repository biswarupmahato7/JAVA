// // import java.util.Arrays;
// //import java.util.Scanner;

// // class prc {

// //     static void swapArray(char arr[], int i, int j) {
// //         char temp = arr[i];
// //         arr[i] = arr[j];
// //         arr[j] = temp;

// //     }

// //     static void reverseArrInplace(char arr[]) {
// //         int i = 0;
// //         int j = arr.length - 1;
// //         while (i < j) {
// //             swapArray(arr, i, j);
// //             i++;
// //             j--;

// //         }
// //         for (i = 0; i < arr.length; i++) {

// //             System.out.println(arr[i]);

// //         }

// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter String ");
// //         String str = sc.next();

// //         char[] charArray = str.toCharArray();
// //         int len = str.length();

// //         Arrays.sort(charArray);
// //         reverseArrInplace(charArray);

// //         System.out.println("Max Num is ");
// //         for (int i = 0; i < len; i++) {
// //             System.out.print(charArray[i]);
// //         }

// //     }
// // }

// // import java.util.Arrays;
// // import java.util.Scanner;

// // class prc {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter String ");
// //         String str = sc.next();

// //         char[] charArray = str.toCharArray();
// //         int len = str.length();

// //         Arrays.sort(charArray);

// //         System.out.println("Max Num is ");
// //         for (int i = len - 1; i >= 0; i--) {
// //             System.out.print(charArray[i]);
// //         }
// //     }
// // }

// // class prc{

// //    public static void main(String[] args) {
// //     Scanner sc=new Scanner(System.in);
// //     System.out.println("Enter array size: ");
// //     int size=sc.nextInt();
// //     int arr[]=new int[size];
// //     System.out.println("Enter Array Elements: ");

// //     for(int i=0;i<size;i++){
// //         arr[i]=sc.nextInt();
// //     }

// //     for(int i=0;i<arr.length;i++){
// //         for(int j=i+1;j<arr.length;j++){
// //             if(arr[i]==arr[j]){
// //                 arr[i]=-1;
// //                 arr[j]=-1;
// //             }
// //         }
// //     }
// //         int ans=-1;
// //         for(int i=0;i<arr.length;i++){
// //             if(arr[i]>0){
// //                 ans=arr[i];
// //             }
// //         }
// //         System.out.println("Qnique digits is: "+ans);

// //    }
// // }

// // class prc{
// //     static int findSum(int arr[]){
// //         int totalSum=0;
// //         for(int i=0;i<arr.length;i++){
// //             totalSum+=arr[i];
// //         }
// //         return totalSum;
// //     }
// //     static boolean equalPartition(int arr[]){
// //         int totalSum=findSum(arr);
// //         int prefixSum=0;
// //         int sufixSum=0;
// //         for(int i=0;i<arr.length;i++)
// //         {
// //             prefixSum+=arr[i];
// //             sufixSum=totalSum-prefixSum;
// //             if(sufixSum==prefixSum){
// //                 return true;
// //             }
// //         }
// //         return false;

// //     }

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter array size : ");
// //         int size=sc.nextInt();
// //         int arr[]= new int[size];

// //         System.out.println("Enter array elements ");
// //         for(int i=0;i<arr.length;i++){
// //             arr[i]=sc.nextInt();
// //         }
// //         System.out.println("Array pertition is Possible : "+equalPartition(arr));

// //     }
// // }

// //import java.util.Scanner;

// // public class prc {
// //     public static void main(String[] args) {
// //         System.out.println("Enter array size: ");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int result = 0;
// //         int a[] = new int[n];
// //         int sum1 = 0;
// //         int sum2 = 0;
// //         System.out.println("Enter array element: ");
// //         for (int i = 0; i < n; i++) {
// //             a[i] = sc.nextInt();
// //         }
// //         for (int i = 0; i < n; i++) {
// //             sum1 += a[i];
// //         }
// //         for (int i = 0; i < n; i++) {
// //             sum1 -= a[i];
// //             sum2 += a[i];
// //             if (sum1 == sum2) {
// //                 result = 1;
// //                 break;
// //             }
// //         }
// //         if (result == 1) {
// //             System.out.println("True");
// //         } else {
// //             System.out.println("False");
// //         }
// //     }
// // }

// //public class prc{

// // static void printArray(int arr[]) {

// //     for(int i=0;i<arr.length;i++){
// //         //for(int j=0;j<arr[i].length;j++)
// //         {
// //             System.out.print(arr[i]+" ");
// //         }
// //         //System.out.println(" ");
// //     }
// // }
// // static int uniqueElement(int arr[]){
// //     int unique=-1;
// //     for(int i=0;i<arr.length;i++){
// //         for(int j=i+1;j<arr.length;j++){
// //            if(arr[i]==arr[j])
// //            {
// //             arr[i]=-1;
// //             arr[j]=-1;
// //            }
// //         }
// //     }
// //     for(int i=0;i<arr.length;i++){
// //         if(arr[i]>0){
// //             unique=arr[i];
// //         }
// //     }
// //     return unique;
// // }

// // static int[][] pascalTriangle(int row){
// //     int ans[][]=new int[row][];

// //     for(int i=0;i<row;i++){

// //          ans[i]=new int[i+1];

// //         ans[i][0]=ans[i][i]=1;

// //         for(int j=1;j<i;j++){
// //             ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
// //         }

// //     }
// //     return ans;
// // }
// //    static int[][] pascalTriangle(int row){
// //     int arr[][]=new int[row][];
// //     for(int i=0;i<row;i++){
// //         arr[i]=new int[i+1];
// //         arr[i][0]=arr[i][i-1]=1;

// //         for(int j=1;j<i;j++){
// //             arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
// //         }
// //     }
// //     return arr;

// //    }

// // public static void main(String[] args) {
// //     Scanner sc=new Scanner(System.in);
// //     System.out.println("Enter array size : ");
// //     int size=sc.nextInt();
// //     int arr[]=new int[size];
// //     System.out.println("Enter array elements  : ");

// //     for(int i=0;i<arr.length;i++){
// //         arr[i]=sc.nextInt();
// //     }
// //int ans[][]=pascalTriangle(row);
// //System.out.println("Ans is "+ uniqueElement(arr));

// // prefixSum(arr);
// //printArray(arr);

// //}
// //}

// // public class prc{
// //     static void removeElement(int arr[]){
// //         int j=0;
// //         for(int i=0;i<arr.length;i++){
// //             if(arr[i]!=arr[j]){
// //                 arr[++j]=arr[i];

// //             }
// //         }

// //     } 
// //     public static void main(String[] args) {
// //         Scanner sc= new Scanner(System.in);
// //         System.out.println(" enter array size");
// //         int size=sc.nextInt();
// //         int arr[]=new int[size];
// //         System.out.println("Enter array elements: ");

// //         for(int i=0;i<size;i++){
// //             arr[i]=sc.nextInt();
// //         }

// //         System.out.println("After Removing Dublicate Element ");
// //         removeElement(arr);

// //     }

// // }

// // public class prc{
// //     static void printDesc(int n){
// //         if(n==1){
// //             System.out.println(1);
// //             return;
// //         }
// //         System.out.println(n);
// //         printDesc(n-1);
// //     }
// //     public static void main(String[] args) {
// //         int n=5;
// //         printDesc(n);
// //         System.out.println(args[0]);

// //     }
// // }

// // class prc{  
// //     public static void main(String args[]){  

// //     for(int i=0;i<args.length;i++)  
// //     System.out.println(args[i]);  

// //     }  
// //     } 

// // public static void main(String[] args) {
// //     String gender = args[0];
// //      int age = Integer.parseInt(args[1]);

// //     if(gender==Female && (age>0 && age<59))
// //     {
// //        System.out.println("The percentage of interest is 8.2% ");
// //     }
// //     if(gender==Female && (age>58 && age<101))
// //     {
// //        System.out.println("The percentage of interest is 9.2% ");
// //     }

// //     if(gender==Male && (age>0 && age<59))
// //     {
// //        System.out.println("The percentage of interest is 8.4% ");
// //     }
// //     if(gender==Male && (age>58 && age<101))
// //     {
// //        System.out.println("The percentage of interest is 10.5% ");
// //     }

// //  }
// // }
// // class prc{
// //     public static void main(String[] args) {
// //         String gender = args[0];
// //         int age = Integer.parseInt(args[1]);

// //         if (gender.equals("Female") && (age > 0 && age < 59)) {
// //            System.out.println("The percentage of interest is 8.2%");
// //         }
// //         if (gender.equals("Female") && (age > 58 && age < 101)) {
// //            System.out.println("The percentage of interest is 9.2%");
// //         }

// //         if (gender.equals("Male") && (age > 0 && age < 59)) {
// //            System.out.println("The percentage of interest is 8.4%");
// //         }
// //         if (gender.equals("Male") && (age > 58 && age < 101)) {
// //            System.out.println("The percentage of interest is 10.5%");
// //         }
// //      }

// // }

// // public class prc {
// //    public static void main(String[] args) {
// //        int[] array = {1, 2, 10,10, 3};

// //        // Find the index of the value 10
// //        int index = -1;
// //        for (int i = 0; i < array.length; i++) {
// //            if (array[i] == 10) {
// //                index = i;
// //                break;
// //            }
// //        }

// //        // Move the value 0 to the last position
// //        if (index != -1) {
// //            array[index] = 0;
// //            for (int i = index; i < array.length - 1; i++) {
// //                int temp = array[i];
// //                array[i] = array[i + 1];
// //                array[i + 1] = temp;
// //            }
// //        }

// //        // Printing the updated array
// //        for (int num : array) {
// //            System.out.print(num + " ");
// //        }
// //    }
// // }

// // public class prc {
// //    public static void main(String[] args) {

// //    }
// // }

// // import java.util.Arrays;

// // public class prc {
// //     public static void main(String[] args) {
// //         int[] array = {1, 2, 10, 3, 10, 4};

// //         // Replace all occurrences of 10 with 0
// //         for (int i = 0; i < array.length; i++) {
// //             if (array[i] == 10) {
// //                 array[i] = 0;
// //             }
// //         }

// //         // Printing the updated array
// //         for (int num : array) {
// //             System.out.print(num + " ");
// //         }
// //     }
// // }

// // import java.util.Arrays;

// // public class prc {
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("enter array size :");
// //         int size=sc.nextInt();
// //         System.out.println("enter array elements :");
// //         int[] array = new int[size];
// //         for(int i=0;i<size;i++){
// //             array[i]=sc.nextInt();

// //         }

// //         replaceAndMoveToEnd(array, 10);

// //         // Printing the updated array
// //         for (int num : array) {
// //             System.out.print(num + " ");
// //         }
// //     }

// //     public static void replaceAndMoveToEnd(int[] array, int value) {
// //         int count = 0;
// //         for (int i = 0; i < array.length; i++) {
// //             if (array[i] != value) {
// //                 array[count] = array[i];
// //                 count++;
// //             }//all non-value elements have been moved to the start of the array, and count represents the number of non-value elements.
// //         }

// //         while (count < array.length) {
// //             array[count] = 0;
// //             count++;
// //         }
// //     }
// // }

// // public int countPrimeInrange (int input1,int input2){
// //     for(int i= input1,i<input2;i++){
// //         if(i%2!=0){
// //             System.out.println(i+"");
// //         }
// //     }
// //     return;
// // }

// // import java.util.Scanner;
// // class prc{
// //     static void Pi(int n){
// //         if(n==1){
// //             System.out.println(n);
// //             return;
// //         }
// //         System.out.println(n);
// //         Pi(n-1);

// //     }
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter the value of n:");
// //         int n=sc.nextInt();
// //         Pi(n);

// //     }
// //}

// //BUBBLE SORT//

// // class prc{
// //     static void bubbleSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             boolean flag=false;
// //             for(int j=0;j<n-i-1;j++){
// //                 if(arr[j]>arr[j+1]){
// //                     int temp=arr[j];
// //                     arr[j]=arr[j+1];
// //                     arr[j+1]=temp;
// //                     flag=true;
// //                 }
// //             }
// //             if(flag==false){
// //                 return;
// //             }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={7,3,5,4,2,1};
// //         bubbleSort(arr);
// //         for(int i:arr){
// //             System.out.println(i+" ");
// //         }
// //     }
// // }

// //Selection SORT
// // class prc {
// //     static void selectionSort(int arr[]) {
// //         int n = arr.length;
// //         for (int i = 0; i < n - 1; i++) {
// //             int min_index = i;
// //             for (int j = i + 1; j < n; j++) {

// //                 if (arr[j] < arr[min_index]) {
// //                     min_index = j;
// //                 }

// //             }
// //             if (min_index != i) {
// //                 int temp = arr[i];
// //                 arr[i] = arr[min_index];
// //                 arr[min_index] = temp;

// //             }

// //         }
// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 7, 3, 1, 2, 8, };
// //         selectionSort(arr);
// //        for(int i:arr){
// //         System.out.println(i+ " ");
// //        }
// //     }
// // }

// // Insertion Sort
// // class prc{
// //     static void insertionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=1;i<n;i++){
// //             int j=i;
// //             while(j>0 && arr[j]<arr[j-1]){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j-1];
// //                 arr[j-1]=temp;
// //                 j--;
// //             }
// //         }
// //     }
// //     static void insertionSortDec(int arr[]){
// //         int n =arr.length;
// //         for(int i=1;i<n;i++){
// //             int j=i;
// //             while(j>0 && arr[j]>arr[j-1]){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j-1];
// //                 arr[j-1]=temp;
// //                 j--;

// //             }
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int arr[]={5,3,2,7,9,1};
// //         insertionSort(arr);
// //         System.out.println("Sorted in Increasing Order");
// //         for(int i=0;i<arr.length;i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //         System.out.println();
// //         System.out.println(" Sorted in Dec Order");
// //         insertionSortDec(arr);
// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //     }
// // }

// //Selection Sort
// // class prc{
// //     static void selectionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int min_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[j]<arr[min_index]){
// //                     min_index=j;
// //                 }

// //             }
// //             int temp=arr[i];
// //             arr[i]=arr[min_index];
// //             arr[min_index]=temp;

// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={4,7,2,1,6,8};
// //         selectionSort(arr);
// //         for(int i:arr){
// //             System.out.println(i);
// //         }
// //     }
// // }

// // sort String array --I/P-["PAPAYA","LIME","WATERMELON","APPLE","MANGO","KIWI"]
// // class prc{
// //     static void sortFruit(String fruits[]){
// //         int n=fruits.length;
// //         for(int i=0;i<n-1;i++){
// //             int min_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(fruits[j].compareTo(fruits[min_index])<0){
// //                     min_index=j;
// //                 }
// //             }
// //             String temp=fruits[i];
// //             fruits[i]=fruits[min_index];
// //             fruits[min_index]=temp;
// //         }

// //     }
// //     public static void main(String[] args) {
// //         String fruits[]={"PAPAYA","LIME","WATERMELON","APPLE","MANGO","KIWI"};
// //         sortFruit(fruits);
// //         for(String str:fruits){
// //             System.out.print(str+" ");
// //         }
// //     }
// // }

// //Bubble Sort
// // class prc{
// //     static void bubbleSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             boolean flag=false;
// //             for(int j=0;j<n-i-1;j++){
// //                 if(arr[j]>arr[j+1]){
// //                     int temp=arr[j];
// //                     arr[j]=arr[j+1];
// //                     arr[j+1]=temp;
// //                     flag=true;
// //                 }

// //             }
// //             if(flag==false){
// //                 return;
// //             }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={7,3,4,8,1,2};
// //         bubbleSort(arr);

// //         for(int i:arr){
// //             System.out.println(i+" ");
// //         }
// //     }
// // }

// //Insertion Sort 

// // class prc{
// //     static void insertionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=1;i<n;i++){
// //             int j=i;// j=the element we want to move it in its right position
// //             while(j>0 && arr[j-1]>arr[j]){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j-1];
// //                 arr[j-1]=temp;
// //                 j--; // we swap j index with j-1 , so j's index --;
// //             }
// //         }

// //     }
// //     static void insertionSortDec(int arr[]){
// //         int n=arr.length;
// //         for(int i=1;i<n;i++){
// //             int j=i;
// //             while(j>0 && arr[j]>arr[j-1] ){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j-1];
// //                 arr[j-1]=temp;
// //                 j--;
// //             }
// //         }

// //     }
// //     public static void main(String[] args) {
// //         int arr[]={7,2,3,8,4,9,1,};
// //         insertionSort(arr);
// //         for(int i:arr){
// //             System.out.println(i);
// //         }
// //         System.out.println();
// //         insertionSortDec(arr);
// //         System.out.println("In Decreasing Order");
// //         for(int i:arr){
// //             System.out.print(i);
// //         }

// //     }
// // }

// //Selection sort
// // class  prc{
// //     static void selectionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int min_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[min_index]>arr[j]){
// //                     min_index=j;
// //                 }
// //             }
// //             if(min_index!=i){
// //             int temp=arr[i];
// //             arr[i]=arr[min_index];
// //             arr[min_index]=temp;
// //         }

// //             }

// //     }

// //     static void selectionSortDesc(int arr[]){
// //           int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int max_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[max_index]<arr[j]){
// //                     max_index=j;
// //                 }
// //             }
// //             if(max_index!=i){
// //             int temp=arr[i];
// //             arr[i]=arr[max_index];
// //             arr[max_index]=temp;
// //         }

// //             }

// //     }
// //     public static void main(String[] args) {
// //         int arr[]={7,4,2,8,9,3};
// //         selectionSort(arr);

// //         for(int i: arr){
// //             System.out.print(i+" ");
// //         }
// //         System.out.println();
// //         selectionSortDesc(arr);
// //           for(int i: arr){
// //             System.out.print(i+" ");
// //         }
// //     }
// // }

// //Insertion Sort
// // class prc{
// //     static void insertionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=1;i<n;i++){
// //             int j=i;
// //             while(j>0 && arr[j]<arr[j-1]){
// //                 int temp=arr[j];
// //                 arr[j]=arr[j-1];
// //                 arr[j-1]=temp;
// //                 j--;
// //             }

// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={4,5,2,7,8,9};
// //         insertionSort(arr);
// //         for(int i:arr){
// //             System.out.println(i+" ");
// //         }
// //     }
// // }

// //selection Sort
// // class prc{
// //     static void selectionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int min_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[j]<arr[min_index]){
// //                     min_index=j;
// //                 }
// //             }
// //             if(min_index!=i){
// //                 int temp=arr[i];
// //                 arr[i]=arr[min_index];
// //                 arr[min_index]=temp;

// //             }
// //         }
// //     }
// //     static void selectionSortDesc(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int max_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[j]>arr[max_index]){
// //                     max_index=j;
// //                 }
// //             }
// //             if(max_index!=i){
// //                 int temp=arr[i];
// //                 arr[i]=arr[max_index];
// //                 arr[max_index]=temp;
// //             }
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={3,5,7,8,1,9};
// //         selectionSort(arr);

// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //         System.out.println();
// //         selectionSortDesc(arr);
// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //     }
// // }

// //MARGE SORT

// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     //marg to array
// //     static void merge(int arr[], int l, int mid, int r) {
// //         int n1 = mid - l + 1; // size of left
// //         int n2 = r - mid; // size of right

// //         int left[] = new int[n1];
// //         int right[] = new int[n2];

// //         int i, j, k;
// //         for (i = 0; i < n1; i++)
// //             left[i] = arr[l + i];
// //         for (j = 0; j < n2; j++)
// //             right[j] = arr[mid + 1 + j];

// //         i = 0;
// //         j = 0;
// //         k = l;
// //         while (i < n1 && j < n2) {
// //             if (left[i] <= right[j]) {
// //                 arr[k++] = left[i++];
// //             } else
// //                 arr[k++] = right[j++];
// //         }
// //         while (i < n1) {
// //             arr[k++] = left[i++];

// //         }
// //         while (j < n2) {
// //             arr[k++] = right[j++];

// //         }

// //     }

// //     // implement marge sort
// //     static void mergSort(int arr[], int l, int r) {
// //         if (l >= r)
// //             return;
// //         int mid = (l + r) / 2;
// //         mergSort(arr, l, mid); // sort 1st half
// //         mergSort(arr, mid + 1, r); /// sort 2nd half

// //         merge(arr, l, mid, r);

// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 8, 6, 9, 4, 1, 7 };
// //         int n = arr.length;
// //         System.out.println("Before Sorting");
// //         printArray(arr);
// //         mergSort(arr, 0, n - 1);
// //         System.out.println();
// //         System.out.println("After sorting ");
// //         printArray(arr);

// //     }
// // }

// //MARGE SORT 

// // class prc {
// //     static void merge(int arr[], int l, int mid, int r) {
// //         int n1 = mid - l + 1; // size of left
// //         int n2 = r - mid; // size of right

// //         int left[] = new int[n1];
// //         int right[] = new int[n2];

// //         for (int i = 0; i < n1; i++)
// //             left[i] = arr[l + i];
// //         for (int j = 0; j < n2; j++)
// //             right[j] = arr[mid + 1 + j];

// //         int i = 0, j = 0, k = l;
// //         while (i < n1 && j < n2) {
// //             if (left[i] <= right[j]) {
// //                 arr[k++] = left[i++];
// //             } else {
// //                 arr[k++] = right[j++];
// //             }
// //         }
// //         while (i < n1) {
// //             arr[k++] = left[i++];
// //         }
// //         while (j < n2) {
// //             arr[k++] = right[j++];
// //         }
// //     }

// //     static void mergeSort(int arr[], int l, int r) {
// //         if (l < r) {
// //             int mid = (l + r) / 2;
// //             mergeSort(arr, l, mid); // sort 1st half
// //             mergeSort(arr, mid + 1, r); // sort 2nd half
// //             merge(arr, l, mid, r);
// //         }
// //     }

// //     static void printArray(int arr[]) {
// //         int n = arr.length;
// //         for (int i = 0; i < n; ++i) {
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println();
// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 4, 7, 8, 2, 9, 8 };
// //         int n = arr.length;
// //         System.out.println("Before Sorting");
// //         printArray(arr);
// //         mergeSort(arr, 0, n - 1);
// //         System.out.println();
// //         System.out.println("After Sorting ");
// //         printArray(arr);
// //     }
// // }

// //MARGE SORT

// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }
// //     static void marge(int arr[],int l,int mid,int r){
// //         int n1=mid-l+1;
// //         int n2=r-mid;

// //         int left[]=new int[n1];
// //         int right[]=new int[n2];
// //         int i,j,k;

// //         for( i=0;i<n1;i++) left[i]=arr[l+i];
// //         for( j=0;j<n2;j++) right[j]=arr[mid+1+j];

// //         i=0;
// //         j=0;
// //         k=l;

// //         while(i<n1 && j<n2){
// //             if(left[i]<right[j]){
// //                 arr[k++]=left[i++];
// //             }
// //             else
// //             arr[k++]=right[j++];
// //         }

// //         while(i<n1){
// //             arr[k++]=left[i++];
// //         }
// //          while(j<n2){
// //             arr[k++]=right[j++];
// //         }

// //     }

// //     static void margeSort(int arr[], int l, int r) {
// //         if(l>=r) return;
// //         int mid =(l+r)/2;
// //         margeSort(arr, l, mid);
// //         margeSort(arr, mid+1, r);

// //         marge(arr, l, mid, r);

// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 4, 7, 8, 9, 1, 6 };
// //         int n = arr.length;
// //         System.out.println("Before Sorting");
// //         printArray(arr);
// //         margeSort(arr, 0, n - 1);
// //         System.out.println();
// //         System.out.println("after Sorting");
// //         printArray(arr);

// //     }

// // }

// // class prc{
// //     static void printArray(int arr[]){
// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //     }

// //     static void marge(int arr[],int l,int mid,int r){
// //         int n1=mid-l+1;
// //         int n2=r-mid;

// //         int left[]=new int[n1];
// //         int right[]=new int[n2];

// //         int i,j,k;
// //         for(i=0;i<n1;i++) left[i]=arr[l+i];
// //         for(j=0;j<n2;j++) right[j]=arr[mid+1+j];

// //         i=0;
// //         j=0;
// //         k=l;

// //         while(i<n1 && j<n2){
// //             if(left[i]<right[j]){
// //                 arr[k++]=left[i++];

// //             }
// //             else
// //             arr[k++]=right[j++];

// //         }

// //         while(i<n1){
// //             arr[k++]=left[i++];
// //         }

// //           while(j<n2){
// //             arr[k++]=right[j++];
// //         }

// //     }

// //     static void margeSort(int arr[],int l,int r){
// //         if(l>=r) return;

// //         int mid=(l+r)/2;

// //         margeSort(arr, l, mid);
// //         margeSort(arr, mid+1, r);

// //         marge(arr, l, mid, r);
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={5,7,2,1,6,3};
// //         int n=arr.length;
// //         System.out.println("Before Sorting ");
// //         printArray(arr);
// //         margeSort(arr, 0, n-1);
// //         System.out.println();
// //         System.out.println("After Sorting");
// //         printArray(arr);
// //     }
// // }

// //MARGE 

// //  class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     static void marge(int arr[], int l, int mid, int r) {
// //         int n1 = mid - l + 1;
// //         int n2 = r-mid;

// //         int left[] = new int[n1];
// //         int right[] = new int[n2];

// //         int i, j, k;
// //         for (i = 0; i < n1; i++)
// //             left[i] = arr[l + i];
// //         for (j = 0; j < n2; j++)
// //             right[j] = arr[mid + 1 + j];

// //         i = 0;
// //         j = 0;
// //         k = l;

// //         while (i < n1 && j < n2) {
// //             if (left[i] < right[j]) {
// //                 arr[k++] = left[i++];
// //             } else
// //                 arr[k++] = right[j++];
// //         }
// //         while (i < n1) {
// //             arr[k++] = left[i++];
// //         }

// //         while (j < n2) {
// //             arr[k++] = right[j++];
// //         }
// //     }

// //     static void margeSort(int arr[], int l, int r) {
// //         if (l >= r)
// //             return;
// //         int mid = (l + r) / 2;

// //         margeSort(arr, l, mid);
// //         margeSort(arr, mid + 1, r);

// //         marge(arr, l, mid, r);

// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 3, 6, 1, 2, 7, 9 };
// //         int n = arr.length;
// //         margeSort(arr, 0, n - 1);
// //         printArray(arr);

// //     }
// // }

// //QUICK SORT

// // class prc{
// //     static void printArray(int arr[]){
// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //     }
// //     static void swap(int arr[],int x,int y){
// //         int temp=arr[x];
// //         arr[x]=arr[y];
// //         arr[y]=temp;
// //     }

// //     static int partition(int arr[],int start,int end){
// //         int pivot=arr[start];

// //         int count=0;
// //         for(int i=start+1;i<=end;i++){
// //             if(arr[i]<=pivot){
// //                 count++;
// //             }
// //         }

// //         int pivot_index=start+count;
// //         swap(arr, start, pivot_index);

// //         int i=start;
// //         int j=end;
// //         while(i<pivot_index && j>pivot_index){
// //             while(arr[i]<=pivot){
// //                 i++;
// //             }
// //              while(arr[j]>pivot){
// //                 j--;
// //             }
// //             if(i<pivot_index && j> pivot_index){
// //                 swap(arr, i, j);
// //                 i++;
// //                 j--;
// //             }
// //         }
// //         return pivot_index;

// //     }

// //     static void quickSort(int arr[],int start,int end){
// //         if(start>=end) return;

// //         int pi=partition(arr, start, end);

// //         quickSort(arr, start, pi-1);
// //         quickSort(arr, pi+1, end);

// //     }
// //     public static void main(String[] args) {
// //         int arr[]={3,1,5,7,9,2};
// //         int n=arr.length-1;
// //         System.out.println("Before Sorting ");
// //         quickSort(arr, 0, n);
// //         System.out.println("After Sorting ");
// //         System.out.println();
// //         printArray(arr);

// //     }
// // }

// // class prc{
// //     static void printArray(int arr[]){
// //         for(int i:arr){
// //             System.out.print(i+" ");
// //         }
// //     }
// //     static void swap(int arr[],int x, int y){
// //         int temp=arr[x];
// //         arr[x]=arr[y];
// //         arr[y]=temp;

// //     }
// //     static int partition(int arr[],int start,int end){
// //         int pivot=arr[start];
// //         int count=0;

// //         for(int i=start+1;i<=end;i++){
// //             if(arr[i]<pivot){
// //                 count++;
// //             }
// //         }

// //         int pivot_index=start+count;
// //         swap(arr, start, pivot_index);

// //         int i=start;
// //         int j=end;

// //         while(i<pivot_index && j>pivot_index){
// //             while(arr[i]<pivot){
// //                 i++;

// //             }
// //             while(arr[j]>pivot){
// //                 j--;
// //             }

// //             if(i<pivot_index && j> pivot_index){
// //                 swap(arr, i, j);
// //                 i++;
// //                 j--;
// //             }
// //         }
// //         return pivot_index;

// //     }

// //     static void quickSort(int arr [],int start, int end ){
// //         if(start>=end) return;

// //         int pi=partition(arr, start, end);

// //         quickSort(arr, start, pi);
// //         quickSort(arr, pi+1,end);

// //     }
// //     public static void main(String[] args) {
// //         int arr[]={3,6,2,4,9,5};
// //         int n=arr.length-1;
// //         System.out.println("Before Sorting ");
// //         printArray(arr);
// //         System.out.println();
// //         quickSort(arr, 0, n);
// //         System.out.println("After Sorting ");
// //         printArray(arr);

// //     }
// // }

// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     static void marge(int arr[], int l, int mid, int r) {
// //         int n1 = mid - l + 1;
// //         int n2 = r - mid ;

// //         int left[] = new int[n1];
// //         int right[] = new int[n2];
// //         int i, j, k;

// //         for (i = 0; i < n1; i++) {
// //             left[i] = arr[l + i];
// //         }
// //         for (j = 0; j < n2; j++) {
// //             right[j] = arr[mid + 1 + j];
// //         }

// //         i = 0;
// //         j = 0;
// //         k = l;

// //         while (i < n1 && j < n2) {
// //             if (left[i] < right[j]) {
// //                 arr[k++] = left[i++];
// //             } else
// //                 arr[k++] = right[j++];
// //         }

// //         while (i < n1) {
// //             arr[k++] = left[i++];
// //         }

// //         while (j < n2) {
// //             arr[k++] = right[j++];
// //         }

// //     }

// //     static void margeSort(int arr[], int l, int r) {
// //         if (l >= r)
// //             return;
// //         int mid = (l + r) / 2;

// //         margeSort(arr, l, mid);
// //         margeSort(arr, mid + 1, r);

// //         marge(arr, l, mid, r);

// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 3, 5, 8, 4, 19, 7 };
// //         int n = arr.length;
// //         System.out.println("Array before Sorting ");
// //         printArray(arr);
// //         System.out.println();
// //         margeSort(arr, 0, n-1);
// //         System.out.println("After sorting ");
// //         printArray(arr);

// //     }
// // }

// //Binary Search

// // class prc{
// //     static boolean binarySearch(int arr[],int target){
// //         int n=arr.length;
// //         int start=0;
// //         int end=n-1;

// //         while(start<=end){
// //             int mid=(start+end)/2;
// //             if(arr[mid]==target){
// //                 return true;
// //             } else if(arr[mid]<target){
// //                 start=mid+1;
// //             }
// //             else
// //             end=mid-1;

// //         }
// //         return false;

// //     }
// //     public static void main(String[] args) {
// //         int arr[]={1,2,3,4,5,6,7};
// //         int target=10;
// //         System.out.println(binarySearch(arr, target));

// //     }
// // }

// //Binary Search

// // class prc{
// //     static boolean binarySearch(int arr[],int target){
// //         int n=arr.length;
// //         int st=0, end=n-1;

// //         while(st<=end){
// //             int mid=st+(end-st)/2;
// //             if(arr[mid]==target){
// //                 return true;

// //             }
// //             else if(arr[mid]>target){
// //                 end=mid-1;
// //             }
// //             else{
// //                 st=mid+1;
// //             }

// //             }
// //             return false;
// //         }

// //     public static void main(String[] args) {
// //         int arr[]={1,2,3,4,5,6,7,8};
// //         int target=16;
// //         System.out.println(binarySearch(arr, target));

// //     }
// // }

// //Bubble Sort

// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     static void bubbleSort(int arr[]) {
// //         int n = arr.length;
// //         for (int i = 0; i < n - 1; i++) {
// //             for (int j = 0; j < n - 1 - i; j++) {
// //                 if (arr[j] > arr[j + 1]) {
// //                     int temp = arr[j];
// //                     arr[j] = arr[j + 1];
// //                     arr[j + 1] = temp;
// //                 }
// //             }
// //         }

// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 4, 3, 1, 6, 9, 5, 8 };
// //         System.out.println("Before sorting ");
// //         printArray(arr);
// //         bubbleSort(arr);
// //         System.out.println();
// //         System.out.println("After sorting ");
// //         printArray(arr);

// //     }
// // }

// //Selection Sort

// // class prc{
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //      }
// //     static void selectionSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             int min_index=i;
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[j]<arr[min_index]){
// //                     min_index=j;
// //                 }

// //             }
// //             int temp=arr[i];
// //             arr[i]=arr[min_index];
// //             arr[min_index]=temp;
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={2,5,3,7,8,1};
// //         System.out.println("Before Sorting");
// //         printArray(arr);
// //         System.out.println();

// //         selectionSort(arr);
// //         System.out.println("After sorting");
// //         printArray(arr);

// //     }
// // }

// // Selection Sort

// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     static void selectionSort(int arr[]) {
// //         int n = arr.length;
// //         for (int i = 0; i < n - 1; i++) {
// //             int min_index = i;
// //             for (int j = i + 1; j < n; j++) {
// //                 if (arr[j] < arr[min_index]) {
// //                     min_index = j;
// //                 }
// //             }
// //             int temp = arr[i];
// //             arr[i] = arr[min_index];
// //             arr[min_index] = temp;

// //         }
// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 4, 5, 9, 3, 2, 1 };
// //         System.out.println("Before Sorting");
// //         printArray(arr);
// //         System.out.println();
// //         selectionSort(arr);
// //         System.out.println("After Sorting ");

// //         printArray(arr);
// //     }
// // }

// //Bubble Sort
// // class prc {
// //     static void printArray(int arr[]) {
// //         for (int i : arr) {
// //             System.out.print(i + " ");
// //         }
// //     }

// //     static void bubbleSort(int arr[]){
// //         int n=arr.length;
// //         for(int i=0;i<n-1;i++){
// //             for(int j=0;j<n-1-i;j++){
// //                 if(arr[j]>arr[j+1]){
// //                     int temp=arr[j];
// //                     arr[j]=arr[j+1];
// //                     arr[j+1]=temp;

// //                 }
// //             }
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int arr[]={3,5,1,7,5,9,6};
// //         System.out.println("Before Sorting ");
// //         printArray(arr);
// //         System.out.println();
// //         bubbleSort(arr);
// //         System.out.println("After Sorting");
// //         printArray(arr);

// //     }
// // }
// // import java.util.*;

// // class prc{
// //     public static void main(String[] args) {
// //         Scanner sc =new Scanner(System.in);
// //         String str1= sc.next();
// //          StringBuffer newStr=new StringBuffer(str1);    

// //         for(int i = 0; i < str1.length(); i++) {    
// //             if(Character.isLowerCase(str1.charAt(i))) {       
// //                 newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
// //             }    
// //             else if(Character.isUpperCase(str1.charAt(i))) {      
// //                 newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
// //             }    
// //         }
// //         String result=newStr.toString();
// //     }
// // }

// //  import java.util.*;

// // class prc {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter your String ");
// //         String str = sc.next();
// //         String ans = "" + str.charAt(0);
// //         int count = 1;

// //         for (int i = 1; i < str.length(); i++) {

// //             char current = str.charAt(i);
// //             char previous = str.charAt(i - 1);

// //             if (current == previous) {
// //                 count++;
// //             } else {
// //                 if (count > 1)
// //                     ans += count;
// //                 count = 1;
// //                 ans += current;

// //             }

// //         }

// //         if (count > 1)
// //             ans += count;

// //         System.out.println(ans);

// //     }
// // }

// // import java.util.Scanner;

// // class prc {
// //     public static boolean isPalindrom(String s) {
// //         int i = 0;
// //         int j = s.length() - 1;
// //         while (i < j) {
// //             if (s.charAt(i) != s.charAt(j)) {
// //                 return false;

// //             }
// //             i++;
// //             j--;
// //         }
// //         return true;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter String");
// //         String str = sc.next();
// //         int count = 0;

// //         for (int i = 0; i < str.length(); i++) {
// //             for (int j = i + 1; j < str.length() + 1; j++) {
// //                 if (isPalindrom(str.substring(i, j)) == true) {
// //                     count++;
// //                 }
// //             }
// //         }
// //         System.out.println(count);

// //     }
// // }

// // import java.util.Arrays;
// // import java.util.Scanner;

// // class prc{
// //     public static void printArray(int arr[]){
// //         for(int i=0;i<arr.length;i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //         System.out.println();
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter  Array Size ");
// //         int size=sc.nextInt();
// //         int arr[]=new int[size];
// //         System.out.println("Enter array elements");
// //         for(int i=0;i<size;i++){
// //             arr[i]=sc.nextInt();
// //         }

// //         int evenindexArray[]=new int[size];

// //         int oddindexArray[]=new int[size];

// //         for(int i=0;i<size;i++){
// //             if(i % 2== 0){
// //                 evenindexArray[i]=arr[i];
// //             }else{
// //                 oddindexArray[i]=arr[i];
// //             }
// //         }

// //         System.out.println("Even index Array is: ");
// //         printArray(evenindexArray);
// //         System.out.println("\nOdd index Array is: ");
// //         printArray(oddindexArray);
// //         System.out.println();

// //         Arrays.sort(evenindexArray);
// //         printArray(evenindexArray);
// //         System.out.println();
// //         Arrays.sort(oddindexArray);
// //         //System.out.println();
// //         printArray(oddindexArray);

// //         int sLofEven=evenindexArray[evenindexArray.length-2];
// //         System.out.println(sLofEven);
// //         int sLofOdd=oddindexArray[oddindexArray.length-2];
// //         System.out.println(sLofOdd);

// //         int sumOfSl=sLofEven+sLofOdd;
// //         System.out.println("The Sum of Second  Largest is-"+sumOfSl);

// //     }
// // }

// // import java.util.ArrayList;

// // class prc{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list1=new ArrayList<>();
// //         list1.add(5);
// //         list1.add(4);
// //         list1.add(7);
// //         list1.add(9);

// //         //System.out.println(list1.get(1));

// //         // for(int i=0;i<list1.size();i++)
// //         // {
// //         //     System.out.println(list1.get(i)+" ");
// //         // }

// //         System.out.println("The size is-"+list1.size());
// //         System.out.println(list1);

// //         // Add element at i th index
// //         list1.add(1,100);
// //         System.out.println(list1);
// //         //change value at i th index
// //         list1.set(1, 7);
// //         System.out.println(list1);
// //         //removing element
// //         //list1.remove(2);
// //         //System.out.println(list1);

// //         //remove element without index
// //        /// list1.remove(Integer.valueOf(7));
// //         //System.out.println(list1);
// //         list1.add(7);
// //         System.out.println(list1.contains(Integer.valueOf(7)));
// //         System.out.println(list1.indexOf(7));
// //         System.out.println(list1);
// //         System.out.println(list1.lastIndexOf(7));
// //         System.out.println(list1.isEmpty());
// //         System.out.println(list1);

// //         //ArrayList<> list=new ArrayList<>();
// //         // ArrayList<Object> list =new ArrayList<>();

// //         // list.add("Biswarup");
// //         // list.add(7);
// //         // System.out.println(list);

// //     }
// // }

// // import java.util.ArrayList;
// // import java.util.Collections;
// // import java.util.Scanner;

// // class prc{
// //     public static String DectoNBase(int n,int num){
// //         int quotient=num/n;
// //         //int remainder=num%n;
// //         String ans="";
// //         ArrayList<Integer> rem=new ArrayList<>();
// //         rem.add(num %n);

// //         while(quotient !=0){

// //             rem.add(quotient%n);
// //             quotient/=n;
// //         }
// //         Collections.reverse(rem);

// //         for(int i=0;i<rem.size();i++){
// //             if(rem.get(i)>9){
// //                 ans+= (char) (rem.get(i)-9+64);
// //             }else{
// //                 ans+=rem.get(i);
// //             }
// //         }
// //         return ans;

// //     }
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter the value of n:");
// //         int n=sc.nextInt();

// //         System.out.println("eNTER the value of num:");
// //         int num=sc.nextInt();
// //         System.out.println(DectoNBase(n, num));

// //     }
// // }
// // class prc{
// //     public static void main(String[] args) {
// //         String s="abc";
// //         String arr[]=new String[256];
// //         System.out.println(s.charAt(0));
// //         System.out.println(arr[s.charAt(1)]);
// //     }
// // }

// // class Solution {
// //     public boolean isIsomorphic(String s, String t) {

// //     if(s.length() != t.length())
// //         return false;

// //     int[] map1 = new int[256];
// //     int[] map2 = new int[250];

// //     for(int idx = 0; idx < s.length(); idx++){
// //         if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
// //             return false;

// //         map2[t.charAt(idx)] = idx + 1;
// //         map1[s.charAt(idx)]=idx+1;
// //     }
// //     return true;    // Otherwise return true...
// // }

// // import java.util.*;

// // class prc {
// //   public static void main(String[] args) {
// //     Scanner sc = new Scanner(System.in);
// //     int arr[] = new int[5];
// //     System.out.println("Enter array elements- ");
// //     for (int i = 0; i < arr.length; i++) {
// //       arr[i] = sc.nextInt();
// //     }
// //     int ans = -1;
// //     System.out.println("Enter the target element");
// //     int target = sc.nextInt();
// //     for (int i = 0; i < arr.length; i++) {
// //       if (arr[i] == target) {
// //         ans = i;
// //       }

// //     }

// //     System.out.println(ans);
// //   }

// // }
// import java.util.*;

// class prc {
//   public static void printArray(int arr[]) {
//     for (int i : arr) {
//       System.out.println(i);
//     }

//   }

//   static void marge(int arr[], int l, int mid, int r) {
//     int n1 = mid - l + 1;
//     int n2 = r - mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i, j, k;

//     for (i = 0; i < n1; i++) {
//       left[i] = arr[l + i];
//     }
//     for (j = 0; j < n2; j++) {
//       right[j] = arr[mid + 1 + j];
//     }
//     i=0;
//     j=0;
//     k=l;
//     while(i<n1 && j<n2){
//       if(left[i]<=right[j]){
//         arr[k++]=left[i++];
//       }else{
//         arr[k++]=right[j++];
//       }
//     }
//     while(i<n1){
//       arr[k++]=left[i++];
//     }
//     while(j<n2){
//       arr[k++]=right[j++];
//     }
//   }

//   static void margeSort(int arr[], int l, int r) {
//     if (l >= r) {
//       return;
//     }
//     int mid = (l + r) / 2;
//     margeSort(arr, l, mid);
//     margeSort(arr, mid + 1, r);
//     marge(arr, l, mid, r);
//   }

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the array size");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements : ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();

//     }
//     System.out.println("Before Shorting ");
//     printArray(arr);

//     System.out.println("After Shorting ");
//     margeSort(arr, 0, arr.length-1);
//     printArray(arr);

//   }
// }

// import java.util.Scanner;

// class prc {
//   static void printArray(int arr[]) {
//     for (int i : arr) {
//       System.out.print(i + " ");
//     }
//   }

//   public static void marge(int arr[], int l, int mid, int r) {
//     int n1 = mid - l + 1;
//     int n2 = r - mid;
//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i, j, k;

//     for (i = 0; i < n1; i++) {
//       left[i] = arr[l + i];
//     }
//     for (j = 0; j < n2; j++) {
//       right[j] = arr[mid + 1 + j];
//     }
//     i = 0;
//     j = 0;
//     k = l;
//     while (i < n1 && j < n2) {
//       if (left[i] < right[j]) {
//         arr[k++] = left[i++];

//       } else {
//         arr[k++] = right[j++];
//       }

//     }
//     while(i<n1){
//       arr[k++]=left[i++];
//     }

//     while(j<n2){
//       arr[k++]=right[j++];
//     }

//   }

//   static void margeSort(int arr[], int l, int r) {
//     if (l >= r) {
//       return;
//     }
//     int mid = (l + r) / 2;
//     margeSort(arr, l, mid);
//     margeSort(arr, mid + 1, r);

//     marge(arr, l, mid, r);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size- ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }

//     System.out.println("Before sorting");
//     printArray(arr);
//     System.out.println();

//     System.out.println("After sorting");
//     margeSort(arr, 0, arr.length-1);
//     printArray(arr);

//   }
// }

// import java.util.Scanner;

// class prc {
//   public static int lastOccur(int arr[], int x) {
//     int lastOccurIdx = -1;
//     for (int i = arr.length - 1; i >= 0; i--) {
//       if (x == arr[i]) {
//         lastOccurIdx = i;
//         break;

//       }

//     }
//     return lastOccurIdx;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter array size- ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }
//     System.out.println("Enter the value of x");
//     int x = sc.nextInt();
//     System.out.println("Last Occure index of" + x + " " + lastOccur(arr, x));

//   }
// }

// import java.util.*;

// class prc {
//   public static boolean sortArray(int arr[]) {
//     boolean check = true;
//     for (int i = 1; i < arr.length; i++) {

//       if (arr[i] < arr[i - 1]) {
//         check = false;
//         break;
//       }
//     }
//     return check;

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array size- ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }

//     System.out.println("THE ARRAY IS SORTED-" + sortArray(arr));

//   }
// }

// import java.util.*;

// class prc {
//   public static int[] sortAndLargest(int arr[], int k) {
//     int arr2[] = new int[2];
//     Arrays.sort(arr);
//     arr2[0] = arr[k-1];
//     arr2[1] = arr[arr.length - k];
//     return arr2;

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array size- ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }
//     System.out.println("ENTER the value of k-");

//     int k = sc.nextInt();
//     int result[] = sortAndLargest(arr, k);

//     System.out.println("Smallest Element of this array is- " + result[0]);
//     System.out.println(" Largest Element of this array is- " + result[1]);
//   }

// }

// import java.util.*;

// class prc{
//   public static void printArray(int arr[]){
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
//   public static void marge(int arr[],int l,int mid,int r){
//     int n1=mid-l+1;
//     int n2=r-mid;
//     int left[]=new int[n1];
//     int right[]=new int[n2];

//     int i, j ,k;

//     for( i=0;i<n1;i++){
//       left[i]=arr[l+i];
//     }
//      for( j=0;j<n2;j++){
//       right[j]=arr[mid+1+j];
//     }

//     i=0;
//     j=0;
//     k=l;

//     while(i<n1 && j<n2){
//       if(left[i]<=right[j]){
//         arr[k++]=left[i++];
//       }else{
//         arr[k++]=right[j++];
//       }
//     }

//     while(i<n1){
//       arr[k++]=left[i++];
//     }
//       while(j<n2){
//       arr[k++]=right[j++];
//     }
//   }

//   public static void margeSort(int arr[],int l, int r){
//     if(l>=r) return;
//     int mid=(l+r)/2;

//     margeSort(arr, l, mid);
//     margeSort(arr, mid+1, r);

//     marge(arr, l, mid, r);
//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the array size: ");
//     int size=sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[]=new int[size];
//     for(int i=0;i<size;i++){
//       arr[i]=sc.nextInt();
//     }
//     System.out.println("Before sorting");
//     printArray(arr);
//     System.out.println("After sorting");
//     margeSort(arr, 0, arr.length-1);
//     printArray(arr);
//   }
// }

// import java.util.*;
// class prc{

//   public static int pairSum(int arr[],int target){
//     int n=arr.length;
//     int totalPair=0;
//     for(int i=0;i<n;i++){
//       for(int j=i+1;j<n;j++){
//         if(arr[i]+arr[j]==target){
//           totalPair++;
//         }
//       }
//     }
//     return totalPair;

//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner (System.in);
//     System.out.println("Enter the array size: ");
//      int size=sc.nextInt();
//      System.out.println("Enter array elements: ");
//      int arr[]=new int[size];
//      for(int i=0;i<size;i++){
//        arr[i]=sc.nextInt();
//      }

//      System.out.println("Enter target");
//      int target=sc.nextInt();

//      System.out.println("Total number of pair is: "+pairSum(arr, target));
//   }
// }
// import java.util.*;

// class prc{
//   public static int unique(int arr[]){
//     int ans=0;
//     for(int i=0;i<arr.length;i++){
//       for(int j=i+1;j<arr.length;j++){
//         if(arr[i]==arr[j]){
//           arr[i]=arr[j]=-1;
//           //arr[j]=-1;
//         }
//       }
//     }
//     for(int i=0;i<arr.length;i++){
//       if(arr[i]>0)
//       ans= arr[i];
//     }
//     return ans;
//   }
//   public static void main(String args[]){
//      Scanner sc=new Scanner (System.in);
//     System.out.println("Enter the array size: ");
//      int size=sc.nextInt();
//      System.out.println("Enter array elements: ");
//      int arr[]=new int[size];
//      for(int i=0;i<size;i++){
//        arr[i]=sc.nextInt();
//      }
//      System.out.println("The Unique element is- "+unique(arr));

//   }
// }

// import java.util.Scanner;

// class prc {

//   public static int reapetElement(int arr[]) {
//     int n = arr.length;
//     int ans = -1;
//     for (int i = 0; i < n; i++) {
//       for (int j = i + 1; j < n; j++) {
//         if (arr[i] == arr[j]) {
//           ans = arr[i];
//           return ans;
//         }
//       }
//     }
//     return ans;
//   }

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the array size: ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }
//     System.out.println("First Repetend element is: "+reapetElement(arr));

//   }
// }
//import java.util.*;

//import ArrayList.reverse;

// class prc{
//   public static void printArray(int arr[]){
//     for(int i:arr){
//       System.out.print(i+" ");
//     }
//   }
//   public static int[] reverseArray(int arr[]){
//     int n=arr.length;
//     int revArr[]=new int[n];
//     for( int i=n-1,j=0;i>=0;i--,j++){

//       revArr[j]=arr[i];
//     }
//     return revArr;
//   }
//  public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the array size: ");
//     int size = sc.nextInt();
//     System.out.println("Enter array elements: ");
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }
//   System.out.println("Before Reverse: ");
//   printArray(arr);

//   System.out.println("\nAfter Reverse: ");
//   int revArr[]=reverseArray(arr);
//   printArray(revArr);

//  }
// }

// class prc {
//   public static void main(String[] args) {
//     String str="Biswarup";
//     StringBuilder sb = new StringBuilder(str);
//     sb.reverse();
//     System.out.println(sb);

//     System.out.println(sb);

//     // System.out.println(sb.charAt(0)); // char At idx-0

//     // sb.setCharAt(0, 'A');
//     // System.out.println(sb);

//     // sb.insert(0, 'B');
//     // System.out.println(sb);
//     // sb.delete(1,2);
//     // System.out.println(sb);

//     // sb.append(" Mahato");
//     // System.out.println(sb);
//     // System.out.println(sb.length());
//     // sb.reverse();
//     // System.out.println(sb);

//     //Reverse using String Builder

//     // for(int i=0;i<sb.length()/2;i++){
//     //   int front=i; // front index
//     //   int end=sb.length()-1-i; // back inx

//     //   char frontChar=sb.charAt(front); 
//     //   char endChar=sb.charAt(end);

//     //   sb.setCharAt(front, endChar);
//     //   sb.setCharAt(end, frontChar);

//     // }
//     // System.out.println(sb);

//   }
// }

// import java.util.Scanner;

// class prc {

//   public static void printArray(int arr[]) {
//     for (int i : arr) {
//       System.out.print(i + " ");
//     }
//   }
//   static void swap(int arr[], int i, int j) {
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
// }

//   static int[] reverseArray(int arr[]) {
//     int n = arr.length;
//     int i = 0;
//     int j = arr.length - 1;

//     while (i < j) {
//       swap(arr, i, j);
//       i++;
//       j--;
//     }
//     return arr;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array Size: ");
//     int size = sc.nextInt();
//     System.out.println("Enter Array Elements: ");
//     int arr[] = new int[size];

//     // for (int i : arr) {
//     //   arr[i] = sc.nextInt();
//     // }

//     for(int i=0;i<size;i++){
//       arr[i]=sc.nextInt();
//     }

//     System.out.println("Before Reverse");
//     printArray(arr);
//     System.out.println("\n After Reverse");
//     reverseArray(arr);
//     printArray(arr);
//   }
// }

// import java.util.Scanner;
// class prc{

//   static int AddDiustinctSubDuplicate(int a, int b, int c, int d) {
//     int sumDistinct = 0;
//     int duplicate = 0;

//     int[] arr = {a, b, c, d};

//     for (int i = 0; i < arr.length; i++) {
//         boolean isDuplicate = false;
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[i] == arr[j]) {
//                 isDuplicate = true;
//                 break;
//             }
//         }

//         if (isDuplicate) {
//             duplicate = arr[i];
//             break;  
//         }
//     }

//     for (int num : arr) {
//         if (num != duplicate) {
//             sumDistinct += num;
//         }
//     }

//     return sumDistinct - duplicate;
// }

//   public static void main(String[] args) {

//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of four integers: ");
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int c=sc.nextInt();
//     int d=sc.nextInt();
//     System.out.println(AddDiustinctSubDuplicate(a, b, c, d));

//   }
// }

// class prc {
//     public static void main(String[] args) {
//         int a, b,c;
//         a = 6;
//         b = 84;
//         c=0;
//         while (b > 0) {
//             b = b / 2;
//             a += 6;
//             c = a + b;
//             while (c > 40) {
//                 if (c % 2 == 0) {
//                     System.out.println(a);
//                 } else {
//                     System.out.println(b);
//                 }
//                 c = c / 10;
//             }
//         }
//         System.out.println(c);

//     }

// }

// class prc {
//     public static void main(String[] args) {
//        int x=11;
//        int y=4;
//        int z=3;
//        y= !x;
//        z= !!x;
//        System.out.println("%d %d"+y,z);
//     }
// }
// import java.util.Scanner;

// class prc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number = ");
//         int n=sc.nextInt();
//         int fact=1;

//         for(int i=n;i>=1;i--){
//             fact*=i;
//         }
//         System.out.println("Factorial is: "+fact);

//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// class prc{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,7 ,3, 3,3, 2,1};
//         Map<Integer,Integer> freq=new HashMap<>();

//         for(int el:arr){
//             if(!freq.containsKey(el)){
//                 freq.put(el,1);
//             }else{
//                 freq.put(el,freq.get(el)+1);
//             }
//         }
//         int maxFreq=0;
//         int ansKey=0;

//         for(var e:freq.entrySet()){
//             if(e.getValue()>maxFreq){
//                 maxFreq=e.getValue();
//                 ansKey=e.getKey();
//             }
//         }
//         System.out.println(ansKey);

//     }
// }

// import java.util.HashMap;

// class prc {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 2, 3, 2, 3, 6, 2, 2, };
//         HashMap<Integer, Integer> freq = new HashMap<>();

//         for (int el : arr) {
//             if (!freq.containsKey(el)) {

//                 freq.put(el, 1);
//             } else {
//                 freq.put(el, freq.get(el) + 1);
//             }
//         }

//             int maxFreq = 0;
//             int ansKey = 0;

//             for (var e : freq.entrySet()) {
//                 if (maxFreq < e.getValue()) {
//                     maxFreq = e.getValue();
//                     ansKey = e.getKey();
//                 }
//             }
//             System.out.println(ansKey);

//         }
// }

// import java.util.HashMap;

// class prc {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 3, 2, 2, 2, 5 };
//         HashMap<Integer, Integer> freq = new HashMap<>();
//         for (int el : arr) {
//             if (!freq.containsKey(el)) {
//                 freq.put(el, 1);
//             } else {
//                 freq.put(el, freq.get(el) + 1);
//             }

//         }
//         int maxFreq = 0;
//             int ansKey = 0;

//         for (var e : freq.entrySet()) {
//             if (e.getValue() > maxFreq) {
//                 maxFreq = e.getValue();
//                 ansKey = e.getKey();
//             }
//         }
//         System.out.println("Ans is- "+ansKey);

//     }
// }

// import java.util.Scanner;

// class prc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter String ");
//         String str1 =sc.nextLine();
//         String str= " ja va st a r";

//         // String newString =str1.replaceAll("[^a-zA-Z0-9]","");
//         // System.out.println(newString);
//         String planeStr=str.replaceAll("\\s","");
//         String withOutSp=str1.replaceAll("\\s","");

//         System.out.println(planeStr);
//         System.out.println(withOutSp);

//     }
// }

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.LinkedHashSet;

// class prc {
//     public static void main(String[] args) {
//         String str = "cab";
//         // Approach -1

//         char ch[] = str.toCharArray();
//         Arrays.sort(ch);
//         System.out.println(new String(ch));

//         // Approach-2
//         char ch1[] = str.toCharArray();
//         char temp;

//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i + 1; j < str.length(); j++) {
//                 if (ch1[i] > ch1[j]) {
//                     temp = ch1[i];
//                     ch1[i] = ch1[j];
//                     ch1[j] = temp;

//                 }

//             }
//         }
//         System.out.println(new String(ch1));

//     }
// }

// import java.util.HashMap;
// import java.util.Scanner;

// class prc{
//     static HashMap<Character,Integer> makeFreq(String str){
//         HashMap<Character,Integer> mp=new HashMap<>();
//         for(int i=0;i<str.length();i++){
//             char firstch=str.charAt(i);

//             if(!mp.containsKey(firstch)){
//                 mp.put(firstch, 1);
//             }else{
//                 mp.put(firstch, mp.get(firstch+1));
//             }
//         }
//         return mp;

//     }
//     static boolean isAnagram(String str1,String str2){
//         if(str1.length()!=str2.length()) return false;

//         HashMap<Character,Integer> mp1=makeFreq(str1);
//         HashMap<Character,Integer> mp2=makeFreq(str2);

//         return mp1.equals(mp2);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter First String ");
//         String str1  = sc.next();
//         System.out.println("Enter Second String ");
//         String str2 = sc.next();

//         System.out.println("String is anagram: "+isAnagram(str1, str2));
//     }
// }

// import java.util.HashMap;
// import java.util.Scanner;

// class prc{
// public static boolean isIsomorphic(String s,String t){
//     HashMap<Character,Character> mp=new HashMap<>();
//     if (s.length()!=t.length()) return false;

//     for(int i=0;i<s.length();i++){
//         char chS=s.charAt(i);
//         char chT=t.charAt(i);

//         if(mp.containsKey(chS)){
//             if(mp.get(chS)!= chT) return  false;
//         }else if(mp.containsKey(chT)){
//             return false;
//         }else{
//             mp.put(chS,chT);
//         }

//     }
//     return true;

// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two string");
//         String str1=sc.next();
//         String str2=sc.next();
//         String s=str1+str2;
//         System.out.println(s);
//         // System.out.println("String are isomorphic: "+isIsomorphic(str1, str2));
//     }
// }

// import java.util.HashSet;
// import java.util.Scanner;

// class prc{
//      public static boolean isPrime(int n)
//         {
//             for (int j = 2; j*j<=n; j++) {
//                 if (n % j == 0) {
//                     return false;
//                 }
//             }
//             return true;
//         }
//     public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);

// System.out.println("Enter String ");
// String str=sc.next();
// StringBuilder sb=new StringBuilder();

// HashSet<Character>set= new HashSet<>();

// for(int i=0;i<str.length();i++){
//     set.add(str.charAt(i));
// }
// for(Character ch:set){
//     sb.append(ch);

// }
// System.out.println(sb.toString());

//     }
// }

// import java.util.HashMap;
// import java.util.Scanner;

// class prc{
//     static HashMap<Character,Integer> makefreq(String s){
//         HashMap<Character,Integer> freq=new HashMap<>();

//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(!freq.containsKey(ch)){
//                 freq.put(ch, 1);
//             }else{
//                 freq.put(ch,freq.get(ch));

//             }
//         }
//         return freq;

//     }

//     public static boolean isAnagram(String str1,String str2){
//         if(str1.length() != str2.length()) return false;

//          HashMap<Character,Integer> mp1=makefreq(str1);
//          HashMap<Character,Integer> mp2=makefreq(str2);
//          return mp1.equals(mp2);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter string 1");
//         String str1=sc.next();

//         System.out.println("Enter string 2");
//         String str2=sc.next();

//         System.out.println(isAnagram(str1, str2));

//     }
// }

// import java.util.ArrayList;

// class prc{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();

//         for(int i=1;i<=5;i++){
//             list.add(i);
//         }
//         System.out.println(list);
//         list.add(0,0);
//         System.out.println(list);
//     }

// }

// import java.util.Scanner;

// class prc{
//     static String camalcase(String s){
//         StringBuilder sb = new StringBuilder();
//         sb.append(Character.toLowerCase(s.charAt(0)));
//         for(int i=1;i<s.length();i++){
//             if(s.charAt(i)>=65 || s.charAt(i)<=90){
//                 System.out.println(sb);
//                 sb.setLength(0);
//                 sb.append(Character.toLowerCase(s.charAt(i)));

//             }else{
//                 sb.append(Character.toUpperCase(s.charAt(i)));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter String: ");
//         String s=sc.next();
//         System.out.println(camalcase(s));
//     }
// }

// import java.util.Scanner;

// class prc{
//     static boolean isPalindrom(String s){

//         StringBuilder sb=new StringBuilder(s);
//         String rev =sb.reverse().toString();
//         if(s.equals(rev)){
//             return true;
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter String");
//         String s=sc.next();
//         System.out.println("String is Palindrome: "+isPalindrom(s));

//     }
// }

// import java.util.Scanner;

// class prc{
//     static int fibo(int n,int dp[]){
//         if(n==1 || n==0) return 1;
//         if(dp[n]!=-1) return dp[n];

//         return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n=sc.nextInt();

//         int dp[]=new int[n+1];
//         for(int i=0;i<=n;i++){
//             dp[i]=-1;

//         }
//         System.out.println(fibo(n, dp));

//     }
// }

// import java.util.HashMap;
// import java.util.Scanner;

// class prc {
//     static HashMap<Character, Integer> makeFreq(String str1) {
//         HashMap<Character, Integer> freq = new HashMap<>();
//         for (int i = 0; i < str1.length(); i++) {
//             char ch = str1.charAt(i);
//             if (!freq.containsKey(ch)) {
//                 freq.put(ch, 1);
//             } else {
//                 int currentFreq = freq.get(ch);
//                 freq.put(ch, currentFreq + 1);
//             }
//         }
//         return freq;
//     }

//     static boolean isAnagram(String str1, String str2) {
//         if (str1.length() != str2.length())
//             return false;
//         HashMap<Character, Integer> mp1 = makeFreq(str1);
//         HashMap<Character, Integer> mp2 = makeFreq(str2);

//         return mp1.equals(mp2);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String1 ");
//         String str1 = sc.next();
//         System.out.println("Enter String2 ");
//         String str2 = sc.next();
//         System.out.println(isAnagram(str1, str2));

//     }
// }

// import java.util.ArrayList;
// import java.util.Iterator;

// class prc{
//     public static void main(String[] args)
//     {
//       ArrayList<String> list = new ArrayList<>(); 
//       list.add("I"); 
//       list.add("Love"); 
//       list.add("Java"); 
//       list.add("Language"); 
//       Iterator<Object> iter = list.iterator(); 
//       while (iter.hasNext())
//          System.out.print (iter.next().toString() + " "); 
//       System.out.println();
//      }
// }

// class prc{

//    public class Animal{

//       public void eat(){
//          System.out.println("I am eating");

//       }

//       public void run(){
//          System.out.println("I can run");
//       }

//    }

//    public class Bird{
//       public void fly(){
//          System.out.println("Bird can fly");
//       }
//    }

//       public static void main(String[] args) {

//       prc obj1 = new prc();   

//       Animal cat = obj1.new Animal();
//       Animal dog = obj1.new Animal();
//       Bird mitu  = obj1.new Bird();

//       cat.run();
//       cat.eat();

//       dog.run();
//       mitu.fly();

//    }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// class prc{
//    public static int sumOf(int arr[]){
//       int n=arr.length;
//       int arrEven[]=new int[n];
//       int arrOdd[]=new int[n];

//       for(int i=0;i<n;i++){
//          if(i % 2 == 0){
//             arrEven[i]=arr[i];
//          }else{
//             arrOdd[i]=arr[i];
//          }
//       }
//       Arrays.sort(arrEven);
//       Arrays.sort(arrOdd);
//       return (arrEven[arrEven.length-2] + arrOdd[arrOdd.length-2]);
//    }
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter Array size:");
//       int n=sc.nextInt();
//       System.out.println("Enter array Elements: ");
//       int arr[]=new int[n];

//       for(int i=0;i<n;i++){
//          arr[i]=sc.nextInt();
//       }

//       System.out.println("Ans is- "+ sumOf(arr));
//    }
// }

// import java.util.Scanner;

// class prc{
//     public static void printArray(int arr[]){
//         int n =arr.length;
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array Size");
//         int Size = sc.nextInt();
//         System.out.println("Enter array elements: ");
//         int arr[]=new int[Size];

//         for(int i=0;i<Size;i++){
//             arr[i]=sc.nextInt();
//         }

//         int evenIndexArray[] = new int[Size]; 
//         int oddIndexArray[] = new int[Size]; 

//         for(int i=0;i<Size;i++){
//             if(i % 2 == 0){
//                 evenIndexArray[i] = arr[i];
//             }else{
//                 oddIndexArray[i] = arr[i];
//             }
//         }

//         int slOfEven = evenIndexArray[Size-2];
//         printArray(evenIndexArray);
//         int slOfOdd = oddIndexArray[Size-2];
//         printArray(oddIndexArray);

//         int sum = slOfEven + slOfOdd;
//         System.out.println("Sum is "+sum);

//     }
// }

// import java.util.Scanner;

// class prc{
//     static int add(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Two Number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The Some of Two Num is = ");
//         add(a,b);

//     }
// }

//  import java.util.Scanner;
// class prc{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The size of The array");
//         int n=sc.nextInt();
//         int arr [] = new int[n];

//         System.out.println("Enter " + n + "  array Elements : ");

//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Array is : ");
//         for(int i = 0; i<n; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }

// import java.util.Scanner;

// class prc{

//     // public static int occurrencesCounter(int arr[],int x){
//     //     int count = 0;
//     //     for(int i = 0; i < arr.length; i++){
//     //         if( x == arr[i]){
//     //             count++;
//     //         }
//     //     }

//     //     return count;

//     // }

//     public static void lastOccur(int arr[],  int x){
//         int lastOcc = -1;

//         for(int i = arr.length-1; i >= 0; i--){

//             if( arr[i] == x){
//                  lastOcc = i;
//                 // System.out.println("Last Time occurs in "+ lastOcc +" index");
//                 break;

//             }

//         }
//         if (lastOcc != -1) {
//             System.out.println("Last occurrence of " + x + " is at index " + lastOcc);
//         } else {
//             System.out.println(x + " not found in the array");
//         }

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Array Size ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter array elements : ");

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("array is ");

//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] +"\n");
//         }

//         System.out.println("Give a Value  : ");
//         int x = sc.nextInt();

//         lastOccur(arr, x);

//     }
// }

// import java.util.Scanner;

// class prc{
//     public static void main(String[] args) {
//         int arr1[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array elements ");

//         for(int i= 0; i<5;i++){
//             arr1[i] = sc.nextInt();

//         }

//         int arr2[] = arr1;

//         System.out.println("Original Array");

//         for(int i= 0; i<5;i++){
//             System.out.println(arr1[i]);
//         }

//         System.out.println("Copy Array");

//         for(int i= 0; i<5;i++){
//             System.out.println(arr2[i]);
//         }

//         arr2[0] = 9;
//         arr2[1] = 9;

//         System.out.println("Update array");

//         for(int i= 0; i<5;i++){
//             System.out.println(arr1[i]);
//         }

//     }
// }

// import java.util.Scanner;

// class prc{

//     public static int  pairSum(int arr[] ,int sum){
//         int totalPairs = 0;
//         for(int i = 0; i<arr.length; i++){
//             for(int j = 1; j< arr.length; j++){
//                 if(arr[i] + arr[j] == sum){
//                     totalPairs++;
//                 }

//             }
//         }
//         return totalPairs;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter array Elements");
//         for(int i = 0; i < n ; i++){
//             arr[i] = sc.nextInt();

//         }

//         System.out.println("enter the sum you want to Fiend");
//         int sum =sc.nextInt();

//         System.out.println("Total Number of Pairs is " + pairSum(arr, sum));

//     }
// }

// import java.util.Scanner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * prc
 */
// public class prc {
// static void printArray(int arr[]) {
// System.out.println("ARRAY IS ");

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// System.out.println("Enter the Array Size: ");
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int arr[] = new int[size];
// System.out.println("Enter array Elements ");
// int sum = 0;

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// for (int el : arr) {
// sum += el;
// }
// // for(int i = 0; i<size; i++){
// // sum+= arr[i];
// // }
// System.out.println("Sum is:" + sum);

// sc.close();

// }
// }

// class prc {

//     public static void isPresent(int arr[], int x){
//         int ans = -1;
//         for (int i = 0; i < arr.length;i++) {

//             if(x == arr[i]){
//                 ans = i;
//                 break;
//             }

//         }
//         if(ans == -1){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("X founded in index "+ ans);
//         }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array Size");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         System.out.println("Enter array Elements");

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();

//         }
//         System.out.println("Enter the value of X");
//         int x = sc.nextInt();

//         isPresent(arr, x);

//     }
// }

// class prc{

//     static void printArray(int arr[]) {

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     static int lastOccerence (int arr[], int x){

//         int lastIdx = -1;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] == x) lastIdx = i;
//         }
//         return lastIdx;
//     }

//     static boolean isSorted (int arr[]){

//         for(int i=0; i<arr.length-1;i++){
//             if(arr[i] > arr[i+1]) return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter array Elements");

//         for(int i =0; i<n ;i++){
//             arr[i] = sc.nextInt();
//         }

//         // int arr2[] =arr.clone();
//         // System.out.println("Enter the value of X: ");
//         // int x = sc.nextInt();

//         // int last = lastOccerence(arr, x);
//         // if(last == -1){
//         //     System.out.println("Not Found");
//         // }else{
//         //     System.out.println("Last Occurs in "+last+ " index");
//         // }

//       System.out.println(isSorted(arr));

//         sc.close();

//     }
// }

/**
 * prc
 */
// public class prc {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int mx =Integer.MIN_VALUE;

//         int arr[] = {1,2,3,7,8,5};
//         int idx=-1;

//         for(int i =0; i<arr.length; i++){
//             if( arr[i]>mx){
//                 mx= arr[i];  
//                 idx = i;
//             } 
//         }

//         System.out.println("Max val is "+mx + " in index "+ idx);
//         arr[idx] = Integer.MIN_VALUE;
//         mx = Integer.MIN_VALUE;

//         for(int i = 0; i< arr.length; i++){
//             if( arr[i] > mx){
//                 mx = arr[i];
//             }

//         }
//         System.out.println("2nd max is "+ mx);
//     }
// }

// import java.util.ArrayList;

// class prc{
//     public static void main(String args[]){
//         int arr[] = {23,45,34,67};

//         ArrayList<Integer> myList = new ArrayList<>();

//         for(int i = 0; i<arr.length; i++){
//             myList.add(arr[i]/10);
//             myList.add(arr[i]%10);
//         }
//         System.out.println(myList);

//     }
// }

// class prc{
//     public static void swap(int arr[],int i, int j) {
//         int temp = arr[i];

//          arr[i]= arr[j];
//          arr[j] = temp;
//     }

//     public static void main(String[] args) {

//         int arr[] = {1,2,3,4,5};

//     //    for(int i =0 ; i < arr.length/2;i++){
//     //     int j = arr.length -1 -i;
//     //     swap(arr, i, j);

//     //    }
//     int i =0;
//     int j = arr.length-1;

//     while (i<j) {
//         swap(arr, i, j);
//         i++;
//         j--;

//     }

//         for( int el : arr){
//             System.out.print(el +" ");
//         }
//     }
// }

/**
 * prc
 */

// public class prc {

//     public static void printArray(int arr[]){
//         for(int el :arr){
//             System.out.print(el+ " ");
//         }

//     }

//     public static int[] rotate(int arr[],int k){
//         int n = arr.length;
//         k = k % n;
//         int ans [] = new int[n];
//         int j =0;
//         for(int i = n-k; i<n; i++){
//             ans[j++] = arr[i];
//         }

//         for(int i=0; i<= n-k-1; i++){
//             ans[j++] = arr[i];
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
//         Scanner sc = new Scanner(System.in);
//         int n = arr.length;
//         System.out.println("Enter the value of K ");
//         int k = sc.nextInt();
//         int ans[] = new int[arr.length] ;

//         // for(int i = n-k ; i<arr.length;i++){
//         //     ans[i] = arr[i]; 
//         // }
//         // for(int i=0; i<=n-k-1; i++){
//         //     ans[i] = arr[i];
//         // }

//         for(int i = 0; i < n; i++){
//             ans[(i + k) % n] = arr[i];
//         }

//         printArray(ans);
//         System.out.println("");
//         printArray(arr);

//         System.out.println("\n By Method ");
//         int ans2[] = rotate(arr, k);
//         printArray(ans2);

//     }
// }

/**
 * prc
 */
// public class prc {

//     public static void  printArray(int arr[]){

//         for(int el : arr){
//             System.out.print(el+ " ");
//         }
//     }

//     static int[] rotate(int arr[], int k){
//         int n = arr.length;
//         k = k%n;
//         int j = 0;
//         int ans [] = new int[n];

//         for(int i = n-k; i<n; i++){
//             ans[j++] = arr[i];
//         }
//         for(int i =0 ; i<= n-k-1; i++){
//             ans[j++] = arr[i];
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int arr [] = {1,2,3,4,5};
//         int n = arr.length;
//         System.out.println("Enter the value of K");
//         int k =sc.nextInt();
//         int ans[] = new int [n];

//         for(int i = 0 ; i<n; i++){
//             ans[(k+i) % n] = arr[i];
//         }
//         System.out.println("After Rotating ");

//         printArray(ans);

//         int ans2[] = rotate(arr, k);
//         System.out.println("\nSecond time ");
//         printArray(ans2);

//     }
// }

// class prc{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int n  = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         Map <Integer, Integer> mp = new HashMap<>();

//         for(int i=0; i<n ;i++){
//             if(mp.containsKey(arr[i])){
//                 mp.put(arr[i],mp.get(arr[i])+1);
//             }else{
//                 mp.put(arr[i],1);
//             }
//         }

//         System.out.println(mp.entrySet());

//         for(int key  : mp.keySet()){
//             if(mp.get(key)==1){
//                 System.out.println("unique element is : "+key);
//             }

//         }

//     }
// }

// class prc{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int n  = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter The Array Elements");
//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         sc.close();

//         Map <Integer,Integer> mp = new HashMap<>();

//         for(var ele:arr){
//             if(mp.containsKey(ele)){
//                 mp.put(ele,mp.get(ele)+1);

//             }else{
//                 mp.put(ele,1);
//             }
//         }
//         System.out.println(mp.entrySet());

//         int result = -1; 
//         int maxFreq = -1; 

//         for(var ele: mp.entrySet()){
//           if(ele.getValue()>maxFreq){
//             maxFreq = ele.getValue();
//             result = ele.getKey();
//           }

//         }
//         System.out.println("Most Freq is: "+ result);

//     }
// }

/**
 * prc
 */
// public class prc {

// public static void displayArray(int arr[]){
// for(int i:arr){
// System.out.print(i+" ");
// }

// }

// public static void marge(int arr[], int l , int r , int mid){
// int n1 = (mid-l)+1;
// int n2 = r - mid;

// int left[] = new int[n1];
// int right[] = new int[n2];

// int i, j, k;

// for(i = 0; i<n1; i++) left[i] = arr[l+i];
// for(j = 0; j<n1; j++) right[j] = arr[mid+1+j];

// i = 0;
// j = 0;
// k = l;

// while(i<n1 && j<n2){
// if(left[i]< right[j]) {
// arr[k++] = left[i++];
// }else{
// arr[k++] = right[j++];
// }
// }

// while(i<n1) arr[k++] = left[i++];
// while(j<n2) arr[k++] = right[j++];

// }

// public static void margeSort(int arr[], int l,int r){
// if(l >=r) return;

// int mid = (l+r)/2;
// margeSort(arr, l, mid);
// margeSort(arr, mid+1, r);
// marge(arr, l, r, mid);

// }

// public static void main(String[] args) {
// int arr[] = {1,3,4,2,7,5,9,8};
// int n = arr.length-1;

// System.out.println("Before Sorting:");
// displayArray(arr);

// margeSort(arr, 0, n);

// System.out.println("\nAfter Sorting");
// displayArray(arr);

// }
// }

// class prc {
    
//     public static void displayArray(int arr[]){
//         for(int i:arr){
//           System.out.print(i+" ");
//         }
//   }

//   public static void marge(int arr[], int l, int r, int mid){

//     int n1 = (mid -l) + 1;
//     int n2 = r- mid;

//     int left[] = new int[n1];
//     int right[] = new int[n2];

//     int i, j ,k;
//     for( i=0; i<n1; i++) left[i]=arr[l+i];
//     for( j=0; j< n2;j++) right[j]=arr[mid+1+j];

//     i=0;
//     j=0;
//     k=l;

//     while(i<n1 && j<n2){
//         if(left[i] < right[j]) arr[k++] = left[i++];
//         else arr[k++] = right[j++];
//     }
//     while(i<n1) arr[k++] = left[i++];
//     while(j<n2) arr[k++] = right[j++];


//   }

//   public static void margeSort(int arr[],int l, int r){
//     if( l >= r) return ;

//     int mid = (l+r)/2;
//     margeSort(arr, l, mid);
//     margeSort(arr, mid+1, r);
//     marge(arr, l, r, mid);

//   }
//     public static void main(String[] args) {

//      int arr[] = {1,2,5,4,3,6,9,7,2};
//      int n = arr.length-1;
//      System.out.println("Before Shorting");
//      displayArray(arr);

//      margeSort(arr, 0, n);

//      System.out.println("\nAfter Sorting ");
//      displayArray(arr);
        
//     }
// }


// class prc{
//   public static void main(String[] args) {
//     int arr[] = {7,6,4,3,1};
//     int maxProfit = 0;
//     int profit = 0;

//     for(int i = 0; i<arr.length;i++){
//       for(int j =i+1; j<arr.length; j++){
//         if(arr[j]>arr[i]){
//            profit = arr[j] - arr[i];
//           if(maxProfit<profit){
//             maxProfit = profit;
//           }
//         }
        
//       }
//     }

//     System.out.println("So the Max Profit is: "+maxProfit);

//   }
// }


// class prc{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int arr[] = {1,2,3,4,5};
//     int n = arr.length;
//     System.out.println("Enter The Value of K ");
//     int k = sc.nextInt() %n;

//     int ans[] = new int[n];
//     int j =0;

//     for(int i = n-k; i<n; i++){
//       ans[j++]=arr[i];
//     }
//     for(int i =0; i<n-k;i++){
//       ans[j++]=arr[i];
//     }

//     for(int i:ans){
//       System.out.print(i+" ");
//     }
    
//   }
// }

// class prc{

//   public  static void printArray(int arr[]){
//     for(int i:arr){
//       System.out.print(i+" ");
//     }

//   }

//   public static void swap(int arr[], int i, int j) {
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
// }

//   public static void reverse(int arr[],int i , int j){
    
//     while(i<j){
//       swap(arr,i,j);
//       i++;
//       j--;
//     }
    
//   }
//   public static void rotateInPlace(int arr[],int k){
//     int n = arr.length;
//     k = k %n;
//     reverse(arr, 0, n-k-1);
//     reverse(arr, n-k, n-1);
//     reverse(arr, 0, n-1);

//   }
//   public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5};
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter The Value of K ");
//     int k = sc.nextInt();
//     System.out.println("Before Rotating ");
//     printArray(arr);

    
//     rotateInPlace(arr, k);
//     System.out.println("\nAfter Rotating ");
//     printArray(arr);

    
//   }
// }



import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        // Count the frequency of characters in both strings
        Map<Character, Integer> count1 = countChar(word1);
        Map<Character, Integer> count2 = countChar(word2);

        
        if (!count1.keySet().equals(count2.keySet())) {
            return false;
        }

        // Check if the frequencies of characters are the same
        for (char ch : count1.keySet()) {
            if (!count2.containsKey(ch) || count1.get(ch) != count2.get(ch)) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> countChar(String word) {
        Map<Character, Integer> count = new HashMap<>();
        for (char ch : word.toCharArray()) {
            if (!count.containsKey(ch)) {
                count.put(ch, 1);
            } else {
                count.put(ch, count.get(ch) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two String ");
        String str1= sc.next();
        String str2= sc.next();

        System.out.println(closeStrings(str1, str2));

    }
}

