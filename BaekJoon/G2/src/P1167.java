/*
 * BOJ 1167 트리의 지름
 *
 * memory : 105020kb
 * time : 800ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1167 {

    private static ArrayList<Node>[] tree;
    private static boolean[] visited;
    private static int v, max_node, max = -1;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        v = Integer.parseInt(br.readLine());

        tree = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            st = new StringTokenizer(br.readLine());

            int current = Integer.parseInt(st.nextToken());

            while (true) {
                int next = Integer.parseInt(st.nextToken());
                if (next == -1) break;

                int distance = Integer.parseInt(st.nextToken());
                tree[current].add(new Node(next, distance));
            }
        }


    }

    private static void solve() {
        visited = new boolean[v + 1];
        dfs(1, 0);

        visited = new boolean[v + 1];
        dfs(max_node, 0);

        System.out.print(max);
    }

    private static void dfs(int x, int distance) {
        if (distance > max) {
            max = distance;
            max_node = x;
        }

        visited[x] = true;

        for (Node node : tree[x]) {
            if (visited[node.number] == true) continue;

            dfs(node.number, node.distance + distance);
        }
    }

    static class Node {
        int number, distance;

        public Node(int number, int distance) {
            this.number = number;
            this.distance = distance;
        }
    }
}
