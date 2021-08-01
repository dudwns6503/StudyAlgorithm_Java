/*
SW Expert Academy 문제 2029 몫과 나머지 출력하기
*/

import java.util.Scanner;

public class P2029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        // 몫의 값을 저장하 배열
        int[] num1Array = new int[T];
        // 나머지의 값을 저장할 배열
        int[] num2Array = new int[T];
        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num1 = a / b;
            int num2 = a % b;
            // 나눈 값과 나머지를 배열의 인덱스(여기선 test_Case가 1부터 시작이므로 1을 빼줘야함)0부터 넣어줌.
            num1Array[test_case-1] = num1;
            num2Array[test_case-1] = num2;
        }
        for(int t = 1; t <=T; t++) {
            System.out.println("#" + t + " " + num1Array[t-1] + " " + num2Array[t-1]);
        }
    }
}