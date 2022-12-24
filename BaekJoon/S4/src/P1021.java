/*
 * BOJ 1021 회전하는 큐
 *
 * memory : 14244kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1021 {

    static LinkedList<Integer> deque = new LinkedList<>();
    static int[] pickList;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1 <= M <= N <= 50
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 뽑을 값을 담을 list.
        pickList = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            pickList[i] = num;
        }

        // deque에 값을 채움.
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
    }

    private static void solve() {
        int count = 0;

        for (int i = 0; i < pickList.length; i++) {
            int target = deque.indexOf(pickList[i]);

            if (target == 0) {
                deque.pollFirst();
            }
            else if (target > deque.size() / 2) {
                while (true) {
                    deque.offerFirst(deque.pollLast());
                    count++;

                    if (deque.peekFirst() == pickList[i]) {
                        deque.pollFirst();
                        break;
                    }
                }
            }
            else {
                while (true) {
                    deque.offerLast(deque.pollFirst());
                    count++;

                    if (deque.peekFirst() == pickList[i]) {
                        deque.pollFirst();
                        break;
                    }
                }
            }
        }

        System.out.print(count);
    }
}
