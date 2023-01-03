/*
 * BOJ 1967 트리의 지름
 *
 * memory : 1967kb
 * time : 220ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1967 {

    private static ArrayList<Node>[] tree;
    private static boolean[] visited;
    private static int max_node, n, max = -1;

    public static void main(String[] args) throws Exception
    {
        input();
        solve();
    }

    public static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        tree = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            tree[parent].add(new Node(child, weight));
            tree[child].add(new Node(parent, weight));
        }
    }

    public static void solve() {
        visited = new boolean[n + 1];
        dfs(1, 0);

        visited = new boolean[n + 1];
        dfs(max_node, 0);

        System.out.print(max);
    }

    static void dfs(int startNode, int weight) {
        if (weight > max) {
            max = weight;
            max_node = startNode;
        }

        visited[startNode] = true;

        for (Node node : tree[startNode]) {
            if (!visited[node.number]) {
                dfs(node.number, weight + node.weight);
            }
        }
    }

    static class Node {
        private int number;
        private int weight;

        public Node(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    }
