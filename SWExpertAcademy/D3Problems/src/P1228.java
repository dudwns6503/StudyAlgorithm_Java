/*
SW Expert Academy 문제 1228 [S/W 문제해결 기본] 8일차 - 암호문1
*/

import java.util.LinkedList;
import java.util.Scanner;

public class P1228 {

    static int T = 10;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();  // 암호 길이
            LinkedList<Integer> List = new LinkedList<>(); // 삽입 삭제가 용이한 링크드리스트 사용

            for(int i=0; i<N; i++) {
                List.add(sc.nextInt());
            }

            int count = sc.nextInt(); // 명령어 개수

            for(int i=0; i<count; i++) {
                String command = sc.next();
                int firstStart = sc.nextInt();   // 앞에서 들어갈 위치
                int number = sc.nextInt();    // 들어갈 숫자 개수
                for(int j=0; j<number; j++) {   // 들어갈 숫자 개수만큼 반복
                    List.add(firstStart, sc.nextInt()); // firstStart부터 입력받음
                    firstStart += 1;
                }
            }

            System.out.println("#" + test_case + " ");
            for(int i=0; i<10; i++) {    // 처음 10개만 출력함.
                System.out.print(List.poll() + " ");
            }
            System.out.println();
        }

    }
}
