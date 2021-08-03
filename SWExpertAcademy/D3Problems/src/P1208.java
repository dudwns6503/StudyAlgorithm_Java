/*
SW Expert Academy 문제 1208 [S/W 문제해결 기본] 1일차 - Flatten
*/

import java.util.Arrays;
import java.util.Scanner;

public class P1208 {
    static int N = 100; // 가로 길이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int test_case = 1; test_case <= 10; test_case++) {
            int dump = sc.nextInt();
            int[] boxHeight = new int[N]; // 박스 높이를 저장할 배열
            int answer = 0; // 최대 높이 - 최소 높이가 정답

            for(int i=0; i<N; i++) { // 박스의 높이를 입력함
                boxHeight[i] = sc.nextInt();
            }
            Arrays.sort(boxHeight); // 배열 정렬 실행
            for(int i=0; i<dump; i++) { // dump 횟수만큼 반복
                if((boxHeight[N-1] - boxHeight[0]) <= 1) { // 평탄화가 이미 이루어졌다면 break
                    break;
                }
                boxHeight[N-1] -= 1; // 가장 큰 높이는 배열의 맨 마지막이며 평탄화를 실행했으므로 -1
                boxHeight[0] += 1; // 가장 낮은 높이는 배열의 맨 첫번째 요소이고 평탄화를 실행했으므로 +1
                Arrays.sort(boxHeight); // 정렬을 실행
            }
            answer = boxHeight[N-1] - boxHeight[0]; // 가장 높은 박스에서 - 가장 낮은 박스

            System.out.println("#"+ test_case + " " + answer);
        }
    }
}