 /*
  * BOJ 4299 AFC 윔블던
  *
  * memory : 14272kb
  * time : 128ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4299 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        if (a < b || (a + b) % 2 != 0 || (a - b) % 2 != 0) {
            sb.append(-1);
        } else {
            int sum = (a + b) / 2;
            int minus = (a - b) / 2;

            sb.append(Math.max(sum, minus)).append(" ").append(Math.min(sum, minus));
        }

        System.out.print(sb);
    }
}
