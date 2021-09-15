/*
SW Expert Academy 문제 3124 최소 스패닝 트리 문제

신장 트리는 N개의 정점을 가진 그래프의 최소 간선 수는 N-1개이고, 모든 정점들이 연결되어 있어야하며, 사이클을 포함해서는 안된다.
최소 신장 트리는 신장 트리 중에서 사용된 간선들의 가중치의 합이 최소인 트리를 말한다.
따라서 가중치의 오름차순으로 정렬해주는 것이 포인트이다.
*/


import java.util.*;

public class P3124 {

    static int V, E;
    static Edge[] edgeList;
    static int[] parents;

    static class Edge implements Comparable<Edge> {

        int start, end, weight;

        public Edge(int start, int end, int weight) {
            super();
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            // return this.weight - o.weight; // 간선의 부호가 모두 같을 때
            return Integer.compare(this.weight, o.weight);
        }
    }

        private static void makeSet() {
            parents = new int[V+1];
            for(int i=1; i<=V; i++) {
                parents[i] = i;
            }
        }

        private static int findSet(int a) {
            if(a == parents[a]) return a;
            return parents[a] = findSet(parents[a]);
        }

        private static boolean unionSet(int a, int b) {
            int aRoot = findSet(a);
            int bRoot = findSet(b);
            if(aRoot == bRoot) return false;

            parents[bRoot] = aRoot;
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++) {
            V = sc.nextInt();
            E = sc.nextInt();

            edgeList = new Edge[E];
            for(int i=0; i<E; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                int weight = sc.nextInt();
                edgeList[i] = new Edge(start, end, weight);
            }

            Arrays.sort(edgeList);

            makeSet();

            long cnt = 0;
            long result = 0;
            for(Edge edge: edgeList) {
                if(unionSet(edge.start, edge.end)) {
                    result += edge.weight;
                    if(++cnt == V - 1) break;
                }
            }
            System.out.println("#" + test_case + " " + result);
            sc.close();
        }
    }
}
