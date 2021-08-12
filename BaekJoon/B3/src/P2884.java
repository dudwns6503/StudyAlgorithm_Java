/*
BaekJoon 2884 알람 시계
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M - 45 < 0) {
            M += 60;
            M -= 45;
            H -= 1;
            if(H < 0) H = 23;
        } else {
            M -= 45;
        }
        System.out.println(H + " " + M);
    }
}
