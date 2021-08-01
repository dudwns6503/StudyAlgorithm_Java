/*
SW Expert Academy 문제 2025 N줄 덧셈
*/

import java.util.Scanner;

public class P2025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자를 입력받는다.
        int num = sc.nextInt();
        // 합을 저장할 변수 선언
        int sum = 0;
        // 1부터 num까지 반복
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}