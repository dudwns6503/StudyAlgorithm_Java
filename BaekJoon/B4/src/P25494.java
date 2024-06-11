/*
 * BOJ 25494 단순한 문제 (Small)
 *
 * memory : 15976kb
 * time : 276ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25494 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int ans = 0;
            for (int x = 1; x <= a; x++) {
                for (int y = 1;  y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        if (x % y == y % z && y % z == z % x)
                            ans++;
                    }
                }
            }

            sb.append(ans).append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
