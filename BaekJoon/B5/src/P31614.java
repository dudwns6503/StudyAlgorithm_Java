/*
 * BOJ 31614 分 (Minutes)
 *
 * memory : 14148kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31614 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        System.out.print(h * 60 + m);
    }
}
