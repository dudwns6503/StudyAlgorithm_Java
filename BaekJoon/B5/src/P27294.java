/*
 * BOJ 27294 몇개고?
 *
 * memory : 14152kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27294 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        if (s == 1) {
            System.out.print("280");
        } else {
            if (t >= 12 && t <= 16) {
                System.out.print("320");
            } else {
                System.out.print("280");
            }
        }
    }
}
