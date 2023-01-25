/*
 * BOJ 2609 최대공약수와 최소공배수
 *
 * memory : 14220kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2609 {

    private static StringBuilder sb = new StringBuilder();
    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int gcd = get_gcd();
        int lcd = get_lcd(gcd);

        sb.append(gcd).append("\n");
        sb.append(lcd);
        System.out.print(sb);
    }

    private static int get_gcd() {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int n = 0;

        while (min != 0) {
            n = max % min;
            max = min;
            min = n;
        }

        return max;
    }

    private static int get_lcd(int gcd) {
        return a * b / gcd;
    }
}
