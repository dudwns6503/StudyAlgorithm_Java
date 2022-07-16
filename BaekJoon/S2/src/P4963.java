/*
 * BOJ 4963 섬의 개수
 *
 * memory : 16064kb
 * time : 168ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4963 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static boolean[][] visited;
    static int[][] dir = {{-1, 0}, {-1, -1}, {-1, 1}, {0, 1}, {0, -1}, {1, 0}, {1, -1}, {1, 1}};
    static int[][] map;
    static int w, h, ans;

    static void input() throws Exception {

        map = new int[h][w];
        visited = new boolean[h][w];

        for(int i=0; i<h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<w; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void dfs(int x, int y) {

        visited[x][y] = true;

        for(int k=0; k<8; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if(nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
            if(visited[nx][ny]) continue;
            if(map[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }

    static void  pro() {

        ans = 0;

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception {

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) break;

            input();
            pro();
        }
    }
}
