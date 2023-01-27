/*
 * BOJ 1193 분수찾기
 *
 * memory : 16096kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1193 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        // 1번째칸은 분자 분모 총합이 2
        // 2~3번째 칸은 총합이 3
        // 4~6번째 칸은 총합이 4

        int cross_count = 1;
        int prev_count_sum = 0;

        while (true) {
            if (x <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {

                    System.out.print(
                            (cross_count - (x - prev_count_sum - 1))
                                    + "/"
                                    + (x - prev_count_sum)
                    );
                    break;
                } else {
                    System.out.print(
                            (x - prev_count_sum)
                                    + "/"
                                    + (cross_count - (x - prev_count_sum - 1))
                    );
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
