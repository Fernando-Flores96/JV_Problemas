
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); 
        for (int i = 0; i < K; i++) {
            int N = sc.nextInt(); 
            int posicion = 0;
            int salto = 1; 
            int movimientos = 0;
            while (posicion < N) {
                movimientos++;
                posicion += salto;
                salto++;
            }

            if (posicion == N) {
                System.out.println("Llegas al cuadrado " + movimientos);
            } else {
                System.out.println("No llegas");
            }
        }    
    }
}
   

