/*
 * BOJ 27222 Штангист
 *
 * memory : 14872kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27222 {

    private static int[] days;

    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        days = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (days[i] == 0)
                continue;

            if (y > x)
                ans += y - x;
        }

        System.out.print(ans);
    }
}
