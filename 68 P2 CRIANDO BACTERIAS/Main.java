
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long b = sc.nextInt();
        long res = (long)Math.pow(2, x) * b;
        System.out.println(res);
           
    }
}
   

