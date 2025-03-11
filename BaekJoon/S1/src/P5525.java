/*
 * BOJ 5525 IOI
 *
 * memory : 20108kb
 * time : 236ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5525 {

    private static String s;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }
    
    private static void solve() {
        // n <- O의 갯수
        // 문자열을 돌면서 "IOI"를 만족할 때 O의 갯수를 카운팅할꺼임
        int ans = 0;
        int zeroCount = 0;
        int startIndex = 0;
        while (startIndex < m - 1) {
            if (s.charAt(startIndex) == 'I' && s.charAt(startIndex + 1) == 'O') {
                int nextIndex = startIndex + 2;

                // 2칸씩 이동할 것이기 때문에 이전 인덱스도 확인
                while (nextIndex < m && s.charAt(nextIndex) == 'I' && s.charAt(nextIndex - 1) == 'O') {
                    zeroCount++;

                    if (zeroCount >= n)
                        ans++;

                    nextIndex += 2;
                }

                zeroCount = 0;
                startIndex = nextIndex - 1;
            }
            else {
                startIndex++;
            }
        }

        System.out.print(ans);

    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        s = br.readLine();
    }
}
