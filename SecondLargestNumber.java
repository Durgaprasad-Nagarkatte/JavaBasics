/* package codechef; // don't place package name! */

/**
 * To find second largest number
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecondLargestNumber{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            int x3 = scan.nextInt();
            if (x1 > x2 && x1 < x3 || x1 < x2 && x1 > x3){
                System.out.println(x1);
            }
            else if (x2 > x1 && x2 < x3 || x2 < x1 && x2 > x3){
                System.out.println(x2);
            }
            else{
                System.out.println(x3);
            }
        }
    }
}


