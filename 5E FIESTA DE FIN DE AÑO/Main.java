
package juez_virtual;


import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int acc=0;
        int cont=0;
        for (int i = 1; i <= x; i++) {
            acc+=(5*i);
            //System.out.print(acc+" ");
            if((acc+y)>240){
                break;
            }
            else if((acc+y)==240){
                cont++;
                break;
            }
            cont++;
        }
        System.out.println(cont);
        
        
    }
}
   

