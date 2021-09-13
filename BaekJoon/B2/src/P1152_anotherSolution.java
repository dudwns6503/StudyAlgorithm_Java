/*
BaekJoon 1152 단어의 개수

br.readLine().trim() : 문자열의 양 옆 공백을 제거해준다.
str.split(args): args를 기준으로 문자열을 나눠준다.
*/

import java.io.*;

public class P1152_anotherSolution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // trim으로 문자열 양 옆 공백 제거
        String str = br.readLine().trim();

        // 문자열이 비어있는 공백이라면 0을 출력
        if(str.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.print(str.split(" ").length);
        }

    }
}
