/*
 * BOJ 4562 No Brainer
 *
 * memory : 14056kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4562 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x < y)
                sb.append("NO BRAINS").append("\n");
            else
                sb.append("MMM BRAINS").append("\n");
        }

        if (sb.length() >= 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
