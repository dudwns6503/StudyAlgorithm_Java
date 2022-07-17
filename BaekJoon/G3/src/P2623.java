/*
 * BOJ 2623 음악프로그램
 *
 * memory : 14668kb
 * time : 148ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2623 {

    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] singer;
    static int[] inDegree;
    static boolean[] ordered;
    static int N, M;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        inDegree = new int[N+1];
        singer = new ArrayList[N+1];
        // 모든 가수가 정렬되었는지 체크하기 위한 boolean 배열
        ordered = new boolean[N+1];

        for(int i=1; i<=N; i++) {
            singer[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int count = Integer.parseInt(st.nextToken());

            // 먼저올 가수를 미리 선택
            int preSinger = Integer.parseInt(st.nextToken());

            // 먼저올 가수를 이미 선택했으므로 count-1 만큼 반복한다.
            for(int j=0; j<count-1; j++) {
                int nextSinger = Integer.parseInt(st.nextToken());

                singer[preSinger].add(nextSinger);
                inDegree[nextSinger]++;
                // 다음 가수보다 먼저올 가수에 지금 가수를 넣는다.
                preSinger = nextSinger;
            }
        }

    }

    static void pro() {

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            if(inDegree[i] == 0) {
                q.offer(i);
                ordered[i] = true;
            }
        }

        while(!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append("\n");

            for(int y: singer[x]) {
                if(--inDegree[y] == 0) {
                    q.offer(y);
                    ordered[y] = true;
                }
            }
        }

        for(int i=1; i<=N; i++) {
            if(ordered[i] == false) {
                System.out.print(0);
                return;
            }
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}