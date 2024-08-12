/*
 * BOJ 10799 쇠막대기
 *
 * memory : 16440kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P10799 {

    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char previousCharacter = ' ';
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty())
                    stack.push(c);
                else {
                    if (stack.peekLast() == '(') {
                        if (previousCharacter == '(') {
                            stack.pop();
                            ans += stack.size();
                        } else {
                            stack.pop();
                            ans++;
                        }
                    }
                    else
                        stack.push(c); // 필요 없는 부분같긴 함.
                }
            }

            previousCharacter = c;
        }

        System.out.print(ans);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
    }
}
