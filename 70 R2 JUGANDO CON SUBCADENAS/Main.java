
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- >0){
            String ca = sc.next();
            String res = "";
            for (int i = 0; i < ca.length(); i++) {
                if(i%2==0){
                    res+=ca.charAt(i);
                }
            }
            res+=ca.charAt(ca.length()-1);
            System.out.println(res);
        }    
    }
}
   

