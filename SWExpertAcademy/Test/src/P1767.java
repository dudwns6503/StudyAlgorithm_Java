/*
SW Expert Academy 문제 1767 [SW Test 샘플문제] 프로세서 연결하기
*/

import java.util.*;
import java.io.*;

public class P1767 {

    static int[][] map;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };
    static int coreCnt, coreMax, N, lineMin;
    static ArrayList<Node> core;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int test_case=1; test_case<=T; test_case++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());

            map = new int[N][N];
            core = new ArrayList<>();
            coreCnt = 0;
            coreMax = Integer.MIN_VALUE;
            lineMin = Integer.MAX_VALUE;

            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());

                    // 가장자리에 있는 코어는 그냥 넘어감.
                    if (map[i][j] == 1) {
                        if (i == 0 || i == N - 1 || j == 0 || j == N - 1)
                            continue;

                        coreCnt++;
                        core.add(new Node(i, j));
                    }
                }
            }

            setCore(0, 0, 0);
            System.out.println("#" + test_case + " " + lineMin);
        }
    }

    public static void setCore(int coreIdx, int sucCore, int lineLen) {
        // 기저 조건 : 모든 코어를 다 순회했을 때
        if (coreIdx == coreCnt) {
            if (coreMax < sucCore) {
                coreMax = sucCore;
                lineMin = lineLen;
            } else if (coreMax == sucCore) {
                if(lineMin > lineLen)
                    lineMin = lineLen;
            }
            return;
        }

        for (int i=0; i<4; i++) {
            int res = setLine(coreIdx, i);

            if (res == -1) { // 실패
                setCore(coreIdx + 1, sucCore, lineLen);
            } else { // 성공
                setCore(coreIdx + 1, sucCore + 1, lineLen + res);

                int ny = core.get(coreIdx).y;
                int nx = core.get(coreIdx).x;

                while (true) {
                    ny += dy[i];
                    nx += dx[i];

                    // 가장 자리에 도달한 경우
                    if (ny < 0 || ny > N - 1 || nx < 0 || nx > N - 1)
                        break;

                    map[ny][nx] = 0;
                }
            }
        }
    }

    public static int setLine(int coreIdx, int dir) {
        ArrayList<Node> list = new ArrayList<>();
        Node cp = core.get(coreIdx);
        int ny = cp.y;
        int nx = cp.x;
        int lineLen = 0;

        while (true) {
            ny += dy[dir];
            nx += dx[dir];

            if (ny < 0 || ny > N - 1 || nx < 0 || nx > N - 1)
                break;

            if (map[ny][nx] != 0)
                return -1;

            list.add(new Node(ny, nx));
            lineLen++;
        }

        for (Node p : list) {
            map[p.y][p.x] = 2;
        }

        return lineLen;
    }

    public static class Node {
        int y;
        int x;

        public Node(int y, int x) {
            super();
            this.y = y;
            this.x = x;
        }
    }
}