/*
 * BOJ 30031 지폐 세기
 *
 * memory : 14228kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30031 {

    private static int sum;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        sum = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int width = Integer.parseInt(st.nextToken());
            solve(width);
        }

        System.out.print(sum);
    }

    private static void solve(int width) {
        if (width == 136) sum += 1000;
        else if (width == 142) sum += 5000;
        else if (width == 148) sum += 10000;
        else sum += 50000;
    }
}
