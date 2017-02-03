/* package codechef; // don't place package name! */

/**
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 * Ash happens to see this game and wants to simulate the same in the computer. As the first step he wants to take an input from the user and check if the number is palindrome and declare if the user wins or not 
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindromes{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++){
            boolean isPalindrome = false;
            String num = scan.next();
            int length = num.length();
            for(int j = 0; j < length; j++){
                if(num.charAt(j) == num.charAt(length-1-j)){
                    isPalindrome = true;
                }
                else{
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                System.out.println("wins");
            }
            else{
                System.out.println("losses");
            }
        }
    }
}



