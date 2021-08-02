/*
SW Expert Academy 문제 2019 더블더블
 */
import java.util.Scanner;

public class P2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 1;
        System.out.print(sum + " ");
        for(int i=1; i<=num; i++) {
            sum *= 2;
            System.out.print(sum + " ");
        }
    }
}