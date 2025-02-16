package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {
     public static String convertirHora(String hora24) {
        String[] partes = hora24.split(":"); 
        int hora = Integer.parseInt(partes[0]); 
        String minutos = partes[1]; 
        String periodo;

        if (hora == 0) {
            hora = 12; 
            periodo = "AM";
        } else if (hora == 12) {
            periodo = "PM"; 
        } else if (hora > 12) {
            hora -= 12; 
            periodo = "PM";
        } else {
            periodo = "AM"; 
        }
        return String.format("%02d:%s %s", hora, minutos, periodo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String hora24 = sc.nextLine(); 
            System.out.println(convertirHora(hora24)); 
        }
        sc.close();
    }
}
