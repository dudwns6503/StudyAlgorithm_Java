/*
 * BOJ 33810 SciComLove (2025)
 *
 * memory : 14228kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33810 {

    private static final String LETTER = "SciComLove";
    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (LETTER.charAt(i) != str.charAt(i))
                cnt++;
        }

        System.out.print(cnt);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }
}
