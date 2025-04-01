/*
 * BOJ 2435 기상청 인턴 신현수
 *
 * memory : 14140kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2435 {

    private static int[] temperatures;
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i + k > n)
               break;

            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += temperatures[j];
            }

            ans = Math.max(sum, ans);
        }

        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        temperatures = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }
    }
}
