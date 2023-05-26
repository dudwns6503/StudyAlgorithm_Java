/*
 * BOJ 28097 모범생 포닉스
 *
 * memory : 14192kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28097 {

    private static int[] t;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        t = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        int day = 0;
        int hour = 0;

        for (int i = 0; i < n; i++) {
            hour += t[i];

            if (i != n - 1) hour += 8;

            while (hour >= 24) {
                day++;
                hour -= 24;
            }
        }

        sb.append(day).append(" ").append(hour);
        System.out.print(sb);
    }
}
