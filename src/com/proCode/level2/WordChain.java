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
        String[] peopleWord = new String[n];

        /*
        그렇다면 단어를 비교하는데 있어서 우선 순위를 정하고 시작하면 좋을듯
        비교 해야하는것 : 이전 사용 유무, 끝과 시작이 같은 알파벳인지
        1. 끝과 시작 비교
        2. 이전에 사용 단어 인지
        * */

        for (int i = 0; i < wordArray.length; i++) {
            Set<String> used = new HashSet<>();
            used.add(wordArray[i]);

            peopleWord[0] = wordArray[i];
            peopleWord[1] = wordArray[i+1];
        }
    }
}
