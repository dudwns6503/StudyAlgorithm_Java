/*
 * BOJ 6064 카잉 달력
 *
 * memory : 15632kb
 * time : 172ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6064 {

    private static StringBuilder sb = new StringBuilder();
    private static int m, n, x, y;

    public static void main(String[] args) throws Exception {
        input();
        print();
    }

    private static void solve() {
        int gcd = getGcd(m, n);
        int lcm = m * n / gcd;

        int answer = -1;
        for (int i = x; i <= lcm; i += m) {
            if (i % n == y) {
                answer = i + 1;
                break;
            }
        }

        sb.append(answer).append("\n");
    }

    private static int getGcd(int m, int n) {
        if (n == 0)
            return m;

        return getGcd(n, m % n);
    }

    private static void print() {
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }


    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            // m = x, n = y인 경우 고려해서 -1
            x = Integer.parseInt(st.nextToken()) - 1;
            y = Integer.parseInt(st.nextToken()) - 1;

            solve();
        }
    }
}
