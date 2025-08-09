package com.proCode.level2;

import java.util.Scanner;

public class MaxAndMin {
    /*
    문자열 s 에는 공백으로 구분된 숫자들이 저장되어있다.
    str 에 나타나는 숫자중 최소값과 최대값을 찾아 이를 (최소값) (최대값) 형태의 문자열을 반환하는 함수를 완성
    ex) 1 2 3 4 라면 1 4 리턴  -1 -2 -3 -4 -> -4 -1
    제한 조건 : s에는 둘 이상의 정수가 공백 구분
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

//    1. str을 split으로 공백으로 나눈 값으로 저장 해야함
//    2. 나눈 배열을 int 형으로 변환한다.
//    3. 배열안에서 최댓값 max 함수? 최소값 min 함수?
    private static void solution(String str) {
        String answer = "";
        String[] list = str.split(" ");
        int[] numArray = new int[list.length] ;
        for (int i = 0; i < list.length; i++) {
            numArray[i] = Integer.parseInt(list[i]);
        }
        int max = numArray[0];
        int min = numArray[0];
        for (int i = 1; i < list.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }
        answer = min+ " " + max;
        System.out.println(answer);
    }
}
