/*
 * BOJ 16953 A -> B
 *
 * memory : 17580kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P16953 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        long ans = bfs(a, b);
        System.out.print(ans);
    }

    private static long bfs(int number, int target) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(a, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            long current = node.current;
            int count = node.count;

            if (current == target) {
                return count + 1;
            }

            long first = current * 2;
            long second = current * 10 + 1;

            if (first <= target) {
                queue.offer(new Node(first, count + 1));
            }

            if (second <= target) {
                queue.offer(new Node(second, count + 1));
            }
        }

        return -1;
    }

    static class Node {
        long current;
        int count;

        public Node(long current, int count) {
            this.current = current;
            this.count = count;
        }
    }
}
