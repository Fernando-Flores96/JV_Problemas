package juez_virtual;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        int z = sc.nextInt();
        
        while (z-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                if (i % 2 == 0) {
                    l.add("D");
                } else {
                    l.add("K");
                }
            }
            String ca = l.get(l.size() - 1);
            if (ca.equals("D")) {
                while (true) {
                    if (a == 0 && b == 0) {
                        break;
                    }
                    if (b > 0) {
                        l.add("K");
                        b--;
                    }
                    if (a > 0) {
                        l.add("D");
                        a--;
                    }
                }
            } else {
                while (true) {
                    if (a == 0 && b == 0) {
                        break;
                    }
                    if (a > 0) {
                        l.add("D");
                        a--;
                    }
                    if (b > 0) {
                        l.add("K");
                        b--;
                    }
                }
            }
            System.out.println((l.get(l.size() - 1)) == ("D") ? "PRIMERA" : "SEGUNDA");
            l.clear();
        }
    }
}
