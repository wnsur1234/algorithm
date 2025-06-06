package com.proCode.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Carpet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int y = sc.nextInt();

        int[] result = solution(b,y);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int b, int y) {
        int[] answer = new int[2];
        for(int i = 1; i < y; i++){
            if(y%i == 0 && y/i > i){
                if(b == ((y/i+2)+i)*2){
                    answer[0] = y/i+2;
                    answer[1] = i+2;
                }
            }
        }
        return answer;
    }
}
