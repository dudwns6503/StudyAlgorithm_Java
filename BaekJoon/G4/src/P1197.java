/*
BaekJoon 1197 최소 스패닝 트리

최소 신장트리는 노드 개수가 N개이면 N-1개의 간선을 가지며, 각 단계에서 사이클을 가지지 않은 최소 비용의 간선을 선택해야한다.
*/

import java.util.*;

public class P1197 {

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
            return this.weight - o.weight;
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
        System.out.print(result);
        sc.close();
    }
}