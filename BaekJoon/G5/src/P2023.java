/*
 * BOJ 2023 신기한 소수
 *
 * memory : 14360kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2023 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] selected;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        dfs(1);

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void dfs(int k) {
        if (k == n + 1) {
            for (int i = 1; i <= n; i++) {
                sb.append(selected[i]);
            }
            sb.append("\n");
        }
        else {
            for (int i = 1; i <= 9; i++) {
                selected[k] = i;
                if (!isPrime(k))
                    continue;

                dfs(k + 1);
                selected[k] = 0;
            }
        }
    }

    private static boolean isPrime(int k) {
        if (k == 1) {
            return selected[k] == 2 || selected[k] == 3 || selected[k] == 5 || selected[k] == 7;
        }
        else {
            StringBuilder numSb = new StringBuilder();
            for (int i = 1; i <= k; i++) {
                numSb.append(selected[i]);
            }

            int num = Integer.parseInt(numSb.toString());

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }

            return true;
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        selected = new int[n + 1];
    }
}
