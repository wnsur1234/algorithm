package com.proCode.level2;

import java.util.Scanner;
import java.util.Stack;

public class parentheses {
    /*
    * 괄호가 바르게 짝지어 졌다는 것은 '(' 문자로 열렸으면
    * 반드시 짝징서 ')'문자로 닫혀야 한다는 뜻
    * ex) "()()" 또는 "(())()" --> o
    *     ")()(" 또는 "(()(" --> x
    * '(' 또는 ')' 로만 이루어ㄷ진 문자열 s 가 주어졌을 때
    *  s가 올바른 괄호이면 ture 아니면 false
    *
    * [제한사항]
    *  : 문자열의 길이 - 100,000 이하의 자연수
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result1 = solution1(s);
        boolean result2 = solution2(s);

        System.out.println(result1);
        System.out.println(result2);
    }

    // if 문 풀이
    private static boolean solution1(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                num++;
            }
            if(s.charAt(i) == ')') {
                if(num < 0){
                    break;
                }
                num--;
            }
        }
        return num == 0;
    }

    // stack 풀이
    private static boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(0) == ')'){
                return false;
            }else if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
}
