/*
 * BOJ 21938 영상처리
 *
 * memory : 110648kb
 * time : 616ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21938 {

    static int[][] colors;
    static int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    static int N, M, T, count;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        colors = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<M; j++) {
                int sum = 0;

                int R = Integer.parseInt(st.nextToken());
                int G = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                sum = R + G + B;

                colors[i][j] = sum;
            }
        }

        T = Integer.parseInt(br.readLine());
    }

    static void sol() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(colors[i][j] / 3 >= T)  colors[i][j] = 255;
                else colors[i][j] = 0;
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(colors[i][j] == 255) {
                    count++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(count);
    }

    static void dfs(int x, int y) {

        colors[x][y] = 0;

        for(int k=0; k<4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

            if(colors[nx][ny] == 255) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
}
