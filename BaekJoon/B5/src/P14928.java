/*
 * BOJ 14928 큰 수(BIG)
 *
 * memory : 20052kb
 * time : 272ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14928 {

    private static String num;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = br.readLine();
    }

    private static void solve() {
        long remainder = 0;

        for (int i = 0; i < num.length(); i++) {
            remainder = (remainder * 10 + (Character.getNumericValue(num.charAt(i)))) % 20000303;
        }

        System.out.print(remainder);
    }
}
