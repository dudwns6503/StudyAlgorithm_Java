/*
 * BOJ 21610 마법사 상어와 비바라기
 *
 * memory : 28636kb
 * time : 508ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P21610 {

    private static int[][] a;
    // 구름이 이동하는 방향(0번 인덱스 제외)
    private static int[][] dir = {{0, 0}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
    // 생성된 구름의 좌표를 저장하는 clouds 리스트
    private static ArrayList<Cloud> clouds;
    // 이동한 구름의 좌표를 저장하는 newClouds 리스트
    private static ArrayList<Cloud> newClouds;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 처음 생성된 비구름의 좌표를 clouds 변수에 저장.
        clouds = new ArrayList<>();
        clouds.add(new Cloud(n, 1));
        clouds.add(new Cloud(n, 2));
        clouds.add(new Cloud(n - 1, 1));
        clouds.add(new Cloud(n - 1, 2));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int direction = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            solve(direction, distance);
        }

        print();
    }

    private static void solve(int direction, int distance) {
        newClouds = new ArrayList<>();

        // 1. 모든 구름이 d 방향으로 s 칸 만큼 이동한다.
        for (int i = 0; i < clouds.size(); i++) {
            int r = clouds.get(i).r;
            int c = clouds.get(i).c;

            r += dir[direction][0] * distance;
            while (r > n) {
                r -= n;
            }
            while (r <= 0) {
                r += n;
            }

            c += dir[direction][1] * distance;
            while (c > n) {
                c -= n;
            }
            while (c <= 0) {
                c += n;
            }

            // 이동한 구름의 좌표를 newClouds 리스트에 저장.
            newClouds.add(new Cloud(r, c));
        }
        // clouds 리스트는 새로 생길 구름을 저장하기 위해서 초기화해준다.
        clouds = new ArrayList<>();

        // 2. 각 구름에서 비가 내려 구름이 있는 칸의 바구니에 저장된 물의 양이 1 증가한다.
        for (int i = 0; i < newClouds.size(); i++) {
            int r = newClouds.get(i).r;
            int c = newClouds.get(i).c;

            a[r][c]++;
        }

        // 3. 구름이 모두 사라진다. (딱히 여기서 필요한 로직은 없다.)
        // 4. 2에서 물이 증가한 칸에 물복사 버그 시전
        for (int i = 0; i < newClouds.size(); i++) {
            int r = newClouds.get(i).r;
            int c = newClouds.get(i).c;

            // 대각선 방향을 탐색해야 하므로 2씩 증가.
            for (int k = 2; k <= 8; k += 2) {
                int nr = r + dir[k][0];
                int nc = c + dir[k][1];

                // 구름의 이동과 다르게 범위를 벗어난 경우 탐색하지 않음.
                if (nr > n || nc > n || nr <= 0 || nc <= 0) continue;
                // 탐색한 곳에 물이 있는 바구니가 존재한다면 현재 칸의 바구니의 물 1 증가.
                if (a[nr][nc] > 0) a[r][c]++;
            }
        }

        // 5. 물의 양이 2이상인 모든 칸에 구름 생기고, 원래 구름이 있던 칸은 구름 안생김.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                /*
                    이동한 구름들(newClouds)의 좌표와 현재 칸(a[i][j])의 좌표를 비교
                    일치하다면 -> 3번에서 사라진 구름이므로 구름을 생성하지 않는다.
                    다르다면 -> a[i][j]가 2 이상이라면 -> a[i][j] 2 감소시키고, 구름을 생성한다(clouds 리스트에 저장).
                 */
                boolean flag = false;
                for (int k = 0; k < newClouds.size(); k++) {
                    int r = newClouds.get(k).r;
                    int c = newClouds.get(k).c;

                    if (i == r && j == c) {
                        flag = true;
                        break;
                    }
                }

                if (!flag && a[i][j] >= 2) {
                    a[i][j] -= 2;
                    clouds.add(new Cloud(i, j));
                }
            }
        }
    }

    private static void print() {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                ans += a[i][j];
            }
        }

        System.out.print(ans);
    }


    static class Cloud {
        int r, c;

        public Cloud(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
