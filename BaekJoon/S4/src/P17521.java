/*
 * BOJ 17521 Byte Coin
 *
 * memory : 14256kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17521 {

    private static int[] coins;
    private static int n, w;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        // 매도할 수 있는가
        boolean canSell = false;
        long sum = w;
        long coin = 0;

        for (int i = 1; i <= n; i++) {
            if (!canSell) {
                if (i + 1 > n)
                    continue;
                else if (coins[i] < coins[i + 1]) {
                    canSell = true;
                    coin += sum / coins[i];
                    sum %= coins[i];
                }
            } else if (canSell) {
                if (i + 1 > n || coins[i] > coins[i + 1]) {
                    sum += coins[i] * coin;
                    coin = 0;
                    canSell = false;
                }
            }
        }

        System.out.print(sum);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        coins = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
    }
}
