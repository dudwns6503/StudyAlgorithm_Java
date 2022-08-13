/*
 * BOJ 1789 수들의 합
 *
 * memory : 17672kb
 * time : 212ms
 */

import java.util.Scanner;

public class P1789 {

    static long S, sum;

    static void input() {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLong();
    }

    static void sol() {
        for(int i=1; i<=S; i++) {
            sum += i;
            if(S == 1) {
                System.out.println(1);
                break;
            }
            else if(sum > S) {
                System.out.println(i-1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        input();
        sol();
    }
}
