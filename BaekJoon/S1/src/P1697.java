/*
 * BOJ 1697 숨바꼭질
 *
 * memory : 21008kb
 * time : 208ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1697 {

    static int[] dist, map;
    static int N, K;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        dist = new int[100001];
        map = new int[100001];

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    static void bfs(int start) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(start);
        dist[start] = 0;

        while(!que.isEmpty()) {
            int cur = que.poll();

            // 다음칸이 범위 안에 들어오고 방문한 적이 없던 노드라면 노드 간의 거리를 저장하고, queue에 넣어준다.
            if(cur+1 <= 100000 && dist[cur+1] == -1) {
                dist[cur+1] = dist[cur] + 1;
                que.offer(cur+1);
            }
            if(cur-1 >= 0 && dist[cur-1] == -1) {
                dist[cur-1] = dist[cur] + 1;
                que.offer(cur-1);
            }
            if(cur*2 <= 100000 && dist[cur*2] == -1) {
                dist[cur*2] = dist[cur] + 1;
                que.offer(cur*2);
            }
        }
    }

    static void pro() {

        // dist를 -1로 초기화(visited역할도 한다.)
        for(int i=0; i<dist.length; i++) {
            dist[i] = -1;
        }

        bfs(N);
        System.out.print(dist[K]);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}