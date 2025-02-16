
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();  
        
        int[] v = {x1, x2, x3};
        Arrays.sort(v);
        
        // El punto ideal de reunión es el del medio (posiciones[1])
        int distanciaTotal = ( v[2] - v[1]) + (v[1] - v[0]);
        
        System.out.println(distanciaTotal);
         
    }
}
   

