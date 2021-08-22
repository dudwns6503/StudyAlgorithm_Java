/*
SW Expert Academy 문제 1223 [S/W 문제해결 기본] 6일차 - 계산기2
*/

import java.util.*;
import java.io.*;

public class P1223 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int test_case=1; test_case<=10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            String input = br.readLine();
            // 연산자들을 담을 스택
            Stack<Character> stack = new Stack<>();
            // 숫자들을 담아줄 변수
            String postFix = "";

            for(int i=0; i<N; i++) {
                // 연산자가 아니라면
                if(input.charAt(i) != '+' && input.charAt(i) != '*') {
                    // 변수에 추가한다.
                    postFix += input.charAt(i);
                } else {
                    // 곱하기라면 스택에 추가
                    if(input.charAt(i) == '*') {
                        stack.push(input.charAt(i));
                        // 더하기 일 때
                    } else {
                        do {
                            // 스택이 비어있다면 while문 탈출
                            if(stack.isEmpty()) break;
                            // 스택이 비어있지 않다면 가장 위(top)에 있는 숫자를 변수에 추가한 후에 +를 스택에 추가해준다..
                            postFix += stack.pop();
                        } while(!stack.isEmpty() && stack.peek() != '+');
                        stack.push(input.charAt(i));
                    }
                }
            }

            // 스택이 비어있지 않다면 스택에 있는 것을 변수에 추가해줌.
            while(!stack.isEmpty())
                postFix += stack.pop();

            // 식을 다시 담을 스택 선언
            Stack<Integer> op = new Stack<>();
            for(int i=0; i<postFix.length(); i++) {
                // 숫자라면 스택에 추가해준다.
                if(postFix.charAt(i) != '+' && postFix.charAt(i) != '*') {
                    op.push(postFix.charAt(i) - '0');
                } else {
                    // 숫자가 아니라면 스택에 위에있는 두 숫자들을 뽑아서 연산해주고 다시 스택에 넣어준다.
                    int op1 = op.pop();
                    int op2 = op.pop();
                    char operator = postFix.charAt(i);
                    switch(operator) {
                        case '*':
                            int temp1 = op1 * op2;
                            op.push(temp1);
                            break;
                        case '+':
                            int temp2 = op1 + op2;
                            op.push(temp2);
                            break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + op.peek());
        }
    }
}
