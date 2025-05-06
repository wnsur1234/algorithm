package com.proCode;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
// 막내 철수 아메리카노 카페라테 각각 차가운것 뜨거운것 4500,5000원
    /* 그중 아무거나 는 5000원
    *
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("[","")
                .replace("]","")
                .replace("\"","")
                .trim();
        String[] order = str.split(",");
        solution(order);

    }

    private static void solution(String[] order) {
        int count = 0;
        for (String s : order) {
            if (s.contains("americano")||s.equals("anything")) {
                count += 4500;
            }
            if(s.contains("cafelatte")) {
                count += 5000;
            }
        }
        System.out.println(count);
    }
}
