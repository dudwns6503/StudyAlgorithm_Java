/*
SW Expert Academy 문제 2058 자릿수 더하기
*/

import java.util.Scanner;

public class P2058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 자릿수를 더한 최종값을 담을 변수 sum
        int sum = 0;
        // num이 0이 아니라면 sum에 num을 10으로 나눈 나머지를 넣고
        // num을 10으로 나누어서 맨 뒷자리 수를 제거한다.
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}