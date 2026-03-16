import java.util.*;

public class BrokenEconomy {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int floor = -1;
        int ceil = -1;
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = (left+right) / 2;
            if(arr[mid]== data){
                ceil = data;
                floor = data;
                break;
            }

            else if( arr[mid] > data){
                ceil = arr[mid];
                right = mid -1;
            }

            else{
                floor = arr[mid];
                left = mid +1;
            }

        }

        System.out.println("floor: " + floor);
        System.out.println("ceil: " + ceil);
    }
}