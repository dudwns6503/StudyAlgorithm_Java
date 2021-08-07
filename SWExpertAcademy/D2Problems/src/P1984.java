/*
SW Expert Academy 문제 1974 중간 평균값 구하기
*/

import java.util.Scanner;

public class P1984 {

    static int T;
    static int N = 10;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++) {
            arr = new int[N];
            int answer= 0;
            double avg = 0;                      // 평균을 반올림하기 위한 double형 변수 선언
            int sum = 0;                         // 배열의 총합을 더할 변수
            int maxIndex = 0;                    // 가장 높은 값을 가진 배열의 인덱스를 저장할 변수
            int minIndex = 0;                    // 가장 낮은 값을 가진 배열의 인덱스를 저장할 변수
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] < min) {               // 배열의 값이 가장 낮다면 값을 저장하고 인덱스도 저장한다.
                    min = arr[i];
                    minIndex = i;
                }
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            // 가장 낮은 값과 가장 높은 값을 0으로 바군다.
            arr[maxIndex] = 0;
            arr[minIndex] = 0;

            for(int i=0; i<N; i++) {
                sum += arr[i];
            }

            // 최댓값과 최솟값을 제외하고 나눠야 하므로 N - 2로 나눈다.
            avg = (double) sum / (N - 2);

            // 반올림
            answer = (int) Math.round(avg);

            System.out.println("#" + test_case + " " + answer);
        }
    }
}

