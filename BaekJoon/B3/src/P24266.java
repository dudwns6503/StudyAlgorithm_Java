 /*
  * BOJ 24266 알고리즘 수업 - 알고리즘의 수행 시간 5
  *
  * memory : 14216kb
  * time : 128ms
  */


 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24266 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(n * n * n);
        System.out.print(3);
    }
}
