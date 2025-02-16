
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();   
        while (z-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            long s = (long)Math.pow(x,n+1);
            double r = (double)Math.sqrt(s);
            long res = (long)Math.round(r);
            System.out.println(res);
        }
    }
}
   

