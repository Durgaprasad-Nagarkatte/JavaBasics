/* package codechef; // don't place package name! */

/**
 * If Give an integer N . Write a program to obtain the sum of the first and last digit of this number.
 * 
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FirstAndLastDigit{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            String num = scan.next();
            System.out.println(Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(num.length()-1)));
    }
}
}

