/*
 * BOJ 2667 단지번호 붙이기
 *
 * memory : 14160kb
 * time : 148ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2667 {

    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer> group;
    static boolean[][] visited;
    static int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    static String[] str;
    static int N, group_cnt;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        str = new String[N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            str[i] = br.readLine();
        }
    }

    static void dfs(int x, int y) {

        group_cnt++;
        visited[x][y] = true;

        for(int k=0; k<4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if(visited[nx][ny] == true) continue;
            if(str[nx].charAt(ny) == '0') continue;

            dfs(nx, ny);
        }
    }

    static void pro() {

        group = new ArrayList<>();

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && str[i].charAt(j) == '1') {
                    group_cnt = 0;
                    dfs(i, j);
                    group.add(group_cnt);
                }
            }
        }

        Collections.sort(group);

        sb.append(group.size()).append("\n");
        for(int cnt: group) sb.append(cnt).append("\n");

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
