/*
SW Expert Academy 문제 2050 알파벳을 숫자로 변환
 */
import java.util.Scanner;

public class P2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        for(int i=0; i< alpha.length(); i++) {
            int num = alpha.charAt(i) - 'A' + 1;
            System.out.print(num +" ");
        }
    }
}