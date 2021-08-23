/*
BaekJoon 1759 암호 만들기
*/

import java.util.*;
import java.io.*;

public class P1759 {

    static int L, C;
    static char[] alpha, selected;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        L = Integer.parseInt(st.nextToken()); // 암호 자릿수
        C = Integer.parseInt(st.nextToken()); // 사용할 수 있는 문자의 종류 수

        alpha = new char[C];
        selected = new char[L];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<C; i++) {
            alpha[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alpha); // 문자를 오름차순으로 정렬한다.

        combination(0, 0, 0, 0);

        System.out.println(sb);
    }

    // 최소 한 개의 모음과 두 개의 자음으로 구성 
    // v와 c는 각각 모음, 자음
    private static void combination(int start, int cnt, int vowel, int consonant) {
        // 기저조건을 만족한 문자들만 출력
        if(cnt == L) {
            if(vowel >= 1 && consonant >= 2) {
                for (int i=0; i<L; i++) {
                    sb.append(selected[i]);
                }
                sb.append('\n');
            }
            return;
        }

        for (int i=start; i<C; i++) {
            selected[cnt] = alpha[i];

            // 모음이라면 모음을 +1, 자음이라면 자음을 +1 
            if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u')
                combination(i + 1, cnt + 1, vowel + 1, consonant);
            else
                combination(i + 1, cnt + 1, vowel , consonant + 1);
        }
    }
}