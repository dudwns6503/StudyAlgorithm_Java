/*
 * BOJ 8437 Julka
 *
 * memory : 14348kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P8437 {

    private static BigInteger total, diff;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        total = new BigInteger(br.readLine());
        diff = new BigInteger(br.readLine());

        solve();
    }

    private static void solve() {
        BigInteger higher = total.subtract(diff).divide(new BigInteger("2")).add(diff);
        BigInteger lower = total.subtract(diff).divide(new BigInteger("2"));

        System.out.println(higher);
        System.out.print(lower);
    }
}
