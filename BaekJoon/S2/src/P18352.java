/*
 * BOJ 18352 특정 거리의 도시찾기
 *
 * memory : 369308kb
 * time : 2976ms
 */

import java.util.*;

/**
 *  특정 거리의 도시찾기(이코테)
 *
 *  n: 도시의 개수
 *  m: 도로의 개수
 *  k: 거리 정보
 *  x: 출발 도시의 번호
 *  d: 도시 최단 거리 배열
 *
 *  그래프에서 모든 간선의 비용이 동일할 때 -> 너비 우선 탐색(BFS) 이용하여 최단 거리 찾을 수 있음. 시간 복잡도 O(N+M)
 *  X를 시작으로 BFS를 수행하여 모든 도시까지의 최단 거리를 계산한 뒤, 거리가 K인 경우 출력한다.
 */

public class P18352 {

    public static int n, m, k, x;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    // 모든 도시에 대한 최단 거리 초기화
    public static int[] d = new int[300001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();

        // 그래피 및 최단 거리 테이블 초기화
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
            d[i] = -1;
        }

        // 모든 도로 정보 입력 받기
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        // 출발 도시까지의 거리는 0으로 설정
        d[x] = 0;

        // 너비 우선 탐색(BFS) 수행
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(x);
        while (!q.isEmpty()) {
            int now = q.poll();
            // 현재 도시에서 이동할 수 있는 모든 도시를 확인
            for (int i=0; i<graph.get(now).size(); i++) {
                int nextNode = graph.get(now).get(i);
                // 아직 방문하지 않은 도시라면
                if (d[nextNode] == -1) {
                    // 최단 거리 갱신
                    d[nextNode] = d[now] + 1;
                    q.offer(nextNode);
                }
            }
        }

        // 최단 거리가 K인 모든 도시의 번호를 오름차순으로 출력
        boolean check = false;
        for(int i=1; i<=n; i++) {
            if (d[i] == k) {
                System.out.println(i);
                check = true;
            }
        }

        // 만약 최단 거리가 K인 도시가 없다면, -1 출력
        if (!check) System.out.println(-1);
    }
}
