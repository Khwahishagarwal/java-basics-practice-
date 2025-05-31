import java.util.*;

public class any_base_addition {

    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        System.out.println("input n1= ");
        int n1 = scn.nextInt();
        System.out.println("input n2= ");
        int n2 = scn.nextInt();
        System.out.println("input base= ");
        int b = scn.nextInt();

    int ans = getsum(n1, n2, b);
    System.out.println(ans);
    }

    public static int getsum(int n1, int n2, int b) {

        int ans = 0;
        int power = 1;
        int carry = 0;

        while(n1 != 0 || n2 != 0 || carry != 0){
            int ldn1 = n1 % 10;
            int ldn2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = ldn1 + ldn2 + carry;
            int q = sum / b;
            int r = sum % b;

            ans = ans +(r * power);
            carry = q;
            power = power * 10;
         }

         return ans;
    }
}
