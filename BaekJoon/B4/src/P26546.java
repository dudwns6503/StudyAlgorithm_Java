/*
 * BOJ 26546 Reverse
 *
 * memory : 14064kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < n; k++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            for (int l = 0; l < str.length(); l++) {
                char ch = str.charAt(l);

                if (l >= i && l < j) continue;

                sb.append(ch);
            }

            sb.append("\n");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
