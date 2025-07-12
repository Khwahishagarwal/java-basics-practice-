package ARRAY;
import java.util.*;

public class Rotate {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("length of array= ");
        int n = scn.nextInt();

        int[] nums = new int[n];
        for(int i= 0; i<n; i ++){

            System.out.println("elements of the array= ");
            nums[i] = scn.nextInt();
        }

        System.out.println("enter k= ");
    int k = scn.nextInt();
    rotate(nums,k);

    for (int num : nums) {
        System.out.print(num + " ");

    }
}


    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k<0){
            k = k + nums.length;
        }

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

        public static void reverse(int[] nums, int left, int right){

            while(left<right){

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right]= temp;

                left++;
                right--;
            }
        }
        
    }
