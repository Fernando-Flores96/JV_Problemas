package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();   
        while (z-- > 0) {
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            System.out.println((a+b>=10) ? "SI" : (b+c>=10) ? "SI" : (a+c>=10) ? "SI" : "NO");
        }
    }
}
