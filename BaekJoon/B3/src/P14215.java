/*
 * BOJ 14215 세 막대
 *
 * memory : 14156kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14215 {

    private static int[] num = new int[3];

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        Arrays.sort(num);

        int min = num[0];
        int medium = num[1];
        int max = num[2];

        // 정삼각형이라면 세 변의 길이 바로 출력.
        if (max == min) {
            System.out.print(3 * min);
            return;
        }

        // 가장 긴 변의 길이가 나머지 변의 길이의 합보다 작다면 출력한다.
        // 아니라면 가장 긴 변의 길이를 -1
        while (true) {
            if (min + medium > max) {
                System.out.print(min + medium + max);
                break;
            } else {
                max--;
            }
        }
    }
}
