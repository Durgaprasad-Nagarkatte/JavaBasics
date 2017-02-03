
/**
 * You are given a sequence a1, a2, ..., aN. Find the smallest possible value of ai + aj, where 1 ≤ i < j ≤ N..
 * 
 * @author (Durgaprasad) 
 * @7.4 JDK(03/02/2016)
 */
import java.util.*;
public class SmallestSum {
    public static void main(String[] args)throws Exception{
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for(int i = 0; i < t; i++){
        int n = scan.nextInt();
        int []arr = new int[n];
        int j;
        for(j = 0; j < n; j++){
            arr[i] = scan.nextInt();
        }
        int min, min2;
        min = arr[0];
        min2 = arr[1];
        for(j = 1; j < n; j++){
            if(arr[j] < min){
                min2 = min;
                min = arr[j];
            }
            else{
                if(arr[j] < min2){
                    min2 = arr[j];
                }
            }
        }
        System.out.println(min + min2);
    }
    }
}
