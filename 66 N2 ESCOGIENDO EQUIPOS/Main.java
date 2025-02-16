
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int K = sc.nextInt(); 
        int count = 0; 

        for (int i = 0; i < N; i++) {
            int participaciones = sc.nextInt();
            if (participaciones + K <= 5) { 
                count++; 
            }
        }
        System.out.println(count / 3); 
    }
}
   

