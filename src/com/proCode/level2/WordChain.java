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
        solution(n, wordArray);
    }

    private static void solution(int n, String[] wordArray) {
        int[] answer = {0, 0};

        Map<Integer, String> people = new HashMap<>();


        // 각 사람마다 말하는 수
        int q = wordArray.length / n;
        String equals = "";

        // 각 사람마다 wordArray 를 대입
        // 참가자 수로 나눈 값이 0이 아니라면 ex) 2,7 -> 첫번째 참가자 한번 더
        if (wordArray.length % n != 0) {
            people.put(0, wordArray[(n * q) + q]);
        }
        // 참가자 수 만큼 반복
        // 참가자 차례 마다 단어의 순번이 단어의 길이/참가자 수 한 만큼 증가된 순번으로 말하기 때문에
        // 반복문을 통해 각 참가자에게 말하는 단어 대입
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                people.put(i, wordArray[q * j]);
            }
        }

        // 이제 각 참가자가 말한 단어는 참가자에게 부여를 했고
        // 1. 중복이 있는지 있다면 어떤 참가자에 몇번째 순번에 말했는지 찾기
        // 2. 이전 참가자의 마지막 단어 이후 같은 단어로 시작했는지 찾기
        //    -> 이거는 chartAt(-1).equals(chartAt(0) 이렇게 비교해서 찾으면 되지 않나?

        // 1번 똑같은 단어가 나왔을 때 말한 참가자 찾기
        for(int i=0; i<wordArray.length; i++){
            for(int j=0; j<wordArray.length; j++){
                if(wordArray[i].equals(wordArray[j])){
                    answer[0] = j;
                    equals = wordArray[j];
                }
            }
        }
        // 해당 참가자가 똑같은 단어 말한 순번 찾기
        for(int i=0; i<n; i++){
            for(int j=1; j<q; j++){
                if(equals.equals(people.get(i))){
                    answer[i] = j*q;
                }
                System.out.println(people.get(i));
            }
        }
        System.out.println(Arrays.toString(answer));

        //TODO
        // 다음 순번에 말한게 같은 단어인지 찾기

    }
}
