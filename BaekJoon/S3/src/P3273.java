/*
 * BOJ 3273 두 수의 합
 *
 * memory : 29116kb
 * time : 408ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3273 {

    private static int[] arr;
    private static int n, x;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        Arrays.sort(arr);

        int ans = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == x) {
                ans++;
                l++;
            }
            else if (sum < x) l++;
            else r--;
        }

        System.out.print(ans);
    }
}
