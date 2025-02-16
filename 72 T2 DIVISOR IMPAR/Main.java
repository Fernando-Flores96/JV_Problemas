
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        
        while(z-- >0){
            long n = sc.nextInt();
            boolean sw = false;
            for (int i = 2; i <= n; i++) {
                if(n%i==0){
                    if(i%2==1){
                        System.out.println("SI");
                        sw=true;
                        break;
                    }
                }    
            }
            if(!sw)
                System.out.println("NO");
        }    
    }
}
   

