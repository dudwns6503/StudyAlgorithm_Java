 /*
  * BOJ 2441 별 찍기 - 4
  *
  * memory : 15736kb
  * time : 296ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2441 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            if (i != n - 1) System.out.println();
        }
    }
}
