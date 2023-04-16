 /*
  * BOJ 2445 별 찍기 - 8
  *
  * memory : 21720kb
  * time : 580ms
  */


 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2445 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int blank = 2 * n;
        for (int i = 1; i <= n; i++) {
            blank -= 2;

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            blank += 2;

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            if (i != 1) {
                System.out.println();
            }
        }
    }
}
