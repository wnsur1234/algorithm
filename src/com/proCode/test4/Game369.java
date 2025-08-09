package com.proCode.test4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Game369 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        solution(n);
    }

    private static void solution(int n) {
        int count = 0;
        String[] nArry = Integer.toString(n).split("");
        for (String s : nArry) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
