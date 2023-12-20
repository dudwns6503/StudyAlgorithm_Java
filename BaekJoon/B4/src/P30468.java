/*
 * BOJ 30468 호반우가 학교에 지각한 이유 1
 *
 * memory : 14204kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30468 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(st.nextToken());

        int ans = 0;
        while ((a + b + c + d + ans) / 4.0 < n) {
            ans++;
        }

        System.out.print(ans);
    }
}
