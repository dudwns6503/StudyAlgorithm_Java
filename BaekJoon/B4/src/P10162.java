/*
 * BOJ 10162 전자레인지
 *
 * memory : 18388kb
 * time : 248ms
 */

import java.util.Scanner;

public class P10162 {

    static int T;

    static void input() {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
    }

    static void sol() {
        int[] time = {300, 60, 10};
        int[] count = new int[3];
        int A = 0;
        int B = 0;
        int C = 0;

        if(T % 10 != 0) {
            System.out.println(-1);
            return;
        }

        for(int i=0; i<time.length; i++) {
            count[i] += T / time[i];
            T = T % time[i];
        }

        for(int i=0; i<count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }

    public static void main(String[] args) {
        input();
        sol();
    }
}
