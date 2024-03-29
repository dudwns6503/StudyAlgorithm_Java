/*
 * BOJ 16928 뱀과 사다리 게임
 *
 * memory : 59372kb
 * time : 240ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P16928 {

    static final int MAX = Integer.MAX_VALUE;
    static ArrayList<Integer>[] arr = new ArrayList[101];
    static Set<Integer> snakeOrLadderPresentNumbers = new HashSet<>();
    static int[] visited;
    static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 최소값을 찾기 위해서 최댓값으로 초기 세팅함.
        visited = new int[101];
        Arrays.fill(visited, MAX);

        /**
         *  각 번호마다 갈 수 있는 번호를 ArrayList 배열에 담아둠.
         *  ex) 1번은 2~7번까지 갈 수 있고, 3번은 4 ~ 9번까지 갈 수 있다.
         *  100을 넘을 경우 담지 않음.
         */
        for (int i = 1; i <= 100; i++) {
            arr[i] = new ArrayList<>();

            for (int j = 1; j <= 6; j++) {
                if (i + j > 100) continue;

                arr[i].add(i + j);
            }
        }

        // 중복이므로 메서드로 따로 추출
        for (int i = 0; i < n; i++) {
            fromToSetting(br);
        }
        for (int i = 0; i < m; i++) {
            fromToSetting(br);
        }
    }

    private static void fromToSetting(BufferedReader br) throws IOException {
        /**
         * 뱀 or 사다리가 있는 번호라면, 이전에 ArrayList에 등록한 번호들을 먼저 다 지우고,
         * 뱀 or 사다리가 이어진 번호만 입력한다.
         * Set 자료구조에 from(뱀 or 사다리가 있는 번호) 추가
         *
         * 왜 Set 자료구조를 썼나요?
         * 물론 ArrayList를 써도 된다.
         * 문제 조건상 뱀 or 사다리가 동시에 존재하는 경우가 없고(중복되는 경우 X),
         * HashSet의 contains()가 ArrayList contains()보다 성능이 좋기 때문에 사용하였다.
         */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        snakeOrLadderPresentNumbers.add(from);
        arr[from].clear();
        arr[from].add(to);
    }

    private static void solve() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            // x 번호에서 갈 수 있는 y를 탐색한다.
            for (int y : arr[x]) {
                /**
                 * 만약 y를 갔는데, 이전에 다른 번호에서 y로 가는 주사위의 횟수(visited[y]) 보다
                 * 현재 번호(x)에서 y로 가는 주사위의 횟수(visited[x] + 1)가 더 클 경우 탐색하지 않는다.
                 *
                 * why ? 이전의 경우가 더 최솟값이다.
                 */
                if (visited[y] < visited[x] + 1) continue;

                /**
                 * if: 현재 번호(x)가 사다리 or 뱀이 있는 칸이라면 주사위의 횟수를 카운트하지않고 이동한다.
                 * else: 현재 번호(x)가 평범한 칸이라면 다음 칸으로 이동할 때 주사위의 횟수를 +1하고 이동한다.
                 * 그리고 Queue에 넣는다.
                 */
                if (snakeOrLadderPresentNumbers.contains(x)) {
                    visited[y] = Math.min(visited[y], visited[x]);
                    queue.offer(y);
                }
                else {
                    visited[y] = visited[x] + 1;
                    queue.offer(y);
                }
            }
        }

        System.out.print(visited[100]);
    }
}
