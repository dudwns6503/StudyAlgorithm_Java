/*
BaekJoon 1110 더하기 사이클
*/
import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = N;
        int count = 0;

        if(N==0) System.out.print(1);
        else {
            do {
               a = c / 10;
               b = c % 10;
               c = b * 10 + (a + b) % 10;
               count++;
            }while(c != N);
            System.out.print(count);
        }
    }
}
