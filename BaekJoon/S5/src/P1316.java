/*
 * BOJ 1316 그룹 단어 체커
 *
 * memory : 14392kb
 * time : 136ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1316 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];

        for(int i=0; i<N; i++) {
            str[i] = br.readLine();
        }

        // 현재까지 나온 alphabet을 저장하는 배열
        ArrayList<String> list;

        // 그룹 단어의 개수를 저장
        int cnt = 0;

        // 직전에 나온 알파벳을 저장
        String prev = "";

        for(int i=0; i<str.length; i++) {
            // 이 단어가 그룹단어인지 아닌지 체크
            boolean check = true;
            // 각 단어마다 list를 초기화
            list = new ArrayList<String>();

            for(int j=0; j<str[i].length(); j++) {
                // 알파벳 하나(char형)를 문자열로 변환
                String alpha = Character.toString(str[i].charAt(j));

                // list에 알파벳이 존재하지 않는 경우 -> 이전에 한 번도 나온적이 없는 알파벳 ex) abc, acd, bde ...
                // list에 저장하고 prev에 저장함.
                if(!list.contains(alpha)) {
                    list.add(alpha);
                    prev = alpha;
                }

                // 이전에 나온적이 있지만 직전에 나온 알파벳인 경우 -> 그룹단어임. ex) aa , aacc ...
                else if(list.contains(alpha) && prev.equals(alpha)) {
                    list.add(alpha);
                    prev = alpha;
                }

                // list에 존재하지만 직전에 나온 알파벳이 아닌 경우 -> 그룹 단어가 아님. ex) aca, abba ...
                // check를 false로 변환하고 반복문을 빠져나옴.
                else if(list.contains(alpha) && !prev.equals(alpha)) {
                    check = false;
                    break;
                }
            }

            // check가 true이면 그룹단어이므로 cnt를 1증가
            if(check) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
