/*
 * BOJ 20233 Bicycle
 *
 * memory : 16072kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20233 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int sumA = a;
        int sumB = b;

        if (t - 30 > 0)
            sumA += (t - 30) * x * 21;

        if (t - 45 > 0)
            sumB += (t - 45) * y * 21;

        System.out.print(sumA + " " + sumB);
    }
}
