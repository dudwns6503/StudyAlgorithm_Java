/*
 * BOJ 32369 양파 실험
 *
 * memory : 16072kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32369 {

    private static int n, a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int goodOnion = 1;
        int badOnion = 1;

        for (int i = 0; i < n; i++) {
            goodOnion += a;
            badOnion += b;

            if (goodOnion < badOnion) {
                int temp = goodOnion;
                goodOnion = badOnion;
                badOnion = temp;
            } else if (goodOnion == badOnion)
                badOnion--;
        }

        System.out.print(goodOnion + " " + badOnion);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }
}
