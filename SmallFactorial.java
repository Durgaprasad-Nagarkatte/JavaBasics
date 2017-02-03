/* package codechef; // don't place package name! */

/**
 * Write a program to find the factorial value of any number entered by the user.
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SmallFactorial{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int num = scan.nextInt();
            int fact = 1;
            while(num > 0){
                fact = fact * num;
                num--;
            }
            System.out.println(fact);
        }
    }
}


