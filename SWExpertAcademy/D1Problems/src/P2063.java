/*
SW Expert Academy 문제 2063 중간값 찾기
*/

import java.util.Arrays;
import java.util.Scanner;

public class P2063 {

    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int mid = (N / 2);
        int[] numArr = new int[N];

        for(int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println(numArr[mid]);
    }
}