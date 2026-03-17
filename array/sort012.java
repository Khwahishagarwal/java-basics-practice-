import java.util.*;

public class sort012 {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        display(arr);
    }

    public static void sort012(int[] arr){
         int i = 0;
         int j = 0;
         int k = arr.length-1;

         while(i <= k){
            if(arr[i] == 0){

                swap1(arr,i,j);
                i++;
                j++;

            }else if(arr[i] == 1) {
                i++;
            }else {

                swap2(arr,i,k);
                k--;
            }
         }
    }

    public static void swap1(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void swap2(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}