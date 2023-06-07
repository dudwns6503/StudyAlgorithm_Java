/*
 * BOJ 25591 푸앙이와 종윤이
 *
 * memory : 14196kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25591 {

    private static int num1, num2;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int a = 100 - num1;
        int b = 100 - num2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        StringBuilder sb = new StringBuilder();

        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ")
                .append(d).append(" ").append(q).append(" ").append(r).append("\n");

        c += q;

        sb.append(c).append(" ").append(r);

        System.out.print(sb);
    }
}
