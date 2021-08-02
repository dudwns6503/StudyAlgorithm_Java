/*
SW Expert Academy 문제 1545 거꾸로 출력해 보아요
*/

import java.util.Scanner;

public class P1545 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=num1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}