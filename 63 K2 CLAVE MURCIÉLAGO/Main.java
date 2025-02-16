
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt(); 
        while (z-- > 0) {
            String ca = sc.next();
            String nc="";
            for (int i = 0; i < ca.length(); i++) {
                switch (ca.charAt(i)) {
                    case 'M':
                        nc+="0";   
                        break;
                    case 'U':
                        nc+="1";   
                        break;
                    case 'R':
                        nc+="2";   
                        break;
                    case 'C':
                        nc+="3";   
                        break;
                    case 'I':
                        nc+="4";   
                        break;
                    case 'E':
                        nc+="5";   
                        break;
                    case 'L':
                        nc+="6";   
                        break;
                    case 'A':
                        nc+="7";   
                        break;
                    case 'G':
                        nc+="8";   
                        break;
                    case 'O':
                        nc+="9";   
                        break;    
                    default:
                        nc+=ca.charAt(i);
                }
            }
            System.out.println(nc);
        }
    }
}
   

