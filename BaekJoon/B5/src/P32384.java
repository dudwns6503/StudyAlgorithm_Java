/*
 * BOJ 32384 사랑은 고려대입니다
 *
 * memory : 14028kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32384 {
    
    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.print("LoveisKoreaUniversity ");
        }
    }
}
