/*
 * BOJ 26768 H4x0r
 *
 * memory : 25560kb
 * time : 360ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26768 {

    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(str.replace('a', '4').replace('e', '3').replace('i', '1')
                .replace('o', '0').replace('s', '5'));
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }
}
