/*
 * BOJ 1267 핸드폰 요금
 *
 * memory : 15824kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1267 {

    private static int yeongsik, minsik;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        yeongsik = 0;
        minsik = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int wage = Integer.parseInt(st.nextToken());
            solve(wage);
        }

        print();
    }

    private static void solve(int wage) {
        yeongsik += (wage / 30 + 1) * 10;
        minsik += (wage / 60 + 1) * 15;
    }

    private static void print() {
        if (yeongsik > minsik) {
            System.out.print("M " + minsik);
        } else if (yeongsik == minsik) {
            System.out.print("Y M " + yeongsik);
        } else {
            System.out.print("Y " + yeongsik);
        }
    }
}
