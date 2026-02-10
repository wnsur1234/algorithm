package com.proCode.level2.parentheses;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

        int QAResult = QA(split);
    }

    // 올바른 괄호 검증 알고리즘 => 시간복잡도 O(n^2)
    private static int QA(String[] S) {
        int count = 0;
        // frist Step : 주어진 S에 대해서 올바른 괄호 S 케이스인지 구분하기
        // 근데 이 검증이 먼저인가? 라는 의문도 듬
        // 그냥 FIFO 형태로 돌면서 올바른 괄호 케이스가 없으면 0반환하면 되는거 아닌가?
        // 근데 또 차피 그 FIFO로 돌면서 판단하려면 올바른 괄호를 판단하는 알고리즘을 구해야함
        for(int i = 0; i < S.length; i++) {
            for(int j = 0; j < S.length; j++) {
                if(S[i].equals("(") && S[j].equals(")")) {
                    count++;
                }else if(S[i].equals("{") && S[j].equals("}")) {
                    count++;
                }else if(S[i].equals("[") && S[j].equals("]")) {
                    count++;
                }else{
                    return count;
                }
            }
        }
        return count;
    }

    private static int Queue(String[] S) {

        // TODO : Queue에서 쓰는 삽입/삭제 문법 찾아보기 for JAVA
        int result = 0;

        Queue<String> q = new LinkedList<>();
        q.add(S);

        for(int i = 0; i < S.length; i++) {
            q.push(q.shift());
            if(QA(q.element()) != 0){
                result ++;
            }
        }
        return result;
    }
}
