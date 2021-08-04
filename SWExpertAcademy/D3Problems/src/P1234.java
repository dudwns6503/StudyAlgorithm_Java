/*
SW Expert Academy 문제 1234 [S/W 문제해결 기본] 10일차 - 비밀번호
*/

import java.util.ArrayList;
import java.util.Scanner;

public class P1234 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt();
            ArrayList<String>List = new ArrayList<>();

            String a = sc.next();

            for(int i=0; i < N; i++)
                List.add(a.substring(i, i+1));

            int count = 0;
            // 처음부터 값이 같으면 삭제하고 다시 처음부터 탐색
            while (count != List.size() - 1) {
                if(List.get(count).equals(List.get(count+1))) {
                    List.remove(count);
                    List.remove(count);
                    count = 0;
                } else {
                    count++;
                }
            }

            System.out.printf("#%d ", test_case);
            for(String c : List) System.out.print(c);
            System.out.println();
        }

    }
}