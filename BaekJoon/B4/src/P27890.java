/*
 * BOJ 27890 특별한 작은 분수
 *
 * memory : 14184kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27890 {

    private static int[] x;

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x0 = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        x = new int[n + 1];
        x[0] = x0;

        solve();
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            // 홀 수 이면
            if (isOdd(x[i])) {
                x[i + 1] = (2 * x[i]) ^ 6;
            }
            // 짝수이면
            else {
                x[i + 1] = (x[i] / 2) ^ 6;
            }
        }

        System.out.print(x[n]);
    }

    private static boolean isOdd(int x) {
        return x % 2 == 1;
    }
}
