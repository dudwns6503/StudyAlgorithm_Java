/*
 * BOJ 13549 숨바꼭질 3
 *
 * memory : 18968kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P13549 {

    private static int n, k;

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
        int cnt = bfs(n, k);
        System.out.print(cnt);
    }

    private static int bfs(int start, int target) {
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        queue.add(new Node(start, 0));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            int num = node.num;
            int count = node.count;

            if (num == target) return count;

            if (!isOutOfRange(num * 2) && !visited[num * 2]) {
                queue.offer(new Node(num * 2, count));
                visited[num * 2] = true;
            }

            if (!isOutOfRange(num - 1) && !visited[num - 1] ) {
                queue.offer(new Node(num - 1, count + 1));
                visited[num - 1] = true;
            }

            if (!isOutOfRange(num + 1) && !visited[num + 1]) {
                queue.offer(new Node(num + 1, count + 1));
                visited[num + 1] = true;
            }
        }

        return 0;
    }

    private static boolean isOutOfRange(int current) {
        return current < 0 || current > 100000;
    }

    static class Node {
        int num;
        int count;

        public Node(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}
