/*
 * BOJ 29699 Welcome to SMUPC!
 *
 * memory : 14156kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29699 {

    private static final String WORD = "WelcomeToSMUPC";
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        n %= 14;

        if (n == 0) System.out.print(WORD.charAt(WORD.length() - 1));
        else System.out.print(WORD.charAt(n - 1));
    }
}
