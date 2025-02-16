
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    public static String rotarDerecha(String palabra) {
        return palabra.charAt(palabra.length() - 1) + palabra.substring(0, palabra.length() - 1);
    }
    public static boolean puedeRotarA(String base, String palabra) {
        String rotada = palabra;
        for (int i = 0; i < base.length(); i++) {
            if (rotada.equals(base)) {
                return true;
            }
            rotada = rotarDerecha(rotada); 
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); 
        sc.nextLine(); 

        for (int i = 0; i < K; i++) {
            String[] palabras = sc.nextLine().split(" ");
            String palabraBase = palabras[0]; 
            int contador = 0;

            for (int j = 1; j <= 3; j++) {
                if (puedeRotarA(palabraBase, palabras[j])) {
                    contador++;
                }
            }
            System.out.println(contador);
        }      
    }
}
   

