/*
 * BOJ 10812 바구니 순서 바꾸기
 *
 * memory : 14284kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P10812_OTHER {

    private static List<Integer> buckets;
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

        buckets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            buckets.add(i + 1);
        }

        for (int p = 0; p < m; p++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            solve(i, j, j - k + 1);
        }
    }

    private static void solve(int begin, int end, int number) {
        Collections.rotate(buckets.subList(begin - 1, end), number);
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(buckets.get(i)).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
