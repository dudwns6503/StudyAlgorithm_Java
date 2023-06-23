/*
 * BOJ 14916 거스름돈
 *
 * memory : 14592kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14916 {

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
        int[] money = new int[100001];

        for (int i = 1; i <= 100000; i++) {
            money[i] = -1;
        }

        money[2] = 1;
        money[4] = 2;
        money[5] = 1;

        for (int i = 6; i <= 100000; i++) {
            if (money[i - 5] != -1) {
                money[i] = money[i - 5] + 1;
            } else if (money[i - 2] != -1) {
                money[i] = money[i - 2] + 1;
            }
        }

        System.out.print(money[n]);
    }
}
