/*
 * BOJ 1922 네트워크 연결
 *
 * memory : 48968kb
 * time : 508ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P1922 {

    private static int[] parents;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        parents = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            edges.add(new Edge(a, b, weight));
        }

        Collections.sort(edges);

        int cost = 0;
        int connectedLine = 0;
        for (Edge edge : edges) {
            if (find(edge.a) == find(edge.b))
                continue;

            union(edge.a, edge.b);
            cost += edge.weight;
            connectedLine++;

            if (connectedLine == n - 1)
                break;
        }

        System.out.print(cost);
    }

    private static int find(int x) {
        if (x != parents[x])
            return find(parents[x]);

        return x;
    }

    private static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB)
            return;

        if (rootA > rootB)
            parents[rootA] = rootB;
        else
            parents[rootB] = rootA;
    }

    static class Edge implements Comparable<Edge>{
        int a;
        int b;
        int weight;

        public Edge(int a, int b, int weight) {
            this.a = a;
            this.b = b;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }
}
