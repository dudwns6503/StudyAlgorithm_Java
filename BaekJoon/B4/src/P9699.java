/*
 * BOJ 9699 RICE SACK
 *
 * memory : 14052kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9699 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int max = 0;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                int curr = Integer.parseInt(st.nextToken());

                if (curr > max) {
                    max = curr;
                }
            }

            sb.append("Case #").append(i).append(": ").append(max).append("\n");
        }

        System.out.print(sb);
    }
}
