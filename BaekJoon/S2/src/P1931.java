/*
 * BOJ 1931 회의실 배정
 */

import java.util.*;

public class P1931 {

    /*
     * N : 회의의 수
     * meetingTime : 미팅 시작시간과 종료시간을 저장하는 2차원 정수형 배열
     * prev_end_time : 이전 종료시간
     * ans : 최대 사용할 수 있는 회의 수
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] meetingTime = new int[N][2];

        for(int i=0; i<N; i++) {
            meetingTime[i][0] = sc.nextInt();
            meetingTime[i][1] = sc.nextInt();
        }

        // 종료시간을 기준으로 오름차순으로 정렬한다.
        Arrays.sort(meetingTime, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int ans = 0;
        int prev_end_time = 0;

        /*
         * 이전 종료시간이 현재 회의의 시작시간보다 작다면
         * 이전 종료시간에 현재 미팅의 종료시간을 넣고 ans를 +1
         */
        for(int i=0; i<N; i++) {
            if(prev_end_time <= meetingTime[i][0]) {
                prev_end_time = meetingTime[i][1];
                ans++;
            }
        }

        System.out.print(ans);
    }
}