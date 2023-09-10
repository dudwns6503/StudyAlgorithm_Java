/*
 * BOJ 21866 추첨을 통해 커피를 받자
 *
 * memory : 14232kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21866 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int score =  Integer.parseInt(st.nextToken());

            if ((i == 0 || i == 1) && score > 100) {
                System.out.print("hacker");
                return;
            }

            if ((i == 2 || i == 3) && score > 200) {
                System.out.print("hacker");
                return;
            }

            if ((i == 4 || i == 5) && score > 300) {
                System.out.print("hacker");
                return;
            }

            if ((i == 6 || i == 7) && score > 400) {
                System.out.print("hacker");
                return;
            }

            if (i == 8 && score > 500) {
                System.out.print("hacker");
                return;
            }

            sum += score;
        }

        if (sum < 100) System.out.print("none");
        else System.out.print("draw");
    }
}
