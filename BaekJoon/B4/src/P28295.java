/*
 * BOJ 28295 체육은 코딩과목입니다
 *
 * memory : 14148kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28295 {

    private static final String[] dir = {"N", "E", "S", "W"};

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cur = 0;

        for (int i = 0; i < 10; i++) {
            int order = Integer.parseInt(br.readLine());
            cur = (cur + order) % 4;
        }

        System.out.print(dir[cur]);
    }
}
