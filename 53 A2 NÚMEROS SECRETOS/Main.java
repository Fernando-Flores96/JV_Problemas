
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt(); 
        while (z-- > 0) {
            int[] v = new int[7];
            for (int i = 0; i < 7; i++) {
                v[i] = sc.nextInt();
            }    
            Arrays.sort(v); 
            int a = v[0]; 
            int b = v[1]; 
            int c = v[6] - (a + b);   
            System.out.println(a + " " + b + " " + c);
        }
    }
}
   

