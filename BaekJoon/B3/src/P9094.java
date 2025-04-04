/*
 * BOJ 9094 수학적 호기심
 *
 * memory : 19772kb
 * time : 396ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9094 {

    private static int n, m, ans;

    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void solve() {
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((i*i + j*j + m) % (i * j) == 0)
                    ans++;
            }
        }

        System.out.println(ans);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            ans = 0;
            solve();
        }
    }
}
