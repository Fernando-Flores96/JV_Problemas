
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); 
        int n = sc.nextInt(); 
        int w = sc.nextInt();
        int sp = (w*(w+1))/2;
        sp = k*sp;
        int res = Math.abs(sp-n);
        System.out.println(res);
    }
}
   

