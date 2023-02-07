/*
 * BOJ 27433 팩토리얼 2
 *
 * memory : 14200kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27433 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] factorials = new long[n + 1];

        factorials[0] = 1;

        if (n >= 1) {
            factorials[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            factorials[i] = factorials[i-1] * i;
        }

        System.out.print(factorials[n]);
    }
}
