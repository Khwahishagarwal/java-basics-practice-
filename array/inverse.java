package ARRAY;
import java.util.*;

public class inverse {
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int[] ans = inverse(arr);
        for(int i=0; i< ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int pos = arr[i];
            inv[pos] = i;
        }

        return inv;
    }

}
