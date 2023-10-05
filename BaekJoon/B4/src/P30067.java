/*
 * BOJ 30067 Paslėpta suma
 *
 * memory : 14104kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30067 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.print(sum / 2);
    }
}
