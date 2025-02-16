package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int res = a + b + c - max - min;
            System.out.println(res);  
        }       
    }
}
