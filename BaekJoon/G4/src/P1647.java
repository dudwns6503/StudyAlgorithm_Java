/*
 * BOJ 1647 도시 분할 계획
 *
 * memory : 330480kb
 * time : 1376ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P1647 {

    private static List<Edge> edges = new ArrayList<>();
    private static List<Edge> connectedEdges = new ArrayList<>();
    private static int[] parents;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        Collections.sort(edges);

        int cost = 0;
        int connectedLine = 0;

        for (Edge edge : edges) {
            if (find(edge.a) == find(edge.b))
                continue;

            union(edge.a, edge.b);
            cost += edge.weight;
            connectedLine++;
            connectedEdges.add(edge);

            if (connectedLine == n - 1)
                break;
        }

        Collections.sort(connectedEdges);
        if (!connectedEdges.isEmpty())
            cost -= connectedEdges.get(connectedEdges.size() - 1).weight;

        System.out.print(cost);
    }

    private static int find(int x) {
        if (x != parents[x])
            return parents[x] = find(parents[x]);

        return x;
    }

    private static void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot == bRoot)
            return;

        if (aRoot > bRoot)
            parents[aRoot] = bRoot;
        else
            parents[bRoot] = aRoot;
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            edges.add(new Edge(a, b, weight));
        }
    }


    static class Edge implements Comparable<Edge> {
        int a;
        int b;
        int weight;

        public Edge(int a, int b, int weight) {
            this.a = a;
            this.b = b;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
}
