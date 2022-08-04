/*
 * BOJ 21925 짝수 팰린드롬
 *
 * memory : 14728kb
 * time : 152ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21925 {

    static int[] A;
    static int N, ans;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        A = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        int j = 0;

        for(int i=1; i<N;) {
            boolean flag = false;

            for(j=i+1; j<=N; j++) {
                if(isEvenPalindrome(i, j)) {
                    ans += 1;
                    flag = true;
                    break;
                }
            }

            // 부분 수열이 짝수 팰린드롬이 아니라면 반복문을 빠져나옴
            if(!flag) {
                ans = -1;
                break;
            }

            i = j+1;
        }

        System.out.print(ans);
    }

    static boolean isEvenPalindrome(int left, int right) {
        if((right - left) % 2 == 0) return false;

        for(int i=0; i<=(right - left) / 2; i++) {
            if(A[left+i] != A[right-i]) return false;
        }

        return true;
    }

    public static void main(String[] args) throws Exception  {
        input();
        pro();
    }
}
