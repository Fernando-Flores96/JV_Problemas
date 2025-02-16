
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    private static String descifrarPalabra(String cifrada) {
        int desplazamiento = cifrada.charAt(0) - 'A' + 1; 
        StringBuilder descifrada = new StringBuilder();
        for (int i = 1; i < cifrada.length(); i++) {
            char c = cifrada.charAt(i);
            int nuevaPosicion = ((c - 'A' - desplazamiento + 26) % 26) + 'A';
            descifrada.append((char) nuevaPosicion);
        }
        return descifrada.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); 
        sc.nextLine(); 
        
        while (K-- > 0) {
            String palabraCifrada = sc.nextLine(); 
            String palabraDescifrada = descifrarPalabra(palabraCifrada);
            System.out.println(palabraDescifrada);
        }
    }
}
   

