/*
SW Expert Academy 문제 1926 간단한 369 게임
*/

import java.util.Scanner;

public class P1926 {
    static int N;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            String a = Integer.toString(i);
            if(a.contains("3") || a.contains("6") || a.contains("9")) {
                for(int j=0; j<a.length(); j++) {
                    if (a.charAt(j) == '3' || a.charAt(j) == '6' || a.charAt(j) == '9') {
                        System.out.print("-");
                    }
                    if (j == a.length() - 1) {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.print(a + " ");
            }
        }
    }
}

