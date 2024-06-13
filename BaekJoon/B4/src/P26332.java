/*
 * BOJ 26332 Buying in Bulk
 *
 * memory : 15504kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26332 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int ans = 0;

            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            ans += p + (p - 2) * (c - 1);

            sb.append(c).append(" ").append(p).append("\n");
            sb.append(ans).append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
