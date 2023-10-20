/*
 * BOJ 29863 Arno's Sleep Schedule
 *
 * memory : 14172kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29863 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        int ans = 0;

        if (a >= 20) {
            ans += 24;
        }

        ans += b - a;

        System.out.print(ans);
    }
}
