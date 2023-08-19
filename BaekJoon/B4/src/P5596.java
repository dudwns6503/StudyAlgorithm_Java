/*
 * BOJ 5596 시험 점수
 *
 * memory : 14172kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5596 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = 0;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            int info = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            int science = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());

            max = Math.max(max, info + math + science + english);
        }

        System.out.print(max);
    }
}
