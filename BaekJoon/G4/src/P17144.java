/*
BaekJoon 17144 미세먼지 안녕!

구현
*/

import java.util.*;

public class P17144 {

    static int[][] house, house2;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int R, C;
    static ArrayList<Integer> airCleaner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        int T = sc.nextInt();

        house = new int[R][C];
        // 모든 칸에서 동시에 일어나는 것을 만족시키기 위해서 house배열을 복사할 house2배열 선언
        house2 = new int[R][C];
        // 미세먼지가 확산할 때, 원본에서 미세먼지가 없던 자리에서 확산 후 미세먼지가 생겼을 시
        // 사방탐색을 하는 문제가 있는데, 사방 탐색을 하지 않기 위해서 체크하기 위한 boolean 배열
        visited = new boolean[R][C];

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                house[i][j] = sc.nextInt();
            }
        }

        findAirCleaner();

        for(int test_case=0; test_case<T; test_case++) {
            for(int i=0; i<R; i++) {
                for(int j=0; j<C; j++) {
                    house2[i][j] = house[i][j];
                    visited[i][j] = false;
                }
            }

            int x = 0;
            int y = 0;
            for(int i=0; i<R; i++) {
                for(int j=0; j<C; j++) {
                    x = i;
                    y = j;
                    if(house[x][y] > 0 && !visited[x][y]) {
                        // 방향의 갯수를 체크할 count 선언
                        int count = 0;
                        for(int dir=0; dir<4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];

                            // 범위를 벗어나거나 그 자리에 공기청정기가 있을 경우 다음 방향으로 넘어감.
                            if(nx < 0 || nx >= R || ny < 0 || ny >= C || house[nx][ny] == -1) continue;

                            // 미세먼지가 없던 곳에서 확산해서 미세먼지가 생긴 공간의 경우 visited를 true로 체크해준다.
                            if(house[nx][ny] == 0) visited[nx][ny] = true;
                            house2[nx][ny] += (house[x][y] / 5);
                            count++;
                        }
                        house2[x][y] -= (house[x][y] / 5) * count;
                        if(house2[x][y] < 0) house2[x][y] = 0;
                    }
                }
            }

            // house2배열을 house에 복사해줌.
            for(int i=0; i<R; i++) {
                for(int j=0; j<C; j++) {
                    house[i][j] = house2[i][j];
                }
            }

            // 공기청정기의 위 x좌표를 기준으로 공기를 좌회전, 아래 x좌표를 기준으로 공기를 우회전..
            // 머리아프다....
            for(int i=0; i<R; i++) {
                for(int j=0; j<C; j++) {
                    if(i<airCleaner.get(0) && house[i][j] != -1) {
                        if(i==0 && j-1 >= 0) house[i][j-1] = house2[i][j];
                        if(i<airCleaner.get(0) && j == C-1 && i-1 >= 0) house[i-1][j] = house2[i][j];
                        if(j == 0) {
                            if(i+1 == airCleaner.get(0)) continue;
                            house[i+1][j] = house2[i][j];
                        }
                    } else if(i == airCleaner.get(0) && j+1 < C && house[i][j] != -1) {
                        house[i][j+1] = house2[i][j];
                        if(j==1) house[i][j] = 0;
                    } else if(i == airCleaner.get(0) && j == C-1 && i-1>=0) {
                        house[i-1][j] = house2[i][j];
                    } else if(i == airCleaner.get(1) && j+1 < C && house[i][j] != -1) {
                        house[i][j+1] = house2[i][j];
                        if(j==1) house[i][j] = 0;
                    } else if(i == airCleaner.get(1) && j == C-1 && i+1<R) {
                        house[i+1][j] = house2[i][j];
                    }
                    else if(i > airCleaner.get(1) && house2[i][j] != -1) {
                        if(j == C-1 && i+1 < R) house[i+1][j] = house2[i][j];
                        else if(i == R-1 && j-1 >= 0) house[i][j-1] = house2[i][j];
                        else if(j == 0) {
                            if(i-1 == airCleaner.get(1)) continue;
                            house[i-1][j] = house2[i][j];
                        }
                    }
                }
            }
        }

        int answer = sumFineDust();
        System.out.print(answer);
        sc.close();
    }

    // 미세먼지의 x좌표를 arrayList에 넣어준다. x좌표가 작은 수부터 들어가므로
    // get(0)을 기준으로 공기청정기 작동이 좌회전, get(1)을 기준으로 공기청정기 작동이 우회전
    private static void findAirCleaner() {
        airCleaner = new ArrayList<>();

        for(int i=0; i<R; i++) {
            if(house[i][0] == -1)
                airCleaner.add(i);
        }
    }

    // house에 있는 모든 미세먼지의 값을 더한다.(공기청정기 제외)
    private static int sumFineDust() {
        int res = 0;
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                if(house[i][j] != -1)
                    res += house[i][j];
            }
        }
        return res;
    }

}