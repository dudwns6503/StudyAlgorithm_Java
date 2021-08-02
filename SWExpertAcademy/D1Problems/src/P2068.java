/*
SW Expert Academy 문제 2068 최대수 구하기
 */
import java.util.Arrays;
import java.util.Scanner;

public class P2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int[] numArr = new int[10];
            for(int i=0; i<10; i++) {
                numArr[i] = sc.nextInt();
            }
            Arrays.sort(numArr);
            System.out.println("#" + test_case + " " + numArr[9]);
        }
    }
}