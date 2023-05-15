/*
 * BOJ 1009 분산처리
 *
 * memory : 15932kb
 * time : 984ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1009 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans = 1;

            for (int j = 0; j < b; j++) {
                ans = (ans * a) % 10;
            }

            if (ans == 0) sb.append(10).append("\n");
            else sb.append(ans).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}

