/*
BaekJoon 4344 평균은 넘겠지
*/

import java.util.*;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for(int test_case=1; test_case<=C; test_case++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            double sum = 0;
            double avg = 0;
            double studentSum = 0;
            double studentAvg = 0;

            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            avg = sum / N;

            for(int i=0; i<N; i++) {
                if(arr[i] > avg) {
                    studentSum += 1;
                }
            }
            studentAvg = studentSum / N * 100;
            System.out.printf("%.3f%%\n", studentAvg);
        }
    }
}
