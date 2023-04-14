 /*
  * BOJ 2443 별 찍기 - 6
  *
  * memory : 19904kb
  * time : 320ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2443 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            if (i != 1) System.out.println();
        }
    }
}
