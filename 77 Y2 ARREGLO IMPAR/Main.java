package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();   
        while (K-- > 0) {
            int N = sc.nextInt(); 
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt(); 
            }
            int oddInEvenPositions = 0;  
            int evenInOddPositions = 0;  
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {  
                    if (A[i] % 2 != 0) {  
                        oddInEvenPositions++;
                    }
                } else {  
                    if (A[i] % 2 == 0) {  
                        evenInOddPositions++;
                    }
                }
            }
            if (oddInEvenPositions != evenInOddPositions) {
                System.out.println("-1");
            } else {
                System.out.println(oddInEvenPositions);
            }
        }
    }
}
