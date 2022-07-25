/*
 * BOJ 10872 팩토리얼
 *
 * memory : 17592kb
 * time : 208ms
 */

import java.util.Scanner;

public class P10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(factorial(N));
    }

    static int factorial(int number) {

        if(number== 0 || number == 1) return 1;
        else return factorial(number-1) * number;
    }
}
