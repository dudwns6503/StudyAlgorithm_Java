/*
 * BOJ 32604 Jumbled Scoreboards
 *
 * memory : 14276kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32604 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int prevA = 0;
        int prevB = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a < prevA || b < prevB) {
                System.out.print("no");
                return;
            }

            prevA = a;
            prevB = b;
        }

        System.out.print("yes");
    }
}
