/*
SW Expert Academy 문제 2043 서랍의 비밀번호
*/

import java.util.Scanner;

public class P2043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자를 공백을 기준으로 2개 입력받는다.
        int p = sc.nextInt();
        int k = sc.nextInt();

        // 총 확인하는 횟수는 P와 K를 포함하므로 P - K + 1이어야함.
        System.out.println(p - k + 1);
    }
}