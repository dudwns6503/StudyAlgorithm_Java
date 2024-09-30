/*
 * BOJ 6497 전력난
 *
 * memory : 243728kb
 * time : 752ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P6497 {

    private static ArrayList<Edge> edges;
    private static int[] parents;
    private static int n, m, ans, firstSum;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve() {
        kruskal();
        System.out.println(firstSum - ans);
    }

    private static void kruskal() {
        Collections.sort(edges);

        ans = 0;
        int connectedLine = 0;
        for (Edge edge : edges) {
            if (find(edge.x) == find(edge.y))
                continue;

            union(edge.x, edge.y);
            ans += edge.weight;
            connectedLine++;

            if (connectedLine == m - 1)
                break;
        }
    }

    private static int find(int x) {
        if (x != parents[x])
            return parents[x] = find(parents[x]);

        return x;
    }

    private static void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (xRoot == yRoot)
            return;

        if (xRoot > yRoot)
            parents[xRoot] = yRoot;
        else
            parents[yRoot] = xRoot;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            firstSum = 0;
            if (m == 0 && n == 0)
                break;

            edges = new ArrayList<>();
            parents = new int[m];
            for (int i = 0; i < m; i++) {
                parents[i] = i;
            }

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int z = Integer.parseInt(st.nextToken());

                firstSum += z;
                edges.add(new Edge(x, y, z));
            }

            solve();
        }
    }

    static class Edge implements Comparable<Edge> {
        int x;
        int y;
        int weight;

        public Edge(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
}
