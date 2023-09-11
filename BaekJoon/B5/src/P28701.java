/*
 * BOJ 28701 세제곱의 합
 *
 * memory : 14052kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28701 {

    private static long b;
    private static int a;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        a = 0;
        b = 0;

        for (int i = 1; i <= n; i++) {
            a += i;
        }

        for (int i = 1; i <= n; i++) {
            b += i * i * i;
        }

        print();
    }

    private static void print() {
        System.out.println(a);
        System.out.println(a * a);
        System.out.print(b);
    }
}
