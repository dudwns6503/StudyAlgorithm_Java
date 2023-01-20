/*
 * BOJ 1644 소수의 연속합
 *
 * memory : 38816kb
 * time : 264ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1644 {

    private static ArrayList<Integer> primes = new ArrayList<>();
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
        primeAdd();

        int ans = 0;
        int sum = 0;
        int r = 0;

        for (int l = 0; l < primes.size(); l++) {
            if (l - 1 >= 0) sum -= primes.get(l - 1);

            while (r + 1 <= primes.size() && sum < n) {
                sum += primes.get(r++);
            }

            if (sum == n) ans++;
        }

        System.out.print(ans);
    }

    private static void primeAdd() {
        // 소수가 아니라면 0
        int[] prime = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }

        prime[1] = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) continue;

            for (int j = 2 * i; j <= n; j += i) {
                prime[j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (prime[i] != 0) {
                primes.add(i);
            }
        }
    }
}
