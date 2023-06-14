/*
 * BOJ 17103 골드바흐 파티션
 *
 * memory : 15408kb
 * time : 320ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17103 {

    private static boolean[] prime;
    private static int n, ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        find_prime();

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            ans = 0;
            solve();
            sb.append(ans).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void find_prime() {
        // 소수라면 false
        prime = new boolean[1000001];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i*i <= 1000000; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= 1000000; j+=i) {
                    prime[j] = true;
                }
            }
        }
    }

    private static void solve() {
        int l = 2;
        int r = n;

        while (l <= r) {
            if (prime[l]) {
                l++;
                continue;
            }
            if (prime[r]) {
                r--;
                continue;
            }

            if (l + r == n) {
                ans++;
                l++;
                r--;
            }
            else if (l + r > n) r--;
            else l++;
        }
    }
}
