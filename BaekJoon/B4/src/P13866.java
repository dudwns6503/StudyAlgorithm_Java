/*
 * BOJ 13866 팀 나누기
 *
 * memory : 14308kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P13866 {

    private static int[] num;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = new int[4];
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());
        num[3] = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int sum = IntStream.range(0, 4).map(m -> num[m]).sum();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                sum -= (num[i] + num[j]);
                min = Math.min(min, Math.abs(sum - (num[i] + num[j])));
                sum += (num[i] + num[j]);
            }
        }

        System.out.print(min);
    }
}
