package com.proCode.level1;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        /*
        정수를 담고있는 배열 arr의 평균값을 return 하는 함수, solution을 완성해보아라
        arr은 길이 1 이상 100이하인 배열
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        String num = sc.nextLine();
        solution(num);
    }

    private static void solution(String num) {
        String[] arr = num.split(",");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        double answer = 0;
        for (int j : a) {
            answer += j;
        }

        answer = answer / a.length;
        System.out.println(answer);
    }
}
