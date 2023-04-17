 /*
  * BOJ 2446 별 찍기 - 9
  *
  * memory : 20576kb
  * time : 480ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2446 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int blank = -1;

        for (int i = n; i > 0; i--) {
            ++blank;

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            --blank;

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            if (i != n - 1) System.out.println();
        }
    }
}
