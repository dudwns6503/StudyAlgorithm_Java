/*
 * BOJ 2355 시그마
 *
 * memory : 14208kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2355 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        long ans = (b - a + 1) * (a + b) / 2;

        System.out.print(ans);
    }
}
