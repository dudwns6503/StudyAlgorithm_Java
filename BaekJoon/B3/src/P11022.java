/*
BaekJoon 11022 A+B-8
*/

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int answer = 0;
        for(int test_case=1; test_case<=T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            answer = a + b;
            System.out.println("Case #" + test_case + ": " + a + " + " + b + " = " + answer);
        }
    }
}
