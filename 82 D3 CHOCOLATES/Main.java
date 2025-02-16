package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int[] empleados = new int[N];
        for (int i = 0; i < N; i++) {
            empleados[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            long chocolates = sc.nextLong(); 
            for (int j = 0; j < N; j++) {
                long maxPorEmpleado = chocolates / empleados[j]; 
                long totalRepartido = maxPorEmpleado * empleados[j];
                chocolates -= totalRepartido;
            }
            System.out.println(chocolates);
        }
    }
}
