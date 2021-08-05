/*
SW Expert Academy 문제 1974 스도쿠 검증
*/

import java.util.Scanner;

public class P1974 {

    static int T;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int answer;
            int sum = 0; // 가로, 세로, 3x3에 저장된 수가 45인지 확인하기 위한 변수
            int N = 9; // 9x9의 배열
            boolean flag = true; // 만약 스도쿠의 조건이 안된다면 false로 표시
            int[][] map = new int[N][N];

            for(int i=0; i < N; i++) {
                for(int j=0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<N; i++) { // 가로줄이 조건을 만족하는지 확인
                for(int j = 0; j<N; j++) {
                    sum += map[i][j];
                }
                if(sum == 45) {
                    sum = 0;
                } else {
                    flag = false;
                    break;
                }
            }

            sum=0;
            for(int j=0; j<N; j++) { // 세로줄이 조건을 만족하는지 확인
                if(!flag) break;
                for(int i = 0; i<N; i++) {
                    sum += map[i][j];
                }
                if(sum == 45) {
                    sum = 0;
                } else {
                    flag = false;
                    break;
                }
            }

            sum = 0;

            for(int i=0; i<7; i+= 3) { // 3x3이 스도쿠의 조건을 만족하는지 확인
                if(!flag) break;
                for(int j=0; j<7; j+=3) {
                    for(int x=0; x<3; x++) {
                        for(int y=0; y<3; y++) {
                            sum += map[i+x][j+y];
                        }
                    }
                    if(sum == 45) {
                        sum = 0;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) // 조건을 만족하면 answer에 1을 대입
                answer = 1;
            else
                answer = 0;

            System.out.println("#" + test_case + " " + answer);
        }

    }
}