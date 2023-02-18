/*
 * BOJ 11000 강의실 배정
 *
 * memory : 67588kb
 * time : 704ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P11000 {

    private static PriorityQueue<Integer> pq;
    private static Lecture[] lectures;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        lectures = new Lecture[n];
        pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            lectures[i] = new Lecture(s, t);
        }

        Arrays.sort(lectures);
    }

    /**
     * 우선순위 큐에 종료시간을 담는 것이 핵심인 문제이다.
     *
     * 우선순위 큐에 있는 강의의 종료시간(T)을 보면서 현재 강의의 시작시간(S)과 비교를 한다.
     *
     * 1. 우선순위 큐에 있는 강의의 종료시간보다 현재 강의의 시작시간이 크다면(T <= S)
     * 강의실을 늘리지 않고 현재 강의를 이전 강의의 뒤에 배치할 수 있다.
     *
     * 2. 우선순위 큐에 있는 강의의 종료시간보다 현재 강의의 시작시간이 작다면(T > S)
     * 강의실을 늘려야 한다.
     *
     * 마지막으로 우선순위 큐의 사이즈를 출력한다.
     */
    private static void solve() {
        pq.offer(lectures[0].end);

        for (int i = 1; i < n; i++) {
            if (lectures[i].start >= pq.peek()) pq.poll();

            pq.offer(lectures[i].end);
        }

        System.out.print(pq.size());
    }

    static class Lecture implements Comparable<Lecture> {
        int start, end;

        public Lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Lecture other) {
            if (this.start == other.start) {
                return this.end - other.end;
            }
            return this.start - other.start;
        }
    }
}
