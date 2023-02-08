/*
 * BOJ 1244 스위치 켜고 끄기
 *
 * memory : 14132kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1244 {

    private static boolean[] bulbs;
    private static int n, theNumberOfStudents;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        bulbs = new boolean[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int bulb = Integer.parseInt(st.nextToken());

            if (bulb == 1) bulbs[i] = true;
            else bulbs[i] = false;
        }

        theNumberOfStudents = Integer.parseInt(br.readLine());

        for (int i = 0; i < theNumberOfStudents; i++) {
            st = new StringTokenizer(br.readLine());

            int sex = Integer.parseInt(st.nextToken());
            int bulbNumber = Integer.parseInt(st.nextToken());

            solve(sex, bulbNumber);
        }

        answer_print();
    }

    private static void solve(int sex, int bulbNumber) {
        /**
         * sex -> 1: 남자, 2: 여자
         * bulbNumber -> 학생이 받은 수
         *
         * 전구의 상태 변화를 쉽게 바꾸기 위해서 전구는 boolean 배열로 선언함.(!를 통해 쉽게 값 변경)
         *
         * 남자라면 현재 전구 번호(i)가 학생이 받은 수(bulbNumber)의 배수라면 전구의 상태를 바꿔준다.
         * 여자라면 현재 전구 번호(i)의 상태를 우선 바꿔주고 그 근처의 전구(대칭)의 상태를 확인하고 조건이 일치하면
         * 바꿔준다.
         *
         * 여기서 근처의 전구라는 뜻은 처음 주어진 수에서 양 옆으로 +i의 위치에 있는 전구와 -i에 위치에 있는 전구가
         * 대칭상태여야 하는데 예를 들어 학생이 받은 수 bulbNumber를 기준으로,
         *
         * bulbNumber + 1 == bulbNumber - 1
         * bulbNumber + 2 == bulbNumber - 2
         * 이어야 한다는 뜻이다.
         *
         * 이를 While문으로 반복하는데, 반복이 전구의 범위를 넘어가지 않도록 범위 내에서만 반복한다.
         * 그리고 + 1과 + 2 등등 1씩 증가하는 숫자는 변수(idx)로 따로 지정하여 대칭되는 자리가 상태가 일치해서
         * 반복이 성공되었다면 값을 +1 해주었다.
         *
         * 나는 한 번 잘 못 제출하였는데, 출력 형식을 잘 안 보고 문제를 풀었다.
         * 문제에서는 한 줄 당 20개씩 출력하라고 되어있었는데, 나는 한 줄에 출력하였었다.
         *
         * 따라서 출력 형식을 잘 보고 문제를 풀 것.
         */.
        if (sex == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % bulbNumber == 0) {
                    bulbs[i] = !bulbs[i];
                }
            }
        } else {
            bulbs[bulbNumber] = !bulbs[bulbNumber];

            int idx = 1;
            while (bulbNumber - idx >= 1 && bulbNumber + idx <= n) {

                if (bulbs[bulbNumber - idx] == bulbs[bulbNumber + idx]) {
                    bulbs[bulbNumber - idx] = !bulbs[bulbNumber - idx];
                    bulbs[bulbNumber + idx] = !bulbs[bulbNumber + idx];
                    idx++;
                } else {
                    break;
                }
            }
        }
    }

    private static void answer_print() {
        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

}
