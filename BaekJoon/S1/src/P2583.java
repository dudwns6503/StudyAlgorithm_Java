/*
 * BOJ 2583 영역 구하기
 *
 * memory : 15296kb
 * time : 136ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2583 {

    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> result = new ArrayList<Integer>();
    static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    static int[][] paper;
    static int M, N, K, size;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // M : 세로 길이, N: 가로 길이, K: 직사각형 갯수
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        paper = new int[M][N];

        for(int k=0; k<K; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int i=y1; i<y2; i++) {
                for(int j=x1; j<x2; j++) {
                    paper[i][j] = 1;
                }
            }
        }
    }

    static void sol() {
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(paper[i][j] == 0) {
                    size = 0;
                    dfs(i, j);
                    result.add(size);
                }
            }
        }

        Collections.sort(result);
        sb.append(result.size()).append("\n");
        for(int i=0; i<result.size(); i++) {
            sb.append(result.get(i)).append(" ");
        }

        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        paper[x][y] = 2;
        size++;

        for(int k=0; k<4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if(paper[nx][ny] != 0) continue;
            dfs(nx, ny);
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        sol();
    }
}
