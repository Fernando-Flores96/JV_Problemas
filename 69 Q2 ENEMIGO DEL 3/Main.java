
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] secuencia = new int[1001]; 
        int num = 1, posicion = 1;
        while (posicion <= 1000) {
            if (num % 3 != 0 && num % 10 != 3) { 
                secuencia[posicion] = num;
                posicion++;
            }
            num++;
        }
        while (K-- > 0) {
            int N = sc.nextInt();
            System.out.println(secuencia[N]);
        }
    }
}
   

