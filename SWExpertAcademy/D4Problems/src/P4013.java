/*
SW Expert Academy 문제 4013 [모의 SW 역량테스트] 특이한 자석
*/

import java.io.*;
import java.util.*;

public class P4013 {

    static int[][] gear;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        gear = new int[4][8]; // r : 톱니바퀴 인덱스, c : 각 톱니

        for (int test_case = 1; test_case <= T; test_case++) {
            // 톱니 회전 횟수
            int K = Integer.parseInt(br.readLine());

            for (int i=0; i<4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0; j<8; j++) {
                    gear[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i=0; i<K; i++) { // 회전시키는 횟수만큼 반복
                StringTokenizer st = new StringTokenizer(br.readLine());

                int gearNum = Integer.parseInt(st.nextToken()); // 자석 번호
                int rotateDir = Integer.parseInt(st.nextToken()); // 회전 방향

                gearNum -= 1; // 인덱스는 0부터 시작하므로 1씩 빼준다.

                /*
                 * 회전했을 때 각 극이 맞는지 안 맞는지 체크함.
                 * 이전 톱니바퀴의 6번과 다음 톱니바퀴의 2번을 확인.
                 *
                 * rotateDir에는 1과 -1만 들어올 수 있으므로 부호를 바꾸는 것으로 시계방향과 반시계방향을 쉽게 나타낼 수 있다.
                 */
                if (gearNum == 0) {
                    if (gear[gearNum][2] != gear[gearNum+1][6]) {
                        if (gear[gearNum+1][2] != gear[gearNum+2][6]) {
                            if (gear[gearNum+2][2] != gear[gearNum+3][6]) {
                                rotate(gearNum+3, -rotateDir);
                            }
                            rotate(gearNum+2, rotateDir);
                        }
                        rotate(gearNum+1, -rotateDir);
                    }
                    rotate(gearNum, rotateDir);
                }

                if (gearNum == 1) {
                    if (gear[gearNum][6] != gear[gearNum-1][2]) {
                        rotate(gearNum-1, -rotateDir);
                    }
                    if (gear[gearNum][2] != gear[gearNum+1][6]) {
                        if (gear[gearNum+1][2] != gear[gearNum+2][6]) {
                            rotate(gearNum+2, rotateDir);
                        }
                        rotate(gearNum+1, -rotateDir);
                    }
                    rotate(gearNum, rotateDir);
                }

                if (gearNum == 2) {
                    if (gear[gearNum][2] != gear[gearNum + 1][6]) {
                        rotate(gearNum+1, -rotateDir);
                    }
                    if (gear[gearNum][6] != gear[gearNum - 1][2]) {
                        if (gear[gearNum - 1][6] != gear[gearNum - 2][2]) {
                            rotate(gearNum-2, rotateDir);
                        }
                        rotate(gearNum-1, -rotateDir);
                    }
                    rotate(gearNum, rotateDir);
                }

                if (gearNum == 3) {
                    if (gear[gearNum][6] != gear[gearNum-1][2]) {
                        if (gear[gearNum-1][6] != gear[gearNum-2][2]) {
                            if (gear[gearNum-2][6] != gear[gearNum-3][2]) {
                                rotate(gearNum-3, -rotateDir);
                            }
                            rotate(gearNum-2, rotateDir);
                        }
                        rotate(gearNum-1, -rotateDir);
                    }
                    rotate(gearNum, rotateDir);
                }
            }

            int ans = 0; // 정답을 저장하기 위한 변수

            // 점수 획득은 1,2,4,8 -> 2의 지수 승으로 증가하므로 비트의 shift로 쉽게 나타낼 수 있다.
            for (int i=0; i<4; i++) {
                if (gear[i][0] == 1) {
                    ans += (1 << i);
                }
            }
            System.out.println("#" + test_case + " " + ans); // 정답 출력
        }
    }

    /*
     * idx : 회전시킬 바퀴 인덱스
     * dir : 방향
     */
    private static void rotate(int idx, int dir) {
        int[] temp;

        switch (dir) {
            case 1: // 시계 방향 회전
                temp = new int[8];
                temp[0] = gear[idx][7]; // 시계방향 회전 시, 마지막 값을 맨 앞으로 보내기 위한 저장

                for (int i=0; i<gear[0].length-1; i++) {
                    temp[i+1] = gear[idx][i]; // 한칸씩 오른쪽으로 밀어준 값을 임시 변수에 저장
                }

                for (int i=0; i<temp.length; i++) {
                    gear[idx][i] = temp[i]; // 임시 변수에 저장된 값을 원본에 저장
                }
                break;
            case -1: // 반시계 방향 회전
                temp = new int[8];
                temp[7] = gear[idx][0]; // 반 시계방향 회전 시, 첫번째 값을 맨 뒤로 보내기 위한 저장

                for (int i=1; i<gear[0].length; i++) {
                    temp[i-1] = gear[idx][i]; // 한칸씩 왼쪽으로 밀어준 값을 임시 변수에 저장
                }

                for (int i=0; i<temp.length; i++) {
                    gear[idx][i] = temp[i]; // 임시 변수에 저장된 값을 원본에 저장
                }
                break;
        }
    }
}
