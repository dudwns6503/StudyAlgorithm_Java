 /*
  * BOJ 2903 중앙 이동 알고리즘
  *
  * memory : 14252kb
  * time : 124ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2903 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        solve(n);
    }

    /*
        과정을 거칠 때마다 한 변을 기준으로 점과 점을 잇는 선분의 개수가 2배가 됨. 이를 `height` 변수로 표현.
        height 변수는 점과 점을 잇는 선분의 개수이므로 +1을 해야 점의 개수. 이를 제곱해서 출력.
     */
    private static void solve(int n) {

        int height = 1;

        for (int i = 0; i < n; i++) {
            height *= 2;
        }

        height += 1;
        System.out.print(height * height);
    }
}
