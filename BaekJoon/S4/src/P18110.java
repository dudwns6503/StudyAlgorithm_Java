/*
 * BOJ 18110 solved.ac
 *
 * memory : 37628kb
 * time : 340ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P18110 {

    private static int[] arr;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void solve() {
        Arrays.sort(arr);

        int exclude = (int) Math.round(n * 0.15);

        double sum = 0.0;
        for (int i = exclude; i < n - exclude; i++) {
            sum += arr[i];
        }

        System.out.print(Math.round(sum / (n - 2 * exclude)));
    }
}
