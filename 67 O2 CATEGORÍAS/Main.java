
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- >0){
            int calificacion = sc.nextInt();
            if(calificacion >= 1900){
                System.out.println("SENIOR (CAT.1)");
            }
            else if(calificacion <= 1899 && calificacion>=1600){
                System.out.println("SemiSENIOR (CAT.2)");
            }
            else if(calificacion<=1599 && calificacion>=1400){
                System.out.println("JUNIOR (CAT.3)");
            }
            else{
                System.out.println("INICIANTE (CAT.4)");
            }
        }     
    }
}
   

