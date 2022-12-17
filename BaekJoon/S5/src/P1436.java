/*
 * BOJ 1436 영화감독 숌
 *
 * memory : 86428kb
 * time : 304ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1436 {

    static int[] arr;
    static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
    }

    private static void solve() {
        int num = 665;
        int i = 1;

        while (arr[n] == 0) {
            if (String.valueOf(num).contains("666")) {
                arr[i] = num;
                i++;
            }
            num++;
        }

        System.out.print(arr[n]);
    }
}
