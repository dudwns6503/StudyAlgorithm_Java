/*
 * BOJ 2309 일곱 난쟁이
 *
 * memory : 14164kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {

    private static StringBuilder sb = new StringBuilder();
    private static int sum;
    private static int[] dwarfs;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dwarfs = new int[9];

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }
    }

    private static void solve() {
        /**
         *  일곱 난쟁이의 합은 100이다. 우선 모든 난쟁이의 합을 sum에 저장한다음
         *  일곱 난쟁이가 아닌 난쟁이를 찾으면 된다.
         *  i와 j로 이중 for문을 돌면서 sum - dwarfs[i] - dwarfs[j]가 100이 된다면
         *  i와 j 인덱스 난쟁이가 가짜 난쟁이인 것이다.
         */
        StringBuilder sb = new StringBuilder();
        Arrays.sort(dwarfs);

        boolean isFind = false;
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - dwarfs[i] - dwarfs[j] == 100) {
                    x1 = i;
                    x2 = j;
                    isFind = true;
                    break;
                }
            }

            if (isFind) break;
        }

        for (int i = 0; i < 9; i++) {
            if (i == x1 || i == x2) continue;
            sb.append(dwarfs[i]).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
