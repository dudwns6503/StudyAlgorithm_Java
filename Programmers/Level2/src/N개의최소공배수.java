/**
 * 유킬리드 호제법이 기억이 잘 안나서 하드코딩으로 풀었다.. 유클리드 호제를 다시 공부해야겠다.
 *
 * 유클리드 호제로 최대공약수 구하기
 * int GCD(int a, int b){
 *      int tmp;
 *      while(b){      //b가 0이 될 때까지
 *          tmp = a % b;
 *          a = b;
 *          b = tmp;
 *      }
 *      return a;
 * }
 *
 * 최소 공배수는 LCM = a * b / GCD(a, b) 이다.
 */

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        int temp = 2;
        loop: while(answer==0) {

            for(int i=0; i<arr.length; i++) {
                if(temp % arr[i] == 0) continue;
                else {
                    temp++;
                    continue loop;
                }
            }
            answer = temp;
        }
        return answer;
    }
}
