/*
 * BOJ 10431 줄세우기
 *
 * memory : 16932kb
 * time : 184ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10431 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] students;
    private static int p;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        p = Integer.parseInt(br.readLine());

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int cnt = 0;

            students = new int[20];
            for (int j = 0; j < 20; j++) {
                students[j] = Integer.parseInt(st.nextToken());

                int index = j;
                while (true) {
                    if (index == 0 || students[index] > students[index - 1]) break;

                    if (students[index] < students[index - 1]) {
                        int temp = students[index - 1];
                        students[index - 1] = students[index];
                        students[index] = temp;
                        cnt++;
                    }

                    index--;
                }
            }

            sb.append(t).append(" ").append(cnt).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

}
