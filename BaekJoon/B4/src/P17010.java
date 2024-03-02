/*
 * BOJ 17010 Time to Decompress
 *
 * memory : 14132kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17010 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            String character = st.nextToken();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < l; j++) {
                sb.append(character);
            }

            System.out.println(sb);
        }
    }
}
