/*
 * BOJ 1427 소트인사이드
 *
 * memory : 14256kb
 * time : 136ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1427 {
    static StringBuilder sb = new StringBuilder();

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();

        count = new int[10];
    }

    // 계수 정렬을 위하여 숫자의 개수를 저장할 배열
    static int[] count;
    static String str;

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }

    static void pro() {
        for(int i=0; i<str.length(); i++) {
            // 숫자 문자 하나를 정수로 변환하고 카운트 배열에 넣음.
            int index  = str.charAt(i) - '0';
            count[index]++;
        }

        // 내림차순이므로 높은 숫자부터 출력
        for(int i=9; i>=0; i--) {
            while(count[i] != 0) {
                sb.append(i);
                count[i]--;
            }
        }

        System.out.println(sb.toString());
    }
}
