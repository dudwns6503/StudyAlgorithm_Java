/*
 * BOJ 24309 РАВЕНСТВО
 *
 * memory : 14332kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P24309 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());

        BigInteger ans = b.subtract(c);
        System.out.print(ans.divide(a));
    }
}
