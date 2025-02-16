
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
                    case '0':
                        nc+="M";   
                        break;
                    case '1':
                        nc+="U";   
                        break;
                    case '2':
                        nc+="R";   
                        break;
                    case '3':
                        nc+="C";   
                        break;
                    case '4':
                        nc+="I";   
                        break;
                    case '5':
                        nc+="E";   
                        break;
                    case '6':
                        nc+="L";   
                        break;
                    case '7':
                        nc+="A";   
                        break;
                    case '8':
                        nc+="G";   
                        break;
                    case '9':
                        nc+="O";   
                        break;    
                    default:
                        nc+=ca.charAt(i);
                }
            }
            System.out.println(nc);
        }
    }
}
   

