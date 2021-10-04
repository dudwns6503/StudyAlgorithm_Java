/*
 * BOJ 1697 숨바꼭질
 */

import java.io.*;
import java.util.*;

public class P1697 {

    // 방문을 확인하는 visited 1차원 배열
    static int[] visited = new int[100001];
    static int N, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // N = K라면 0
        if(N == K) {
            System.out.print(0);
        } else {
            bfs(N);
        }
    }

    private static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(num);

        visited[num] = 1;

        while(!q.isEmpty()) {
            int x = q.poll();

            for(int i=0; i<3; i++) {
                int nx;

                if(i==0) {
                    nx = x+1;
                } else if(i==1) {
                    nx = x-1;
                } else {
                    nx = x*2;
                }

                if(nx == K) {
                    System.out.println(visited[x]);
                    return;
                }

                if(nx >= 0 && nx < visited.length && visited[nx] == 0) {
                    q.offer(nx);
                    visited[nx] = visited[x] + 1;
                }
            }
        }

    }
}
