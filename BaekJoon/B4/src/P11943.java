/*
 * BOJ 11943 파일 옮기기
 *
 * memory : 14216kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11943 {

    private static int leftApple, leftOrange, rightApple, rightOrange;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        leftApple = Integer.parseInt(st.nextToken());
        leftOrange = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        rightApple = Integer.parseInt(st.nextToken());
        rightOrange = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        System.out.print(Math.min(rightApple + leftOrange, leftApple + rightOrange));
    }
}
