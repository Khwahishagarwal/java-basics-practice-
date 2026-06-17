import java.util.Scanner;

public class Rotate_by_90 {
    
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

        rotateBy90(arr);
        display(arr);
    }

    public static void rotateBy90(int[][] arr){
        //1.Take transpose

        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =  temp;
            }
        }
        //2. rearrange columns
        
        int left = 0;
        int right = arr[0].length-1;

        while(left < right){
            for(int row=0; row < arr.length; row++){
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
            } 

            left++;
            right--;
        }
    }

    public static void display(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
    }
    System.out.println();
            }
        }
}

