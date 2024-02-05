/*
 * BOJ 31403 A + B - C
 *
 * memory : 14192kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31403 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int ans1 = a + b - c;
        int ans2 = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;

        System.out.println(ans1);
        System.out.print(ans2);
    }
}
