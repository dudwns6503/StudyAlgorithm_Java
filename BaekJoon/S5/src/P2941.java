/*
 * BOJ 2941 크로아티아 알파벳
 *
 * memory : 14328kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2941 {

    static String[] alphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    private static String word;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        for (int i = 0; i < 8; i++) {
            word = word.replace(alphabet[i], "$");
        }

        System.out.print(word.length());
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        word = br.readLine();
    }
}
