package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(),y = sc.nextInt(),z = sc.nextInt();
            if (y > z) {
                System.out.println("-1");
                continue;
            }
            int maxK = (z - y) / x * x + y;
            if (maxK > z) {
                maxK -= x;
            }
            System.out.println(maxK);
        }       
    }
}
