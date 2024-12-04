/*
 * BOJ 32498 Call for Problems
 *
 * memory : 14028kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32498 {

    private static int ans;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(int num) {
        if (num % 2 != 0)
            ans++;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ans = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            solve(num);
        }

        System.out.print(ans);
    }
}
