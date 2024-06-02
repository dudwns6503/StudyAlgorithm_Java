/*
 * BOJ 31821 학식 사주기
 *
 * memory : 14208kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31821 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] menus = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            menus[i] = Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 0; i < m; i++) {
            int pick = Integer.parseInt(br.readLine());
            ans += menus[pick];
        }

        System.out.print(ans);
    }
}
