 /*
  * BOJ 24313 알고리즘 수업 - 점근적 표기 1
  *
  * memory : 14164kb
  * time : 132ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24313 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1 * n0 + a0 <= c * n0 && c >= a1) System.out.print(1);
        else System.out.print(0);
    }
}
