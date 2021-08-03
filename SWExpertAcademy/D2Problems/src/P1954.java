/*
SW Expert Academy 문제 1954 달팽이 문제
*/

import java.util.Scanner;

public class P1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++) {
            // 입력
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            int count = 1; // 배열에 적을 값 변수
            int i = 0;
            int j = 0;
            int k = 1; // 칸을 한바퀴돌때마다 시작위치를 정하기 위해서 지정한 변수
            while(count <= N*N) { // count가 N^2보다 작거나 같을 경우에만 반복)
                i = k - 1; // 변수 k를 시작위치를 지정하는데 사용함으로써 매 while문마다 시작위치가 달라진다.
                for(j = k - 1; j<N; j++) {
                    if (map[i][j] == 0) {
                        map[i][j] = count;
                        count++;
                    } else break;
                }

                j = N - k;
                for(i = k; i < N; i++) {
                    if (map[i][j] == 0) {
                        map[i][j] = count;
                        count++;
                    } else break;
                }

                i = N - k;
                for(j = N - k - 1; j >= 0; j--) {
                    if (map[i][j] == 0) {
                        map[i][j] = count;
                        count++;
                    } else break;
                }

                j = k - 1;
                for(i = N - k - 1; i >=0; i--) {
                    if (map[i][j] == 0) {
                        map[i][j] = count;
                        count++;
                    } else break;
                }
                k++; // for문을 다 돌았다면 k를 1증가시킨다.
            }


            // 출력
            System.out.println("#" + test_case);
            for(int r = 0; r < N; r++) {
                for(int c = 0; c < N; c++) {
                    System.out.print(map[r][c] +" ");
                }
                System.out.println();
            }
        }

    }
}