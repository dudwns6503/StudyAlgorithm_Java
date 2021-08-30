/*
BaekJoon 2798 블랙잭
*/

import java.util.Scanner;

public class P2798 {

    static int N, M, sum, max;
    static int[] numbers_com, num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        max = Integer.MIN_VALUE;
        numbers_com = new int[3];
        num = new int[N];
        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }

        combination(0, 0);
        System.out.println(max);
    }

    private static void combination(int cnt, int start) {
        if(cnt == 3) {
            sum = 0;
            for(int i=0; i<3; i++) {
                sum += numbers_com[i];
            }

            if(sum <= M) {
                max = Math.max(sum, max);
            }
            return;
        }

        for(int i=start; i<N; i++) {
            numbers_com[cnt] = num[i];
            combination(cnt+1, i+1);
        }
    }
}
