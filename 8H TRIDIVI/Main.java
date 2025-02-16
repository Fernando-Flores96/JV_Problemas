
package juez_virtual;


import java.util.Scanner;
import java.util.*;

public class Main {
    
    public static int CantidadDiv(int n){
        int acc = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                acc++;
            }
        }
        return acc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int z = sc.nextInt();
        while (z-- >0) {            
            int n=sc.nextInt();
            int t=CantidadDiv(n);
            String res = (t==3) ? "SI" : "NO"; 
            System.out.println(res);
        }
    }
}
   

