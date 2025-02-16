
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int z = sc.nextInt(); 
        
        while (z-- > 0) {
            int N = sc.nextInt();
            int[] pins = new int[N];
            
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            int minIndex = -1, maxIndex = -1;
            
            for (int i = 0; i < N; i++) {
                pins[i] = sc.nextInt();
                if (pins[i] < minVal) {
                    minVal = pins[i];
                    minIndex = i;
                }
                if (pins[i] > maxVal) {
                    maxVal = pins[i];
                    maxIndex = i;
                }
            }
            int leftMax = Math.max(minIndex, maxIndex) + 1;         
            int rightMax = N - Math.min(minIndex, maxIndex);        
            int mix1 = minIndex + 1 + (N - maxIndex);              
            int mix2 = maxIndex + 1 + (N - minIndex);               
            
            int result = Math.min(Math.min(leftMax, rightMax), Math.min(mix1, mix2));
            
            System.out.println(result);
        }
    }
}
   

