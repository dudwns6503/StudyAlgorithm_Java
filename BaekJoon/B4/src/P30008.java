/*
 * BOJ 30008 준영이의 등급
 *
 * memory : 14172kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30008 {

    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++) {
            solve(Integer.parseInt(st.nextToken()));
        }

    }

    private static void solve(int rank) {
        int p = rank * 100 / n;

        gradePrint(p);
    }

    private static void gradePrint(int p) {
        if (p > 96) System.out.print("9 ");
        else if (p > 89) System.out.print("8 ");
        else if (p > 77) System.out.print("7 ");
        else if (p > 60) System.out.print("6 ");
        else if (p > 40) System.out.print("5 ");
        else if (p > 23) System.out.print("4 ");
        else if (p > 11) System.out.print("3 ");
        else if (p > 4) System.out.print("2 ");
        else System.out.print("1 ");
    }
}
