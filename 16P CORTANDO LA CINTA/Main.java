
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Longitud de la cinta
        int A = sc.nextInt(); // Longitud posible 1
        int B = sc.nextInt(); // Longitud posible 2
        int C = sc.nextInt(); // Longitud posible 3
        
        sc.close(); // Buena práctica: cerrar el Scanner

        // Array para almacenar la cantidad máxima de cortes posibles
        int[] dp = new int[N + 1];
        Arrays.fill(dp, -1); // Inicializamos con -1 (valor imposible)
        dp[0] = 0; // Base: una cinta de 0 no necesita cortes

        // Iteramos sobre todas las longitudes desde 1 hasta N
        for (int i = 1; i <= N; i++) {
            if (i >= A && dp[i - A] != -1) {
                dp[i] = Math.max(dp[i], dp[i - A] + 1);
            }
            if (i >= B && dp[i - B] != -1) {
                dp[i] = Math.max(dp[i], dp[i - B] + 1);
            }
            if (i >= C && dp[i - C] != -1) {
                dp[i] = Math.max(dp[i], dp[i - C] + 1);
            }
        }

        System.out.println(dp[N]); // Resultado: número máximo de cortes posibles
    }
}
   

