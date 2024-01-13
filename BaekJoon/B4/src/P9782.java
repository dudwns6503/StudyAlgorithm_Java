/*
 * BOJ 9782 Median
 *
 * memory : 14688kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9782 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (true) {
            index++;
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            if (n == 0)
                break;

            if (n % 2 != 0) {
                for (int i = 0; i < n / 2; i++) {
                    st.nextToken();
                }

                sb.append("Case ").append(index).append(": ").append(String.format("%.1f", Double.parseDouble(st.nextToken())));
                sb.append("\n");
            }
            else {
                for (int i = 0; i < (n / 2) - 1; i++) {
                    st.nextToken();
                }

                sb.append("Case ").append(index).append(": ")
                        .append(String.format("%.1f", (Double.parseDouble(st.nextToken()) + Double.parseDouble(st.nextToken())) / 2));
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}
