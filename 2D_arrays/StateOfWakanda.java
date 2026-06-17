import java.util.*;

public class StateOfWakanda {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//no.of rows 
        //int m = scn.nextInt();//no. of columns
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int diag = 0; diag < arr.length; diag++){
            int i=0;
            int j= diag;

            while(i < n && j < n){
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }
    }
}
