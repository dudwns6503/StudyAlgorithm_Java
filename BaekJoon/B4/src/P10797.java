/*
 * BOJ 10797 10부제
 *
 * memory : 14204kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10797 {

    private static int day, answer;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        day = Integer.parseInt(br.readLine());
        answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            solve(Integer.parseInt(st.nextToken()));
        }

        System.out.print(answer);
    }

    private static void solve(int carNumber) {
        if (day == carNumber) {
            answer++;
        }
    }
}
