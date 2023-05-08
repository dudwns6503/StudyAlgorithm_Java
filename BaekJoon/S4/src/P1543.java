/*
 * BOJ 1543 문서 검색
 *
 * memory : 14292kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1543 {

    private static String str, keyword;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        keyword = br.readLine();
    }

    private static void solve() {
        int ans = 0;

        str = str.replaceAll(keyword, "1");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                ans++;
            }
        }

        System.out.print(ans);
    }
}
