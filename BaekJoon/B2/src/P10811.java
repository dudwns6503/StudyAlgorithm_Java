/*
 * BOJ 10811 바구니 뒤집기
 *
 * memory : 14256kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10811 {

    private static int[] buckets;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        buckets = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            buckets[i] = i;
        }

        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            solve(i, j);
        }

        print();
    }

    private static void solve(int start, int end) {
        while (start < end) {
            int temp = buckets[start];
            buckets[start] = buckets[end];
            buckets[end] = temp;

            start++;
            end--;
        }
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(buckets[i]).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
