/*
 * BOJ 19602 Dog Treats
 *
 * memory : 14136kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P19602 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        if (s + 2 * m + 3 * l < 10)
            System.out.print("sad");
        else
            System.out.print("happy");
    }
}
