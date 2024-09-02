/*
 * BOJ 2331 반복수열
 *
 * memory : 14112kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P2331 {

    private static int a, p;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        List<Integer> list = new ArrayList<>();

        list.add(a);
        int index = -1;

        while (true) {
            int sum = 0;
            while (a > 0) {
                sum += (int) Math.pow(a % 10, p);
                a /= 10;
            }

            if (list.contains(sum)) {
                index = list.indexOf(sum);
                break;
            }

            list.add(sum);
            a = sum;
        }

        System.out.print(index);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
    }
}
