/*
 * BOJ 29163 Счастье Мистера Бина
 *
 * memory : 14420kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29163 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int oddCnt = 0;
        int evenCnt = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) % 2 == 0) evenCnt++;
            else oddCnt++;
        }

        if (evenCnt > oddCnt)
            System.out.print("Happy");
        else
            System.out.print("Sad");
    }
}
