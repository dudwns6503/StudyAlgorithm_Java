/*
 * BOJ 3733 Shares
 *
 * memory : 13988kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3733 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str == null) break;

            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            sb.append(solve(n, s)).append("\n");
        }

        System.out.print(sb);
    }

    private static int solve(int n, int s) {
        return s / (n + 1);
    }
}
