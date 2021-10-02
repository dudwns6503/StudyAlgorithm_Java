/*
 * BOJ 17143 낚시왕
 */

import java.util.*;
import java.io.*;

public class P17143 {

    static class Shark {
        int x, y, dir, speed, size;

        Shark() {}
    }

    static int[][] map = new int[101][101];
    // 1 위, 2 아래, 3 오른쪽, 4 왼쪽
    static int[] dx = {0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 1, -1};
    static int R, C, M;
    static int ans = 0;
    static Map<Integer, Shark> sharks = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            Shark s = new Shark();
            s.x = Integer.parseInt(st.nextToken());
            s.y = Integer.parseInt(st.nextToken());
            s.speed = Integer.parseInt(st.nextToken());
            s.dir = Integer.parseInt(st.nextToken());
            s.size = Integer.parseInt(st.nextToken());

            sharks.put(s.size, s);
            map[s.x][s.y] = s.size;
        }

        for(int i=1; i<=C; i++) {
            fishing(i);
            moveShark();
        }

        System.out.print(ans);
    }

    // 오른쪽으로 한칸 이동 후 땅과 가장 가까운 상어를 잡음 => x가 가장 작은 상어
    private static void fishing(int column) {
        for(int i=1; i<R+1; i++){
            // 상어가 존재한다면
            if(map[i][column] != 0) {
                ans += map[i][column];
                sharks.remove(map[i][column]);
                map[i][column] = 0;
                return;
            }
        }
    }

    // 상어 이동
    private static void moveShark() {
        int[][] temp = new int[R+1][C+1];
        Queue<Integer> losers = new LinkedList<>();

        for (Integer key : sharks.keySet()) {
            Shark s = sharks.get(key);
            map[s.x][s.y] = 0;

            // 상어 속력만큼 이동
            for (int i=0; i<s.speed; i++) {
                // 범위 끝에 상어라면 방향을 바꿔줌
                if (s.dir == 1 && s.x == 1) {
                    s.dir = 2;
                } else if (s.dir == 2 && s.x == R) {
                    s.dir = 1;
                } else if (s.dir == 3 && s.y == C) {
                    s.dir = 4;
                } else if (s.dir == 4 && s.y == 1) {
                    s.dir = 3;
                }

                s.x += dx[s.dir];
                s.y += dy[s.dir];
            }

            // 이동 후 위치가 겹치면 사이즈가 작은 것이 잡아 먹힌다.
            if (temp[s.x][s.y] == 0) {
                temp[s.x][s.y] = s.size;
            } else if (s.size > temp[s.x][s.y]) {
                losers.add(temp[s.x][s.y]);
                temp[s.x][s.y] = s.size;
            } else {
                losers.add(s.size);
            }
        }

        // 경쟁에서 진 상어들 삭제
        while (!losers.isEmpty()) {
            sharks.remove(losers.poll());
        }

        // 상어 이동 후인 temp 배열을 map 배열에 덮어쓰기
        for (Integer key : sharks.keySet()) {
            Shark s = sharks.get(key);
            map[s.x][s.y] = temp[s.x][s.y];
        }
    }
}
