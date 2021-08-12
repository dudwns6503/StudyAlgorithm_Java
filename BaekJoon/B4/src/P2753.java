/*
BaekJoon 2753 윤년
*/
import java.util.Scanner;
public class P2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int isYoonYear = 0;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isYoonYear = 1;
        }

        System.out.println(isYoonYear);
    }
}