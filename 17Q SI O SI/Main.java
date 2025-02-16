
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- >0){
            String c = sc.next();
            c = c.toLowerCase();
            String res = (c.equals("si")) ? "SI" : "NO";
            System.out.println(res);
        }    
    }
}
   

