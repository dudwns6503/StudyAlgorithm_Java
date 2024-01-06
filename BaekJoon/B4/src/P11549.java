/*
 * BOJ 11549 Identifying tea
 *
 * memory : 14300kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11549 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(st.nextToken()) == t) {
                ans++;
            }
        }

        System.out.print(ans);
    }
}
