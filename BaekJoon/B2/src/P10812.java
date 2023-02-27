/*
 * BOJ 10812 바구니 순서 바꾸기
 *
 * memory : 14252kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10812 {

    private static int[] buckets;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        print();
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

        for (int p = 0; p < m; p++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            solve(i, j, k);
        }
    }

    private static void solve(int begin, int end, int mid) {
        ArrayList<Integer> arr = new ArrayList<>();

        int startIndex = mid;
        for (int i = begin; i <= end; i++) {
            if (startIndex > end) {
                startIndex = begin;
            }

            arr.add(buckets[startIndex++]);
        }

        int index = 0;
        for (int i = begin; i <= end; i++) {
            buckets[i] = arr.get(index++);
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
