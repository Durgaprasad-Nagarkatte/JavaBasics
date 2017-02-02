
/**
 * If an Integer N, write a program to reverse the given number.
 * 
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int num = scan.nextInt();
            int mod, rev = 0;
            while(num != 0){
                mod = num%10;
                num = num/10;
                rev = rev*10 + mod;
            }
            System.out.println(rev);
        }
        scan.close();
    }
}
