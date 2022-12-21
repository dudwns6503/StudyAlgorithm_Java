/*
 * BOJ 11866 요세푸스 문제 0
 *
 * memory : 23072kb
 * time : 168ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11866 {

    static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        sb.append("<");

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            if (++count % k == 0) {
                sb.append(queue.poll()).append(", ");
            }
            else {
                queue.offer(queue.poll());
            }
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append(">");

        System.out.print(sb);
    }
}
