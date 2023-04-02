/*
 * BOJ 10101 삼각형 외우기
 *
 * memory : 14204kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10101 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] triangle = new int[3];

        triangle[0] = Integer.parseInt(br.readLine());
        triangle[1] = Integer.parseInt(br.readLine());
        triangle[2] = Integer.parseInt(br.readLine());

        Arrays.sort(triangle);

        if (triangle[0] + triangle[1] + triangle[2] == 180) {
            if (triangle[0] == 60 && triangle[2] == 60) {
                System.out.print("Equilateral");
            } else if (triangle[0] == triangle[1] || triangle[1] == triangle[2]) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
}
