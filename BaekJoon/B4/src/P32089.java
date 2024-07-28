/*
 * BOJ 32089 部員の変遷
 *
 * memory : 16556kb
 * time : 176ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32089 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            int[] a = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int current = a[0] + a[1] + a[2];
            int max = current;
            for (int i = 3; i < n; i++) {
                current = current + a[i] - a[i - 3];
                max = Math.max(max, current);
            }

            System.out.println(max);
        }
    }
}
