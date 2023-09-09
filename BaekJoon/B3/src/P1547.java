/*
 * BOJ 1547 공
 *
 * memory : 14236kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1547 {

    private static int[] cups;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        cups = new int[3];
        cups[0] = 1;

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == b) continue;

            changeBall(a - 1, b - 1);
        }

        print();
    }

    private static void changeBall(int a, int b) {
        int temp = cups[a];
        cups[a] = cups[b];
        cups[b] = temp;
    }

    private static void print() {
        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == 1) System.out.print(i + 1);
        }
    }
}
