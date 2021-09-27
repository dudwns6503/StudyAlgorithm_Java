import java.io.*;
import java.util.*;

/*
 * 정올 1681
 *
 * 처음에 MST로 풀려고했으나... 잘 해결이 안되었고, 노드의 개수가 적어서 백트래킹으로 다시 시도하여 풀 수 있었다.
 *
 * 1. 맵을 입력받고 DFS로 방문하지 않은 모든 간선을 탐색한다.
 * 2. 모든 노드를 연결한 후 돌아올 수 있는 모든 경우 중에서 가장 작은 cost값을 출력하는 것이 정답이다.
 */

public class P1681 {

    static int[][] map;
    static boolean[] isVisited;
    static int N, cost, min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        isVisited = new boolean[N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        isVisited[0] = true;
        dfs(0, 0, 0);

        System.out.println(min);
    }

    private static void dfs(int now, int cnt, int cost) {
        // 간선의 개수가 N-1이거나 cost가 min값을 넘으면-> return
        if(cnt == N-1) {
            // 회사로 돌아가는 길이 없으면 종료
            if(map[now][0] == 0) return;

            cost += map[now][0];
            min = Math.min(cost, min);
            return;
        }

        if(cost > min) return;

        for(int i=0; i<N; i++) {
            if(isVisited[i]) continue;
            // 특정 노드로 이동할 수 없다면 넘어간다.
            if(map[now][i] == 0) continue;

            isVisited[i] = true;
            // 비용은 누적해서 넘겨준다.
            dfs(i, cnt+1, cost+map[now][i]);
            isVisited[i] = false;
        }
    }

}