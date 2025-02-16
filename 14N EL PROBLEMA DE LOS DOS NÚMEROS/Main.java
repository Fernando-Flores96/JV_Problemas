
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cont =0;
            int c = Math.min(a, b);
            int d = Math.max(a, b);
            a=c;b=d;
            if(a<b){
                for (int i = 10; i >= 1; i--) {
                    if(a+i<=b){   
                        a+=i;
                        //System.out.println(a);
                        i=11;
                        cont++;
                    }
                    if(a==b){
                        break;
                    }
                }
                System.out.println(cont);
            }
            else{
                System.out.println(0);
            }
        }        
    }
}
   

