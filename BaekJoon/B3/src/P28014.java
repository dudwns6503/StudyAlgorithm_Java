/*
 * BOJ 28014 첨탑 밀어서 부수기
 *
 * memory : 349444kb
 * time : 864ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28014 {

    private static int[] towers;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        towers = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        int answer = 1;

        for (int i = 1; i < n; i++) {
            if (towers[i - 1] <= towers[i]) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
