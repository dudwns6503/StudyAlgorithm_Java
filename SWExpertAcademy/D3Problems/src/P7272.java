/*
SW Expert Academy 문제 7272 안경이 없어!
*/

import java.util.Arrays;
import java.util.Scanner;

public class P7272 {

    static int T;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            String alpha1 = sc.next();
            String alpha2 = sc.next();

            String answer;
            int[] array1 = new int[alpha1.length()];
            int[] array2 = new int[alpha2.length()];

            for(int i=0; i<alpha1.length(); i++) {
                char c = alpha1.charAt(i);
                if(c == 'B') {
                    array1[i] = 2;
                } else if(c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'R' || c == 'Q') {
                    array1[i] = 1;
                } else {
                    array1[i] = 0;
                }
            }

            for(int i=0; i<alpha2.length(); i++) {
                char c = alpha2.charAt(i);
                if(c == 'B') {
                    array2[i] = 2;
                } else if(c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'R' || c == 'Q') {
                    array2[i] = 1;
                } else {
                    array2[i] = 0;
                }
            }

            if (Arrays.equals(array1, array2)) {
                answer = "SAME";
            } else {
                answer = "DIFF";
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}