package com.proCode.level1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumbering {
    // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어라.
    // ex) N = 123 이면  1+2+3 =6을 return
    // 제한 사항 N의 범위 100,000,000 이하의 자연수 -> long 범위?(확인필요)
    // 문제 접근 : 흠.. 각각의 자리 수를 나눈다면 자료구조로 생각?
    // 123 -> String 변환 -> ArrayList로 인덱스 지정 -> Integer로 변경 -> 각각 인덱스값 get()해서 더하기
    // 라고 생각했지만 바로 적으면서 생각난 풀이
    // 123을 각 자리 수를 구한다? 10으로 나눈 나머지를 구하면 됨!!!! 마지막에만 몫으로 더하고
    // 이때 ArrayList를 사용해 값을저장하고 반환하여 계산하면 공간 복잡도 O(log N)이 됨
    // 따라서 list 사용 x -> O(1)
    public static void main(String[] args) {
        sumOfNumbering();
    }

    private static int sumOfNumbering() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        do{
            answer += n%10;
            n /= 10;
        }
        while(n>0);
        return answer;
    }
}
