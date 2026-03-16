import java.util.*;

public class binarySearch {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        System.out.println(BinarySearch(arr,data));
    }

    public static int BinarySearch(int[] arr, int data){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid]== data){
                return mid;
            }
            else if(arr[mid] > data){
                 right = mid - 1;
            }
            else{
                left = mid + 1 ;
            }
        }

        return -1;//signifies that the element is not present in the array
    }
}
