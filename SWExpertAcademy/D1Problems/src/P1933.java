/*
SW Expert Academy 문제 1933 간단한 N의 약수
*/

import java.util.Scanner;

public class P1933 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}