package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int [] v = new int[4];
        v[0]=sc.nextInt();v[1]=sc.nextInt();v[2]=sc.nextInt();v[3]=sc.nextInt();
        Arrays.sort(v);
        int a = v[3]-v[2];
        int b = v[3]-v[1];
        int c = v[3]-v[0];
        System.out.println(a+" "+b+" "+c);
             
    }
}
