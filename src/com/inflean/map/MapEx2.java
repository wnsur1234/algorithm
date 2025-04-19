package com.inflean.map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {

    public static void main(String[] args) {
        // 영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전 만들기
        // 먼저 영어 단어와 한글 단어를 사전에 저장하는 단계를 거친다
        // 이후에 단어를 검색한다.
        /*
        실행 결과
        영어 단어를 입력하세요 (종료는 'q') : apple
        한글 뜻을 입력하세요 : 사과
        영단어 입력 : q

       찾을 영어 단어를 입력하세요 (종료는 q) : apple
       apple의 뜻 : 사과
        * */
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dict = new HashMap<>();
        while (true){
            System.out.println("==단어 입력 단계==");
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String word = sc.nextLine();
            if(word.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String kWord = sc.nextLine();
            dict.put(word,kWord);
        }
        while (true){
            System.out.println("== 단어 검색 단계==");
            System.out.print("찾을 영어 단어를 입력하세요(종료는 'q') : ");
            String search = sc.nextLine();
            if(search.equals("q")){
                break;
            }
            System.out.println(search+"의 뜻 : "+dict.get(search));
        }
    }
}
