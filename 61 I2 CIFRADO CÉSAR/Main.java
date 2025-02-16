
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    private static int calcularDesplazamiento(String palabra) {
        int[] frecuencia = new int[26]; 
        
        for (char c : palabra.toCharArray()) {
            frecuencia[c - 'A']++;
        }

        int maxFrecuencia = 0;
        for (int f : frecuencia) {
            if (f > maxFrecuencia) {
                maxFrecuencia = f;
            }
        }
        return maxFrecuencia;
    }
    private static String cifrarPalabra(String palabra, int desplazamiento) {
        StringBuilder cifrado = new StringBuilder();
        char primeraLetra = (char) ('A' + desplazamiento - 1);
        cifrado.append(primeraLetra);
        for (char c : palabra.toCharArray()) {
            int nuevaPosicion = ((c - 'A' + desplazamiento) % 26) + 'A';
            cifrado.append((char) nuevaPosicion);
        }
        return cifrado.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // Número de casos de prueba
        sc.nextLine(); // Consumir el salto de línea
        
        while (K-- > 0) {
            String palabra = sc.nextLine(); // Leer la palabra
            int desplazamiento = calcularDesplazamiento(palabra);
            String palabraCifrada = cifrarPalabra(palabra, desplazamiento);
            System.out.println(palabraCifrada);
        }
    }
}
   

