/*
 * BOJ 1940 주몽
 *
 * memory : 17492kb
 * time : 204ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {

    private static int[] ingredients;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        ingredients = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ingredients[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        Arrays.sort(ingredients);

        int ans = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = ingredients[l] + ingredients[r];

            if (sum == m) {
                ans++;
                r--;
                l++;
            } else if (sum > m) {
                r--;
            } else {
                l++;
            }
        }

        System.out.print(ans);
    }
}
