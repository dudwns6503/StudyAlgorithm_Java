/*
BaekJoon 2839 설탕 배달
*/

import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        while (true) {
            // 5로 나눠진다면 그것이 최소
            if (N % 5 == 0) {
                count += N / 5;
                break;
            }
            // 나눠지지 않는다면 3을 빼고 count에 +1을 해준다.
            N -= 3;
            count++;
            // 계속 5로 나눠지지않아 3을 빼서 설탕의 그램이 -가 된다면 count에 -1을 해주고 나간다.
            if (N < 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}