/*
 * BOJ 5341 Pyramids
 *
 * memory : 14012kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5341 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) break;

            solve(num);
        }
    }

    private static void solve(int number) {
        int ans = 0;
        for (int i = 1; i <= number; i++) {
            ans += i;
        }

        System.out.println(ans);
    }
}
