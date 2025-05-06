package com.proCode.level1;

import java.util.Arrays;
import java.util.Scanner;

public class NumBackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수 N을 입력하시오. : ");
        long n = sc.nextLong();
        solution(n);
    }
    private static void solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            answer[i] = str.charAt(i) - '0';
        }
        for(int i = 0; i <str.length(); i++) {
            result[i] = answer[str.length() - i-1];
            //0 = 5-0-1 = 4
            //1 = 5-1-1 =3
            //2 = 5 -2-1 = 2
            //3 = 5-3-1 =1
            //4 =5-4-1 = 0
        }
        System.out.println(Arrays.toString(result));
    }
}
