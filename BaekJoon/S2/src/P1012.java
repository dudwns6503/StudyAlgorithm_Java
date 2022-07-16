/*
 * BOJ 1012 유기농 배추
 *
 * memory : 15980kb
 * time : 164ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1012 {

    static StringBuilder sb = new StringBuilder();
    static boolean[][] visited;
    static int[][] field;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N, M, K, test_case, ans;
    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        test_case = Integer.parseInt(br.readLine());

        for(int i=0; i<test_case; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            field = new int[N][M];
            visited = new boolean[N][M];

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                field[x][y] = 1;
            }

            pro();
        }
    }

    static void dfs(int x, int y) {

        visited[x][y] = true;

        for(int k=0; k<4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(visited[nx][ny]) continue;
            if(field[nx][ny] == 0) continue;

            field[nx][ny] = 1;
            dfs(nx, ny);
        }
    }

    static void pro() {

        ans = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(!visited[i][j] && field[i][j] == 1) {
                    dfs(i, j);
                    ans++;
                }
            }
        }

        sb.append(ans).append("\n");
    }

    public static void main(String[] args) throws Exception {

        input();
        System.out.print(sb.toString());
    }
}