/*
 * BOJ 2292 벌집
 *
 * memory : 14200kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2292 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        int ans =1;
        int range = 2;

        if (n == 1) System.out.print(1);
        else {
            while (range <= n) {
                range += (6 * ans);
                ans++;
            }
            System.out.print(ans);
        }
    }
}
