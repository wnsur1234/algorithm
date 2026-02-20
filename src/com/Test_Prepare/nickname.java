package com.Test_Prepare;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Scanner;

public class nickname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nickname : ");
        String nickname = sc.nextLine();

        System.out.print("But you Don't Enter word, if you want : ");
        String word = sc.nextLine();

        if(nickname.contains(word)) {
            System.out.println("INVALID");
        }else if(!QAKorean(nickname)) {
            System.out.println("INVALID");
        }else{
            System.out.println("VALID");
        }
    }
    private static boolean QAKorean(String word) {
        String n = word.toLowerCase();
        String[] words = n.split(""); // "c","a","s","e","1,"2","3"
        boolean flag = false;
        int[] wordsToNum = new int[words.length];
        // 숫자 변환 후 Int형 배열에 값 삽입
        for (int i=0; i < wordsToNum.length; i++) {
            wordsToNum[i] = Integer.parseInt(words[i]);
        }

        // 변환한 배열의 숫자를 판단 1 : 연속된 숫자 파악
        for(int i=0; i < wordsToNum.length; i+=3) {
            if(0<= wordsToNum[i] && wordsToNum[i] <= 9) {
                if(wordsToNum[i+1]== wordsToNum[i]+1 && wordsToNum[i+2] == wordsToNum[i]+2) {
                    flag = false;
                }else if(wordsToNum[i]-1 == wordsToNum[i+1] && wordsToNum[i]-2 == wordsToNum[i+2]) {
                    flag = false;
                }else{
                    flag = true;
                }
            }
        }
        // 알파벳 a=65 ~ z=90 판단
        for(int i : wordsToNum) {
            if(65<=i && i<=90) {
                flag = true;
            }
        }

        return flag;
    }
}
