 /*
  * BOJ 2442 별 찍기 - 5
  *
  * memory : 17060kb
  * time : 312ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2442 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            if (i != n - 1) {
                System.out.println();
            }
        }
    }
}
