/* package codechef; // don't place package name! */

/**
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 * Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not .
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Primality{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++){
            int num = scan.nextInt();
            boolean isPrime = true;
            for(int j = 2; j < Math.sqrt(num); j++){
                if(num%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println("yes");
                
            }
            else{
                System.out.println("no");
            }
        }
    }
}



