/*
 SW Expert Academy 문제 2071 평균값 구하기
 10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.
 (소수점 첫째 자리에서 반올림한 정수를 출력한다.)

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

public class P2071 {
    public static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 숫자를 전역변수 T에 담는다.
        T = sc.nextInt();
        // 10개의 수 총합을 저장할 변수 선언
        int sum = 0;
        // 평균을 저장할 실수형 변수 선언
        double avg = 0;
        // 테스트 케이스 3번 반복하므로 avg 값을 각각 저장할 배열 선언
        double[] avgArray = new double[3];
        // 테스트 케이스만큼 입력을 받음
        for(int test_case=1; test_case<=T; test_case++) {
            // 10개의 수만큼 반복하며 sum에 입력된 값을 넣어줌
            for (int i = 1; i <= 10; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            // 총합에서 10을 나눈 값을 avg에 넣어줌(실수형으로)
            avg = sum / 10.0;
            // 배열에 sum 값을 넣어주고 다음 테스트 케이스를 위해 sum을 초기화
            avgArray[test_case-1] = avg;
            sum = 0;
        }
        // 반올림을 위해 Math.round를 사용
        for(int t=1; t<=3; t++) {
            System.out.println("#" + t + " " + Math.round(avgArray[t-1]));
        }
    }

}

