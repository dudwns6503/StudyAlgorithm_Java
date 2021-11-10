/*
 * BOJ 7562 나이트의 이동
 *
 * memory : 69304kb
 * time : 412ms
 */

import java.util.*;

/**
 *  전형적인 bfs문제. -> 오랜만에 감잡기용..
 *
 *  Node : 나이트의 x좌표 y좌표와 이동한 횟수를 담은 class
 *  dx : 나이트의 x좌표(수학에선 y좌표) 움직임을 나타냄.
 *  dy : 나이트의 y좌표(수학에선 x좌표) 움직임을 나타냄.
 *  N : 체스판의 한 변의 길이
 *  s1, s2 : 나이트가 현재 있는 칸의 x좌표, y좌표
 *  e1, e2 : 나이트가 이동하려고 하는 칸의 x좌표, y좌표
 */
public class P7562 {

    static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    // 나이트의 움직임
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, -2, -1, 1, 2};
    static int N, e1, e2, answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++) {
            N = sc.nextInt();

            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            e1 = sc.nextInt();
            e2 = sc.nextInt();

            bfs(new Node(s1, s2, 0));
            System.out.println(answer);
        }
    }

    private static void bfs(Node node) {
        boolean[][] visited = new boolean[N][N];
        Queue<Node> q = new LinkedList<>();

        q.offer(node);
        visited[node.x][node.y] = true;
        while(!q.isEmpty()){
            Node node2 = q.poll();

            // 기저조건 : 현재 나이트의 위치가 목적지라면 이동횟수를 answer에 넣어주고 종료한다.
            if(node2.x == e1 && node2.y == e2) {
                answer = node2.count;
                break;
            }

            for(int i=0; i<8; i++) {
                int nx = node2.x + dx[i];
                int ny = node2.y + dy[i];
                int count = node2.count + 1;

                // 범위를 벗어나면 다음탐색으로 넘어간다.
                if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                // 이미 방문한적이 있다면 다음탐색으로 넘어간다.
                if(visited[nx][ny]) continue;

                if(!visited[nx][ny]) {
                    q.offer(new Node(nx, ny, count));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
