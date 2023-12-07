/*
 * BOJ 6749 Next in line
 *
 * memory : 14096kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6749 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        System.out.print(m + (m - y));
    }
}
