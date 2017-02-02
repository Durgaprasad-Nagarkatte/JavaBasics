/* package codechef; // don't place package name! */

/**
 * The Chef likes to stay in touch with his staff. So, the Chef, the head server, and the sous-chef all carry two-way transceivers so they can stay in constant contact. Of course, these transceivers have a limited range so if two are too far apart, they cannot communicate directly.
   The Chef invested in top-of-the-line transceivers which have a few advanced features. One is that even if two people cannot talk directly because they are out of range, if there is another transceiver that is close enough to both, then the two transceivers can still communicate with each other using the third transceiver as an intermediate device.
   There has been a minor emergency in the Chef's restaurant and he needs to communicate with both the head server and the sous-chef right away. Help the Chef determine if it is possible for all three people to communicate with each other, even if two must communicate through the third because they are too far apart.
 * @author (Durgaprasad) 
 * @version (03/02/2016)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ThreeWayCommunication{
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
        int radius = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        float d1 = (float)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        float d2 = (float)Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2));
        float d3 = (float)Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
        if(d1 <= radius && d2 <= radius && d3 <= radius){
            System.out.println("yes");
        }
        else if(d1 > radius && d2 <= radius && d3 <= radius){
            System.out.println("yes");
        }
        else if(d1 <= radius && d2 > radius && d3 <= radius){
            System.out.println("yes");
        }
        else if(d1 <= radius && d2 <= radius && d3 > radius){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        }
    }
}


