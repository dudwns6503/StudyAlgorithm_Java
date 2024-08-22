/*
 * BOJ 2004 조합 0의 개수
 *
 * memory : 14336kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2004 {

    private static int n, m;
    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int count5 = count(n, 5) - count(n - m, 5) - count(m, 5);
        int count2 = count(n, 2) - count(n - m, 2) - count(m, 2);

        System.out.print(Math.min(count5, count2));
    }

    private static int count(int num, int m) {
        int count = 0;

        while (num >= m) {
            count += num / m;
            num /= m;
        }

        return count;
    }


    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
}
