/*
 * BOJ 10448 유레카 이론
 *
 * memory : 14864kb
 * time : 160ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10448 {

    private static int[] triangularNumbers = new int[45];

    public static void main(String[] args) throws IOException {
        // 삼각수 생성
        for (int i = 1; i < 45; i++) {
            triangularNumbers[i] = i * (i + 1) / 2;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(isEureka(K));
        }
    }

    // 유레카 이론을 만족하는지 확인하는 함수
    public static int isEureka(int K) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    int sum = triangularNumbers[i] + triangularNumbers[j] + triangularNumbers[k];
                    if (sum == K) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
