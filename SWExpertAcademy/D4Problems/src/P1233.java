/*
SW Expert Academy 문제 1233 [S/W 문제해결 기본] 9일차 - 사칙연산 유효성 검사

 계산이 불가능한 경우 -> 1. 단말노드가 연산자일 경우
                     2. 부모노드가 숫자인 경우
  이 두가지 경우라고 생각하였다. 입력을 보았을 때 노드(st.nextToken().charAt(0)) 뒤에 숫자가 있다면 자식노드가 있는 것이다. 즉, 부모노드이다.
  부모 노드에 숫자가 들어온다면 옳지 않다고 생각했고, 자식노드 자리에 연산자가 들어온다면 옳지 않다고 생각했다.

  무시한점 : 자식노드를 받는 숫자에 올바르지 않은 숫자가 들어왔을 때.. 이 테스트 케이스는 통과했지만 옳은 풀이는 아닌 것 같다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1233 {

    static int T = 10;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int test_case=1; test_case<=T; test_case++) {
            int N  = Integer.parseInt(br.readLine());
            int answer = -1; // 오류를 판별하기 위한 -1 설정
            char currentNode; // 현재 노드
            boolean isTrue = true;   // 초기값은 true -> 계산이 가능하다고 설정

            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken(); // 처음 숫자는 무시하기 위해 써줌.
                currentNode = st.nextToken().charAt(0); // 현재노드를 currentNode에 대입한다.
                if(st.hasMoreTokens()) { // 다음 토큰이 존재한다 -> 자식 노드가 있다. --> 현재 노드가 부모노드이다.
                    if('0' <= currentNode && currentNode <= '9') isTrue = false;  // 부모노드가 숫자를 가진다면 false
                }
                else {  // 다음 토큰이 없다. -> 현재 노드가 단말 노드이다. -> 숫자를 가져야 한다.
                    if(currentNode == '*' || currentNode == '/' || currentNode == '+' || currentNode == '-') isTrue = false;  // 현재 노드가 연산자를 가진다면 false; (단말노드이므로)
                }
            }
            if (isTrue) answer = 1; // isTrue가 true면 계산 가능
            else answer = 0; // isTrue가 false면 계산 불가능

            System.out.println("#" + test_case + " " + answer);
        }
    }
}