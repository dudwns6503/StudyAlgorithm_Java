/*
BaekJoon 1546 평균
*/

import java.util.*;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[N];
        double[] douArr = new double[N];
        double sum = 0;
        double avg = 0;
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        for(int i=0; i<N; i++) {
            douArr[i] = ((double) arr[i] / max) * 100;
            sum += douArr[i];
        }
        avg = sum / N;
        System.out.println(avg);
    }
}
