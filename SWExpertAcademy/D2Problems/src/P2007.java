/*
SW Expert Academy 문제 2007 패턴 마디의 길이
*/


import java.util.Scanner;

public class P2007 {

    static int T;
    static int N = 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();
            for(int i=1; i<=str.length(); i++) {
                String a = str.substring(0, i);
                String b = str.substring(i, i + i);
                if (a.equals(b)) {
                    System.out.printf("#%d %d\n", test_case, a.length());
                    break;
                }
            }
        }
    }
}