/*
 * BOJ 14489 치킨 두 마리 (...)
 *
 * memory : 14096kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14489 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int price = Integer.parseInt(br.readLine());

        if (a + b >= 2 * price)
            System.out.print(a + b - 2 * price);
        else
            System.out.print(a + b);
    }
}
