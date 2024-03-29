/*
 * BOJ 23795 사장님 도박은 재미로 하셔야 합니다
 *
 * memory : 14496kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P23795 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input == -1)
                break;

            ans += input;
        }

        System.out.print(ans);
    }
}
