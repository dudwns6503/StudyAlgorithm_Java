import java.util.Scanner;

public class P2070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            char answer;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 > num2) {
                answer = '>';
            } else if(num1 == num2) {
                answer = '=';
            } else {
                answer = '<';
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}