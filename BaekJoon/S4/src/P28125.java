/*
 * BOJ 28125 2023 아주머학교 프로그래딩 정시머힌
 *
 * memory : 14320kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P28125 {

    private static Map<String, String> map;
    private static final String GIVE_UP = "I don't understand";

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        init();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                String word = String.valueOf(str.charAt(j));

                // 현재 단어가 \ 라면 sb변수에 "\" 추가 후 다음 단어로 넘어감.
                if (word.equals("\\")) {
                    sb.append("\\");
                    continue;
                }

                // 현재 단어가 ' 라면 sb에 마지막과 마지막에서 두 번째 단어를 확인 하여 v or w로 바꿀 것인지를 판단하고,
                // 이전에 sb에 저장했던 \ or \\ 를 삭제하고 v or w 로 변환하고 count를 1 증가시킨다.
                // 아니라면 sb에 ' 추가하고 넘어감..
                if (word.equals("'")) {
                    if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\\') {
                        if (sb.length() > 1 && sb.charAt(sb.length() - 2) == '\\') {
                            sb.deleteCharAt(sb.length() - 1);
                            sb.deleteCharAt(sb.length() - 1);
                            sb.append("w");
                            count++;
                        } else {
                            sb.deleteCharAt(sb.length() - 1);
                            sb.append("v");
                            count++;
                        }
                    } else {
                        sb.append("'");
                    }

                    continue;
                }

                // 현재 단어가 변환된 단어라면 count 증가시키고 sb에 이전 단어 저장.
                // 변환된 단어가 아니라면 원본 단어 저장.
                if (map.containsKey(word)) {
                    count++;
                    sb.append(map.get(word));
                } else {
                    sb.append(word);
                }
            }

            // 알파벳의 절반이 바뀌었다면 포기를 출력
            if (count >= sb.length() / 2.0) {
                sb = new StringBuilder();
                sb.append(GIVE_UP);
            }

            System.out.println(sb);
        }
    }

    private static void init() {
        // v와 w를 제외하고 map에 넣는다.
        map = new HashMap<>();

        map.put("@", "a");
        map.put("[", "c");
        map.put("!", "i");
        map.put(";", "j");
        map.put("^", "n");
        map.put("0", "o");
        map.put("7", "t");
    }
}
