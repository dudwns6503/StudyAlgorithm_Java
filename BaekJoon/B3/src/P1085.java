/*
 * BOJ 1085 직사각형에서 탈출
 *
 * memory : 14176kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        /**
         *  x좌표 기준으로 0까지의 거리와 w까지의 거리 중 최솟값을 구해준다.
         *  물론 x의 최대 크기가 w-1이므로 절댓값을 취할 필요 없이 w까지의 거리는 w - x이다.
         *
         *  y좌표도 마찬가지로 구해준다.
         *
         *  이 둘 중 더 작은 값이 경계선까지 가는 거리의 최솟값이므로 출력한다.
         */
        int minX = Math.min(x - 0, w - x);
        int minY = Math.min(y - 0, h - y);

        System.out.print(Math.min(minX, minY));
    }
}
