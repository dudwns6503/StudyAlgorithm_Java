/*
 * BOJ 27257 Любитель нулей
 *
 * memory : 14032kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27257 {

    private static String k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int ans = 0;
        for (int i = 0; i < k.length(); i++)
            if (k.charAt(i) == '0') ans++;

        for (int i = k.length() - 1; i != 0; i--) {
            if (k.charAt(i) == '0') ans--;
            else break ;
        }

        System.out.print(ans);;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = br.readLine();
    }
}
