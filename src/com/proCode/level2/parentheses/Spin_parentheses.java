package com.proCode.level2.parentheses;

import java.util.*;

public class Spin_parentheses {
    /*
     * 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
     * (), [], {} 는 모두 올바른 괄호 문자열입니다.
     * 입력 괄호 S 가 주어졌을 때 괄호를 왼쪽으로 움직여 한바퀴를 돌았을 때
     * 올바른 괄호가 되는 경우의 수 X를 구하시오.
     *
     * [내 생각]
     * 결국 이거 FIFO 문제임 -> FIFO는 Quene이고
     * 주어진 S의 괄호 자체가 잘못된 괄호 일 경우 0 반환
     *
     * 그럼 첫번째 단계 : S의 괄호 판단 -> switch를 쓸지 elseif를 쓸지 or 더 좋은 방법이 있는지
     * 두번 째 : S배열의 길이 만큼 반복 돌면서 올바른 괄호 count
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // 입력된 s문자열 -> 배열로 변환
        String[] split = s.split("");

        int result = QA(split);
        System.out.println(result);

    }

    // 올바른 괄호 검증 알고리즘 => 시간복잡도 O(n^2)
    private static int QA(String[] S) {
        int count = 0;

        for(int i = 0; i < S.length; i++) {
            Stack<String> stack = new Stack<>();
            boolean ok = true;
            for(String st : S){
                if(st.equals("(") || st.equals("{") || st.equals("[")){
                    stack.push(st);
                }else if(stack.isEmpty()){
                    ok = false;
                    break;
                }
                else if(st.equals(")") && stack.peek().equals("(")){ //가장 최근에 쌓인 것
                    stack.pop();
                }else if(st.equals("}") && stack.peek().equals("{")){
                    stack.pop();
                }else if(st.equals("]") && stack.peek().equals("[")){
                    stack.pop();
                }else{
                    System.out.println("Error");
                }
            }
            if(ok && stack.isEmpty()){
                count++;
            }

            shift(S);
        }
        return count;
    }
    private static void shift(String[] S) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(S));
        String A = queue.poll();
        queue.offer(A);
        for(int i = 0; i < S.length; i++) {
            S[i] = queue.poll();
        }
    }

}
