
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int d=0;
        int m=0;
        
        for (int i = 0; i < c.length(); i++) {
            if(c.charAt(i)=='D'){
                d++;
            }
            else{
                m++;
            }
        }
        String res = (d==m) ? "Empate": (d>m) ? "Dereck" : "Marco";
        System.out.println(res);   
    }
}
   

