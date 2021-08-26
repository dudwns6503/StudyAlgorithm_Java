/*
BaekJoon 10026 적록색약
*/

import java.io.*;

public class P10026 {
    static int N;
    static char[][] map, map2;
    // 우, 좌, 상, 하
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        map2 = new char[N][N];
        int answer1 = 0; // 색약X
        int answer2 = 0; // 적록색약

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                // 적록색약이 아니면 맵에 그냥 넣어줌.
                map[i][j] = str.charAt(j);
                // 적록색약이라면 맵에 G를 R로 바꿔서 넣어줌.
                if(str.charAt(j) == 'G')  map2[i][j] = 'R';
                else map2[i][j] = str.charAt(j);
            }
        }

        // DFS를 색약인 사람과 색약이 아닌 사람 따로 실행해서 값을 얻는다.
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                // 색약이 아닌 사람이 방문하지 않은 곳이면 DFS
                if(map[i][j] != 'O') {
                    dfs(i, j, map[i][j]);
                    answer1++;
                }
                // 색약인 사람이 방문하지 않은 곳이면 DFS
                if(map2[i][j] != 'O') {
                    dfs2(i, j, map2[i][j]);
                    answer2++;
                }
            }
        }
        System.out.println(answer1 + " " + answer2);
    }

    // 적록색약 X
    private static void dfs(int x, int y, char color) {

        // 현재 좌표의 위치를 상관없는 값으로 바꿔줌.
        map[x][y] = 'O';

        // 4방 탐색후 현재 위치와 같은 색이면 dfs 반복
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 벗어나면 continue
            if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            // 이미 방문한 곳이라면 continue
            if(map[nx][ny] == 'O') continue;
            // 현재 위치와 같은 색이 아니라면 continue
            if(color != map[nx][ny]) continue;
            dfs(nx, ny, map[nx][ny]);
        }
    }
    // 적록색약 O
    private static void dfs2(int x, int y, char color) {
        map2[x][y] = 'O';

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if(map2[nx][ny] == 'O') continue;
            if(color != map2[nx][ny]) continue;
            dfs2(nx, ny, map2[nx][ny]);
        }
    }
}
