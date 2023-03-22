/*
 * BOJ 4134 다음 소수
 *
 * memory : 103096kb
 * time : 928ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P4134 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            solve(n);
        }
    }

    private static void solve(long n) {
        BigInteger bi = new BigInteger(String.valueOf(n));

        if (bi.isProbablePrime(10)) {
            System.out.println(n);
        } else {
            System.out.println(bi.nextProbablePrime());
        }
    }
}
