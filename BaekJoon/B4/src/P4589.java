/*
 * BOJ 4589 Gnome Sequencing
 *
 * memory : 14104kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4589 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:").append("\n");
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a > b && b > c) || (a < b && b < c))
                sb.append("Ordered");
            else
                sb.append("Unordered");

            if (i != n - 1)
                sb.append("\n");
        }

        System.out.print(sb);
    }
}
