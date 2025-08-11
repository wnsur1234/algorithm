package com.proCode.level2;

import java.util.Arrays;
import java.util.Scanner;

public class LeastMultiple {
    public static void main(String[] args) {
        /*
        * 두 수의 최소공배수(Least Common Multiple)란
        * 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
        * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
        * n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
        * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
        * 제한사항 : 1<= arr <= 15
        *           a<= 100
        * ex) arr : [2,6,8,14] result : 168
        *           [1,2,3] result : 6
        * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(Arrays.toString(arr));
        int result = solution(arr);
        System.out.println(result);
    }

    private static int solution(int[] arr) {
        /*
        생각 1 : 각 수를 반복하면서 n을 무한으로 반복 모든 값이 같아 진다면 멈춤
        ex) 2 -> 1부터 n까지 의 곱 값
            6,8,14 -> 동일           -> 같아지는 값 stop
//        * */
//        while(true){
//            for(int i = 0; i < arr.length; i++){
//
//
//            }
//        }
        return 1;
    }
}
