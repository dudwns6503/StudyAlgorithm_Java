/*
 * BOJ 15680 연세대학교
 *
 * memory : 13992kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15680 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.print("YONSEI");
        } else {
            System.out.print("Leading the Way to the Future");
        }
    }
}
