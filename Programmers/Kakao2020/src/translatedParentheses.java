import java.util.*;

/**
 * 괄호 변환
 * 2020 KAKAO BLIND RECRUITMENT
 *
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 * 테스트 1 〉	통과 (1.17ms, 76.7MB)
 * 테스트 2 〉	통과 (1.77ms, 69.1MB)
 * 테스트 3 〉	통과 (1.16ms, 76.1MB)
 * 테스트 4 〉	통과 (1.96ms, 75.7MB)
 * 테스트 5 〉	통과 (1.53ms, 77.8MB)
 * 테스트 6 〉	통과 (1.82ms, 75.4MB)
 * 테스트 7 〉	통과 (1.93ms, 74.7MB)
 * 테스트 8 〉	통과 (1.18ms, 78.8MB)
 * 테스트 9 〉	통과 (2.45ms, 74.8MB)
 * 테스트 10 〉	통과 (2.16ms, 77.7MB)
 * 테스트 11 〉	통과 (1.94ms, 78.5MB)
 * 테스트 12 〉	통과 (2.18ms, 75.9MB)
 * 테스트 13 〉	통과 (3.15ms, 78.1MB)
 * 테스트 14 〉	통과 (2.09ms, 77.4MB)
 * 테스트 15 〉	통과 (3.07ms, 82.5MB)
 * 테스트 16 〉	통과 (2.42ms, 77.5MB)
 * 테스트 17 〉	통과 (2.30ms, 79.7MB)
 * 테스트 18 〉	통과 (2.27ms, 70.8MB)
 * 테스트 19 〉	통과 (2.83ms, 76.4MB)
 * 테스트 20 〉	통과 (2.54ms, 74MB)
 * 테스트 21 〉	통과 (3.68ms, 77.3MB)
 * 테스트 22 〉	통과 (2.70ms, 78.6MB)
 * 테스트 23 〉	통과 (3.67ms, 74.7MB)
 * 테스트 24 〉	통과 (1.91ms, 65MB)
 * 테스트 25 〉	통과 (2.61ms, 90.9MB)
 *
 * 문제 요약
 * 1. '('와 ')'의 개수가 같다면 이를 '균형잡힌 괄호 문자열'이라고 부른다.
 * 2. '('와 ')'의 짝도 모두 맞을 경우 '올바른 괄호 문자열'이라고 부른다.
 *
 * 변환 과정
 * 1. 입력이 빈 문자일 경우 빈, 문자열을 반환한다.
 * 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리한다. 단 u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며,
 *    v는 빈 문자열이 될 수 있다.
 * 3. 수행한 결과 문자열을 u에 이어 붙인 후 반환한다.
 *   3-1. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행한다.
 * 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행한다.
 *   4-1. 빈 문자열에 첫 번째 문자로 '('를 붙인다.
 *   4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙인다.
 *   4-3. ')'를 다시 붙인다.
 *   4-4. u의 첫번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙인다.
 *   4-5. 생성된 문자열을 반환한다.
 */

class Solution {

    // 균형잡힌 괄호 문자열의 인덱스를 반환
    public int balancedIndex(String p) {
        // 왼쪽 괄호 기준으로 갯수 카운트
        int cnt = 0;
        for(int i=0; i<p.length(); i++) {
            if(p.charAt(i) == '(') cnt += 1;
            else cnt -=  1;
            // cnt가 0이 되었을 때 인덱스를 반환한다.
            if(cnt == 0) return i;
        }
        // 균형잡힌 괄호가 아닌 경우 -1 반환
        return -1;
    }

    // 올바른 괄호 문자열인지 확인
    public boolean checkProper(String p) {
        // 왼쪽 괄호 기준으로 갯수 카운트
        int cnt = 0;
        for(int i=0; i<p.length(); i++) {
            if(p.charAt(i) == '(') cnt += 1;
            else {
                // 올바른 괄호가 아닌경우 false 반환
                if(cnt == 0) return false;
                else {
                    cnt -= 1;
                }
            }
        }
        // 올바른 괄호일 경우 true 반환
        return true;
    }
    public String solution(String p) {
        String answer = "";
        // 빈 문자일 경우 빈 문자열 반환
        if(p.equals("")) return answer;

        // idx = 균형잡힌 괄호 문자열의 위치
        int idx = balancedIndex(p);

        // 문자열을 idx를 기준으로 u와 v로 분리함.
        String u = p.substring(0, idx+1);
        String v = p.substring(idx+1);

        // u가 올바른 괄호 문자열이면 -> v에 대해 1단계부터 수행
        if(checkProper(u)) {
            answer = u + solution(v);

        }
        // u가 올바른 괄호 문자열이 아니라면.. -> 4번 수행
        else {
            answer = "(";
            answer += solution(v);
            answer += ")";
            u = u.substring(1, u.length()-1); // 첫 번째와 마지막 문자 제거

            String temp = "";
            for(int i=0; i<u.length(); i++) {
                if(u.charAt(i) == '(') temp += ')';
                else temp += '(';
            }
            answer += temp;
        }
        return answer;
    }
}
