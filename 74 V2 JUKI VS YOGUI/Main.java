package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int j=0;
        int y=0;
        while (z-- > 0) {
            int n1 = sc.nextInt(),n2 = sc.nextInt();
            if(n1>n2){
                j++;
            }
            else if(n2>n1){
                y++;
            }    
            else{
                j++;y++;
            }
        }
        System.out.println((j==y) ? "Empate" : ((j>y) ? "Juki" : "Yogui"));
    }
}
