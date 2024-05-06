/*
 * BOJ 25881 Electric Bill
 *
 * memory : 14040kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25881 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            int usage = Integer.parseInt(br.readLine());

            if (usage > 1000) {
                sb.append(usage).append(" ").append((1000 * n) + (usage - 1000) * k).append("\n");
            }
            else {
                sb.append(usage).append(" ").append(n * usage).append("\n");
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
