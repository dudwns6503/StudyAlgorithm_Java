/*
 * BOJ 28417 스케이트보드
 *
 * memory : 65152kb
 * time : 440ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P28417 {

    private static int[] tricks;
    private static int n, sum, run1, run2;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            tricks = new int[5];

            run1 = Integer.parseInt(st.nextToken());
            run2 = Integer.parseInt(st.nextToken());

            tricks[0] = Integer.parseInt(st.nextToken());
            tricks[1] = Integer.parseInt(st.nextToken());
            tricks[2] = Integer.parseInt(st.nextToken());
            tricks[3] = Integer.parseInt(st.nextToken());
            tricks[4] = Integer.parseInt(st.nextToken());

            solve();
        }

        System.out.print(sum);
    }

    private static void solve() {
        int maxRun = Math.max(run1, run2);

        Arrays.sort(tricks);
        int maxTrick = tricks[4];
        int secondMaxTrick = tricks[3];

        sum = Math.max(sum, maxRun + maxTrick + secondMaxTrick);
    }
}
