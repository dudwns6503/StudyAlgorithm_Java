/*
 SW Expert Academy 문제 2072 홀수만 더하기
 10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라.

 <제약사항>
 각 수는 0이상 10000이하의 정수이다.

 <입력>
 - 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
 - 각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
 <출력>
 - 출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
 (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
 */


import java.util.Scanner;

public class P2072 {
    public static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 숫자를 전역변수 T에 담는다.
        T = sc.nextInt();
        // 홀수 값의 총합을 저장할 변수 선언
        int sum = 0;
        // 테스트 케이스 3번 반복하므로 sum값을 각각 저장할 배열 선언
        int[] sumArray = new int[3];
        // 테스트 케이스만큼 입력을 받음
        for(int test_case=0; test_case<T; test_case++) {
            // 10개의 수만큼 반복
            for (int i = 1; i <= 10; i++) {
                int num = sc.nextInt();
                // 값을 2로 나눴을 때 나머지가 0이 아니다 => 홀수다 => sum에 더해준다.
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            // 배열에 sum 값을 넣어주고 다음 테스트 케이스를 위해 sum을 초기화
            sumArray[test_case] = sum;
            sum = 0;
        }
        for(int t=1; t<=3; t++) {
            System.out.println("#" + t + " " + sumArray[t-1]);
        }
    }

}
