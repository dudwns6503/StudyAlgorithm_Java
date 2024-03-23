/*
 * BOJ 26561 Population
 *
 * memory : 13992kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26561 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            p -= t / 7;
            p += t / 4;
            sb.append(p).append("\n");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
