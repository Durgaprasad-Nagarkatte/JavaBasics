/* package codechef; // don't place package name! */

/**
 * Consider a currency system in which there are notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Notes{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++){
            int num = scan.nextInt();
            int num_notes = 0;
            if(num >= 100){
                num_notes = (num - num%100)/100;
                num = num%100;
            }
            if(num >= 50){
                num_notes = num_notes + ((num - num%50))/50;
                num = num%50;
            }
            if(num >= 10){
                num_notes = num_notes + ((num - num%10))/10;
                num = num%10;
            }
            if(num >= 5){
                num_notes = num_notes + ((num - num%5))/5;
                num = num%5;
            }
            if(num >= 2){
                num_notes = num_notes + ((num - num%2))/2;
                num = num%2;
            }
            num_notes = num_notes + num;
            System.out.println(num_notes);
        }
    }
}



