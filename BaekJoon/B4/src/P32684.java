/*
 * BOJ 32684 장기
 *
 * memory : 14204kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32684 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int chuckScore = 72;
        double eunKyuScore = 73.5;

        int[] scores = {13, 7, 5, 3, 3, 2};
        for (int i = 0; i < 6; i++) {
            int count = Integer.parseInt(st.nextToken());
            if (i == 5) {
                chuckScore -= (5 - count) * scores[i];
            }
            else {
                chuckScore -= (2 - count) * scores[i];
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            int count = Integer.parseInt(st.nextToken());
            if (i == 5) {
                eunKyuScore -= (5 - count) * scores[i];
            }
            else {
                eunKyuScore -= (2 - count) * scores[i];
            }
        }

        if (chuckScore > eunKyuScore)
            System.out.print("cocjr0208");
        else
            System.out.print("ekwoo");

    }
}
