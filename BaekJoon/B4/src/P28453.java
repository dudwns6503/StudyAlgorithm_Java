/*
 * BOJ 28453 Previous Level
 *
 * memory : 14212kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28453 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            solve(m);
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(int m) {
        if (m < 250)
            sb.append(4).append(" ");
        else if (m < 275)
            sb.append(3).append(" ");
        else if (m < 300)
            sb.append(2).append(" ");
        else
            sb.append(1).append(" ");
    }
}
