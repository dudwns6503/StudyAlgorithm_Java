/*
 * BOJ 26057 Большой удой
 *
 * memory : 14184kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26057 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        System.out.print(2 * t - l);
    }
}
