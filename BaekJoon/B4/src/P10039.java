 /*
  * BOJ 10039 평균 점수
  *
  * memory : 14004kb
  * time : 124ms
  */


 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10039 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());

            if (score >= 40) sum += score;
            else sum += 40;
        }

        System.out.print(sum / 5);
    }
}
