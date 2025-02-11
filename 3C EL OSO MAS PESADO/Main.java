
package juez_virtual;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();     
        int acc = 0;
        while (true) {            
            if(a>b){
                break;
            }
            a*=3;
            b*=2;
            acc++;
        }
        System.out.println(acc);     
    } 
}
