package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt(); 
        while (z-- > 0) {
            int t = scanner.nextInt(); 

            if (t % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
                int[] v = new int[t];  
                int mitad = t / 2;  
                int indice = 0;
                for (int i = 1; i <= mitad; i++) {
                    v[indice++] = 2 * i;  
                }
                for (int i = 1; i < mitad; i++) {
                    v[indice++] = 2 * i - 1; 
                }
                v[t - 1] = 3 * mitad - 1;
                for (int i = 0; i < t; i++) {
                    if(i==t-1)
                        System.out.print(v[i]);
                    else
                        System.out.print(v[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
