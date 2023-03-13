/*
 * BOJ 1735 분수 합
 *
 * memory : 14092kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1735 {

    private static int a1, b1, a2, b2;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a1 = Integer.parseInt(st.nextToken());
        b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        a2 = Integer.parseInt(st.nextToken());
        b2 = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        int lcd = lcd(b1, b2);

        a1 *= lcd / b1;
        a2 *= lcd / b2;

        int sum = a1 + a2;

        int gcd = gcd(sum, lcd);
        sum /= gcd;
        lcd /= gcd;

        sb.append(sum).append(" ").append(lcd);
        System.out.print(sb);
    }

    private static int lcd(int b1, int b2) {
        return b1 * b2 / gcd(b1, b2);
    }

    private static int gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
