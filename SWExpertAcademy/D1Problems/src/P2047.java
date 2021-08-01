/*
SW Expert Academy 문제 2047 신문 헤드라인
*/

import java.util.Locale;
import java.util.Scanner;

public class P2047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String headline = sc.nextLine();
        // 한 번에 대문자로 변경하고 출력
        System.out.println(headline.toUpperCase());
    }
}
