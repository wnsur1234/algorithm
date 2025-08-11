package com.proCode.level2;

import java.util.*;

public class WordChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter people: ");
        int n = sc.nextInt(); // 참가자 수
        sc.nextLine();
        String words = sc.nextLine();
        String[] wordArray = words.split(",");
        /*
        이 문제는 chartAt 이라는 방법이 있었음..!!
        나는 단어를 배열로 나누고 그 단어의 인덱스 별로 또 나누려 했음
        but, charAt으로 String 에 대해서 바로 접근이 가능했다..!!!!!!!!!!!!!!
         */
        solution(n,wordArray);
    }

    private static void solution(int n, String[] wordArray) {
        int[] answer = {0,0};

        // 사람 수 가 될꺼임
        int q = wordArray.length/n;
        int r = 0;
        for (int i=0; i<wordArray.length; i++) {
            if(wordArray[i].equals(wordArray[i+1])){
                // 같아진 인덱스
                r = i;
            }else{
                answer[0] = 0;
                answer[1] = 0;
            }
        }
        // TODO
        // answer[0]의 값을 구해야함
        for(int i= 0; i <q;)
            answer[1] = i;

    }
}
