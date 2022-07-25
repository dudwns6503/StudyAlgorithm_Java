/*
 * BOJ 11653 소인수분해
 *
 * memory : 17748kb
 * time : 216ms
 */

import java.util.Scanner;

public class P11653 {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static void input() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }

    static void pro() {

        for(int i=2; i<=Math.sqrt(N); i++) {
            while(N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        if(N != 1) {
            sb.append(N).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) {

        input();
        pro();
    }
}
