/*
 * BOJ 26575 Pups
 *
 * memory : 14360kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26575 {

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

            double d = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());

            sb.append(String.format("$%.2f", d * f* p)).append("\n");
        }

        if (sb.length() != 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
