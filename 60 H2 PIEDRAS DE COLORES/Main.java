
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String c = sc.next(); 
        int contador = 0;

        for (int i = 1; i < n; i++) {
            if (c.charAt(i) == c.charAt(i - 1)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
   

