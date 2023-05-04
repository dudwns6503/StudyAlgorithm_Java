/*
 * BOJ 2485 가로수
 *
 * memory : 23304kb
 * time : 268ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2485 {

    private static int[] diff;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] trees = new int[n];
        diff = new int[n - 1];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());

            if (i > 0) diff[i - 1] = trees[i] - trees[i - 1];
        }
    }

    private static void solve() {
        // 유클리드 호제법으로 최대 공약수를 구할 때 a > b를 만족시키기 위해서 오름차순으로 정렬.
        Arrays.sort(diff);

        // 가로수 사이의 거리의 최대 공약수를 구한다.
        int gcd = find_gcd(diff[0], diff[1]);

        for (int i = 2; i < n - 2; i++) {
            gcd = find_gcd(gcd, diff[i]);
        }

        // (가로수 사이의 거리 / 최대 공약수) - 1의 총합을 출력한다.
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += (diff[i] / gcd) - 1;
        }

        System.out.print(ans);
    }

    private static int find_gcd(int a, int b) {
        if (b == 0) return a;

        return find_gcd(b, a % b);
    }
}
