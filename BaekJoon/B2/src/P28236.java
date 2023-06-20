/*
 * BOJ 28236 점심시간 레이스
 *
 * memory : 37856kb
 * time : 364ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28236 {

    private static int n, m, k, ans;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int distance = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());

            int f = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int num = solve(f, d);

            if (distance > num) {
                distance = num;
                ans = i;
            }
        }

        System.out.print(ans);
    }

    private static int solve(int floor, int classNumber) {
        int endX = 1;
        int endY = m + 1;

        return Math.abs(floor - endX) + Math.abs(classNumber - endY);
    }
}
