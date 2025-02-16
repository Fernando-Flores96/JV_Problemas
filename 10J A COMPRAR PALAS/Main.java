
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int R = scanner.nextInt();
        
        int n = 1;
        while ((K * n) % 10 != 0 && (K * n) % 10 != R) {
            n++;
        }
        
        System.out.println(n);
        
        scanner.close();
    }
}
   

