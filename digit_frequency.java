import java.util.*;

public class digit_frequency {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("input number= ");
        int n = scn.nextInt();
        System.out.println("input digit= " );
        int d = scn.nextInt();

        int ans = GetDigitFrequency(n,d);
        System.out.println(ans);
    }
    
    public static int GetDigitFrequency( int n ,int d){

        int count = 0;
        while(n != 0){
            int ld = n % 10;
            n = n / 10;

            if(ld == d){
                count ++;
            }

        }
            return count;

    }
}
