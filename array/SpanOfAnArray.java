package ARRAY;

import java.util.*;
public class SpanOfAnArray {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int [n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int span = max-min;
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("span: " + span);
    }
}