package ARRAY;
import java.util.*;
public class Subarray {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int si=0; si < arr.length; si++){
            for(int ei=si; ei < arr.length; ei++){
                for(int i = si; i <= ei; i++){
                    System.out.println(arr[i] + "");
                }
                System.out.println();// for emtering the next line 
            }
        }
    }
    
}
