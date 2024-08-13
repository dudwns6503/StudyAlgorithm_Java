/*
 * BOJ 1158 요세푸스 문제
 *
 * memory : 294684kb
 * time : 592ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1158 {

    private static StringBuilder sb = new StringBuilder();
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        sb.append("<");
        while (!queue.isEmpty()) {
            ++cnt;
            if (cnt % k == 0) {
                sb.append(queue.poll()).append(", ");
                cnt = 0;
            }
            else {
                queue.offer(queue.poll());
            }
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }
}
