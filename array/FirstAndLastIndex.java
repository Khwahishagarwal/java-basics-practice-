import java.util.*;

public class FirstAndLastIndex {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int fi = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == data){
               fi = mid;
               right = mid - 1; // left = mid + 1 for last index 
            }
            else if(arr[mid] < data){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(fi);
    

         left = 0;
         right = arr.length - 1;
         int li = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == data){
               li = mid;
               left = mid + 1; // left = mid + 1 for last index 
            }
            else if(arr[mid] < data){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(li);
    }
}