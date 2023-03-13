/*
 * BOJ 27736 찬반투표
 *
 * memory : 14356kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27736 {

    private static int[] votes;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        votes = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            votes[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        int agree = 0;
        int disagree = 0;
        int giveUp = 0;

        for (int i = 0; i < n; i++) {
            if (votes[i] == 1) agree++;
            else if (votes[i] == -1) disagree++;
            else giveUp++;
        }

        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        if (giveUp >= mid) System.out.print("INVALID");
        else {
            if (agree > disagree) System.out.print("APPROVED");
            else System.out.print("REJECTED");
        }
    }
}
