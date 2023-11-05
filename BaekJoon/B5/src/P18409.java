/*
 * BOJ 18409 母音を数える (Counting Vowels)
 *
 * memory : 14088kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P18409 {

    private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    ans++;
                    break;
                }
            }
        }

        System.out.print(ans);
    }
}
