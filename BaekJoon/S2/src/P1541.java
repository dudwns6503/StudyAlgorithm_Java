

import java.io.*;
import java.util.*;

public class P1541 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");

        int sum = Integer.MAX_VALUE;

        while (subtraction.hasMoreTokens()) {
            int temp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            while (addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
