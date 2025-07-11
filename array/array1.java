package ARRAY;

public class array1 {
    public static void main(String[] args){

        int[] arr = new int[2];
        arr[0]= 10;
        arr[1]= 20;

        //int[] arr = {10,20};

        System.out.println(arr[0] + " "+ arr[1]);
        swap(arr);
        System.out.println(arr[0] + " "+ arr[1]);
    }

    public static void swap(int[] x){
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }
}
