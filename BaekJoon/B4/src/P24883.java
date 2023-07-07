/*
 * BOJ 24883 자동완성
 *
 * memory : 14232kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24883 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (br.readLine().equalsIgnoreCase("n")) {
            System.out.print("Naver D2");
        } else {
            System.out.print("Naver Whale");
        }
    }
}
