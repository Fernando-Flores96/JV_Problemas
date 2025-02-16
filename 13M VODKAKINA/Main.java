
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();
        int C = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        int acc1 =K*L;
        acc1 = acc1/M;
        int acc2 = C*R;
        int acc3 = P/S;
        acc1/=3;
        acc2/=3;
        acc3/=3;
        int res=Math.min(acc1, Math.min(acc2, acc3));
        System.out.println(res);
        
    }
}
   

