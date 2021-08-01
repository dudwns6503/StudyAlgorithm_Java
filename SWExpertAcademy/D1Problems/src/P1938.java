/*
SW Expert Academy 문제 1938 아주 간단한 계산기
*/

import java.util.Scanner;

public class P1938 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 사칙 연산 결과를 담을 정수형 배열 선언
        int[] Calc = new int[4];
        // 사칙 연산 수행하고 배열에 담아준다.
        Calc[0] = a + b;
        Calc[1] = a - b;
        Calc[2] = a * b;
        Calc[3] = a / b;

        // 사칙 연산 결과를 출력함.
        for (int j : Calc) {
            System.out.println(j);
        }
    }
}
