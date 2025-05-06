package com.proCode.level1;

import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        /*
        정수 num 이 짝수 일 경우 "Even"을 반환 하고 홀수인 경우
        "Odd"를 반환 하는 함수, solution을 완성 해라
        [제한 조건]
        num 은 int 범위의 정수 입니다.
        0은 짝수 입니다.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Odd";
        }else answer="Even";
    }
}
