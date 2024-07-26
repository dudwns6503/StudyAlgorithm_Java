/*
 * BOJ 2346 풍선 터뜨리기
 *
 * memory : 23164kb
 * time : 208ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346 {

    private static int[] numbers;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        // 1번 제거하고, 1번 풍선 종이 확인
        int count = numbers[deque.pollFirst()];

        // 덱이 빌 때까지
        // 원소들을 뒤로 옮기고 양수라면 pollFirst
        StringBuilder sb = new StringBuilder();
        sb.append("1").append(" ");

        while (!deque.isEmpty()) {
            if (count > 0) {
                for (int i = 1; i <= count; i++) {
                    if (deque.isEmpty())
                        break;

                    int balloon = deque.pollFirst();

                    if (i == count) {
                        count = numbers[balloon];
                        sb.append(balloon).append(" ");
                        break;
                    } else {
                        deque.addLast(balloon);
                    }
                }
            }
            // 음수라면 원소들을 앞으로 옮기고 pollLast
            else {
                for (int i = 1; i <= Math.abs(count); i++) {
                    if (deque.isEmpty())
                        break;

                    int balloon = deque.pollLast();

                    if (i == Math.abs(count)) {
                        count = numbers[balloon];
                        sb.append(balloon).append(" ");
                        break;
                    } else {
                        deque.addFirst(balloon);
                    }
                }
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        numbers = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
}
