/*
 * BOJ 31822 재수강
 *
 * memory : 14112kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31822 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String subject = br.readLine();

        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            String possibleSubject = br.readLine();

            if (possibleSubject.startsWith(subject.substring(0, 5)))
                ans++;
        }

        System.out.print(ans);
    }
}
