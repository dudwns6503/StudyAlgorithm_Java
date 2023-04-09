/*
 * BOJ 11005 진법 변환 2
 *
 * memory : 14292kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11005 {

    private static ArrayList<Integer> remainders;
    private static int n, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        remainders = new ArrayList<>();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            remainders.add(n % b);
            n /= b;
        }

        for (int remainder : remainders) {
            if (remainder >= 0 && remainder < 10) {
                sb.append(remainder);
            } else {
                sb.append((char) (remainder + 55));
            }
        }

        sb.reverse();
        System.out.print(sb);
    }
}
