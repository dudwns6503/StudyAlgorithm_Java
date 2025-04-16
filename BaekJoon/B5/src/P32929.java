/*
 * BOJ 32929 UOS 문자열
 *
 * memory : 14036kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32929 {

    private static final String UOS = "UOS";
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (n % UOS.length() == 0)
            System.out.print(UOS.charAt(2));
        else
            System.out.print(UOS.charAt((n % UOS.length()) - 1));
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
