/*
 * BOJ 32306 Basketball Score
 *
 * memory : 14088kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32306 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int teamOnePointOne = Integer.parseInt(st.nextToken());
        int teamOnePointTwo = Integer.parseInt(st.nextToken());
        int teamOnePointThree = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int teamTwoPointOne = Integer.parseInt(st.nextToken());
        int teamTwoPointTwo = Integer.parseInt(st.nextToken());
        int teamTwoPointThree = Integer.parseInt(st.nextToken());

        int teamOnePoint = teamOnePointOne + teamOnePointTwo * 2 + teamOnePointThree * 3;
        int teamTwoPoint = teamTwoPointOne + teamTwoPointTwo * 2 + teamTwoPointThree * 3;

        if (teamOnePoint > teamTwoPoint)
            System.out.print("1");
        else if (teamOnePoint < teamTwoPoint)
            System.out.print("2");
        else
            System.out.print("0");
    }
}
