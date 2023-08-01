/*
 * BOJ 10156 과자
 *
 * memory : 14208kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10156 {

    private static int k, n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        int needMoney = k * n - m;

        if (needMoney <= 0) {
            System.out.print("0");
        } else {
            System.out.print(needMoney);
        }
    }
}
