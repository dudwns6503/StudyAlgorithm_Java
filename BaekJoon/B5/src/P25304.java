/**
 * BOJ 25304 영수증
 * <p>
 * memory : 14148kb
 * time : 128ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {

    public static void main(String[] args) throws IOException {
        inputAndSolve();
    }

    private static void inputAndSolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int cost = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            cost += a * b;
        }

        if(cost == X) System.out.print("Yes");
        else System.out.print("No");
    }
}
