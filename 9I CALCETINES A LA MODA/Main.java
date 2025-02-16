
package juez_virtual;


import java.util.Scanner;
public class Main {
    
    public static int CantidadDiv(int n){
        int acc = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                acc++;
            }
        }
        return acc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println(a+" "+0);
        }
        else if(a<b){
            int c = b-a;
            System.out.println(a+" "+c/2);
        }
        else{
            int c = a-b;
            System.out.println(b+" "+c/2);
        } 
    }
}
   

