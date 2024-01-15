/*
 * BOJ 11257 IT Passport Examination
 *
 * memory : 14320kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11257 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        double[] percent = { (35 / (double)100 * 30), (25 / (double)100 * 30), (40 / (double) 100 * 30)};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            sb.append(st.nextToken()).append(" ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a + b + c >= 55) {
                if (a >= percent[0] && b >= percent[1] && c >= percent[2]) {
                    sb.append(a + b + c).append(" ").append("PASS").append("\n");
                    continue;
                }
            }

            sb.append(a + b + c).append(" ").append("FAIL").append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
