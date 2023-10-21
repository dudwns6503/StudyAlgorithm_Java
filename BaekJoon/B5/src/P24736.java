/*
 * BOJ 24736 Football Scoring
 *
 * memory : 14048kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24736 {

    private static final int[] scores = {6, 3, 2, 1, 2};

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int ans = 0;

            for (int j = 0; j < 5; j++) {
                ans += scores[j] * Integer.parseInt(st.nextToken());
            }

            sb.append(ans).append(" ");
        }

        System.out.print(sb);
    }
}
