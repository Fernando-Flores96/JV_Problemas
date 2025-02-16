
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    public static int encontrarModa(int[] nums) {
        int maxCount = 0;
        int moda = -1;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = nums[i];
            }
        }
        return moda;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            int t = sc.nextInt();
            int[] v = new int[t];
            for (int i = 0; i < t; i++) {
                v[i] = sc.nextInt();
            }
            int moda = encontrarModa(v);
            int pos = 0;
            for (int i = 0; i < v.length; i++) {
                if (v[i] != moda) {
                    pos = i;
                    break;
                }
            }
            System.out.println(pos+1);
        }
    }
}
   

