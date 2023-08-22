/*
 * BOJ 13118 뉴턴과 사과
 *
 * memory : 14052kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13118 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] person = new int[4];
        for (int i = 0; i < 4; i++) {
            person[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            int apple = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 4; j++) {
                if (apple == person[j]) {
                    System.out.print(j + 1);
                    return;
                }
            }
        }

        System.out.print(0);
    }
}
