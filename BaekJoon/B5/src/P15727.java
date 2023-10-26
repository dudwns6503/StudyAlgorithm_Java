/*
 * BOJ 15727 조별과제를 하려는데 조장이 사라졌다
 *
 * memory : 14168kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15727 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        int ans = 0;
        if (l % 5 != 0) ans++;
        ans += l / 5;

        System.out.print(ans);
    }
}
