 /*
  * BOJ 24267 알고리즘 수업 - 알고리즘의 수행 시간 6
  *
  * memory : 14152kb
  * time : 128ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24267 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.print(3);
    }
}
