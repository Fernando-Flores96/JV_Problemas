package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int f =sc.nextInt();
        int c=sc.nextInt();
        int p = 0;
        int n = 0; 
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if(matriz[i][j]>0){
                    p++;    
                }
                else{
                    n++;
                }
            }
        }
        if(n>p){
            System.out.println("HUYE RAPIDO");
        }
        else if(n>=2){
            System.out.println("ESTAS SEGURO");
        }
        else{
            System.out.println("HUYE RAPIDO");
        }

    }
}
