package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();   
        while (z-- > 0) {
            int t =sc.nextInt();
            int [] v = new int[t];
            for (int i = 0; i < t; i++) {
                v[i] = sc.nextInt();
            }
            Arrays.sort(v);
            int res = v[t-1]-v[0];
            System.out.println(res);
        }
    }
}
