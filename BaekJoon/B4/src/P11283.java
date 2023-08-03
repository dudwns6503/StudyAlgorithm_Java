/*
 * BOJ 11283 한글 2
 *
 * memory : 14268kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11283 {

    private static char ch;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ch = br.readLine().toCharArray()[0];

        solve();
    }

    private static void solve() {
        System.out.print((int) ch - 44031);
    }
}
