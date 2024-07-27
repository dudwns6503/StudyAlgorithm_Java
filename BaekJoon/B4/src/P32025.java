/*
 * BOJ 32025 체육은 수학과목 입니다
 *
 * memory : 14128kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32025 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());

        System.out.print(Math.min(h, w) * 100 / 2);
    }
}
