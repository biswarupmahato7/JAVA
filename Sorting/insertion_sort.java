// public class insertion_sort {
//     static void insertionSort(int arr[]) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int j = i;
//             while (j > 0 && arr[j] < arr[j - 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//                 j--;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 8, 3, 6, 2, 4, 5 };
//         insertionSort(arr);
//         for (int i : arr) {
//             System.out.println(i + " ");
//         }
//     }

// }


// public class insertion_sort{
//      //ASCENDING ORDER

//     static void insertionSort(int arr[]){
//         int n=arr.length;
//         for(int i=1;i<n;i++){
//             int j=i; // j=the element we want to move it in its right position
//             while(j>0 && arr[j]<arr[j-1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j-1];
//                 arr[j-1]=temp;
//                 j--; // we swap j index with j-1 , so j's index --;
//             }
//         }
//     }
//    //DESCENDING ORDER

//     static void insertionSortDec(int arr[]){
//         int n =arr.length;
//         for(int i=1;i<n;i++){
//             int j=i;
//             while(j>0 && arr[j]>arr[j-1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j-1];
//                 arr[j-1]=temp;
//                 j--;

//             }
//         }
//     }


//     public static void main(String[] args) {
//         int arr[]={5,3,2,7,9,1};
//         insertionSort(arr);
//         System.out.println("Sorted in Increasing Order");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println(" Sorted in Dec Order");
//         insertionSortDec(arr);
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }
// }

import java.util.Scanner;

class prc{
    public static void marge(int arr[],int st,int mid,int end){
        int n1 = mid - st-1;
        int n2 = end - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        int i,j,k;
        for( i=0;i<n1;i++) arr[i] = left[st+i];
        for( j=0;i<n1;j++) arr[j] = right[mid+1+j];

        i=0;
        j=0;
        k=st;
        while(i<n1 && j<n2){
           if(left[i] < right[j]){
            arr[k++] = left[i++];
           }else{
            arr[k++] = right[j++];
           }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }

    }
    public static void margeSort(int arr[],int st,int end){
        if(st >= end) return ;
        int mid = st + (end - st)/2;
        margeSort(arr, st, mid);
        margeSort(arr, st, mid+1);
        marge(arr, st, mid, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        margeSort(arr, 0, n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}