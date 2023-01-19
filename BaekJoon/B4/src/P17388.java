/*
 * BOJ 17388 와글와글 숭고한
 *
 * memory : 14196kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17388 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();;
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int soongsil = Integer.parseInt(st.nextToken());
        int korea = Integer.parseInt(st.nextToken());
        int hanyang = Integer.parseInt(st.nextToken());

        int answer = 0;

        if (soongsil + korea + hanyang >= 100) System.out.print("OK");
        else {
            answer = Math.min(soongsil, korea);
            answer = Math.min(answer, hanyang);

            if (answer == soongsil) System.out.print("Soongsil");
            else if (answer == korea) System.out.print("Korea");
            else System.out.print("Hanyang");
        }
    }
}
