package com.proCode.level2;

import java.util.*;

public class WordChain {
    public static void main(String[] args) {
        /*
        문제 설명
        1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.

        1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
        마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
        앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
        이전에 등장했던 단어는 사용할 수 없습니다.
        한 글자인 단어는 인정되지 않습니다.
        다음은 3명이 끝말잇기를 하는 상황을 나타냅니다.

        tank → kick → know → wheel → land → dream → mother → robot → tank

        위 끝말잇기는 다음과 같이 진행됩니다.

        1번 사람이 자신의 첫 번째 차례에 tank를 말합니다.
        2번 사람이 자신의 첫 번째 차례에 kick을 말합니다.
        3번 사람이 자신의 첫 번째 차례에 know를 말합니다.
        1번 사람이 자신의 두 번째 차례에 wheel을 말합니다.
        (계속 진행)
        끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.

        사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 가장 먼저 탈락하는 사람의 번호와
        그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
        * */
        /*
        생각 모으기
        일단 어떤 방식으로 접근을 해야할까?
        어쨌든 1명에 여러개의 값을 저장해야하는데
        LinkedHashMap으로? 접근? -> 각 참가자 순번에 말해야하는 단어의 인덱스 값들을 참가자에게 추가를하는데 값이 중복이면 해당 인덱스 번호 출력
        초기값 = 0 0+n n+n
        * */
        // 일단 사람수와 words 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("참가자 수 : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("말한 단어 : ");
        String words = sc.nextLine();
        String[] wordArray = words.split(",");
        wordChain(n,wordArray);
    }

    private static void wordChain(int n, String[] wordArray) {
        // 이건 자료구조 문제인건가?
        // 알고리즘에서 뭐 트리 이런문제인건가?
        // 일단 내가 찾은 규칙은
        // ex) n=3 일 때 wordArray.length = 9 이면 -> 각 참가자 9/3 만큼 증가
        // 1번 사람 -> wordArray의 0번째, 0+n (0+3), 3+3
        // 2번 사람 -> wordArray의 1번째, 1+3 , 1+3+3
        // 3번 사람 -> wordArray의 2번째 , 2+3 , 2+3+3
        // 이런식으로 반복이 됨 만얀  wordArray.lenght/n != 0 나머지 만큼 첫번째 부터 하나씩 더 하면 됨
        // 이렇게 각각의 사람들에게 말한 단어 인덱스를 부여하면
        // 끝말잇기 법칙 적용하고 만약 같은 단어나 끝과 시작이 다른 단어라면 그 말한 인덱스와 몇번째 사람이 말했는지 사람의 인덱스도 확인하면 됨
        // 으로 생각 해봄
        // 그랬을때 갑자기 드는 생각 wordArray를 애초에 set이나 Map 아니면 뭐 List건 해서 set으로 해서 contain 하면 O(1) + O(n) 이겠다
        // 해당 wordArray에 중복이 있는지를 먼저 확인 -> 해당 인덱스 몇인지 그걸 기반으로 아까 규칙에 해당하는 걸로 몇번째 사람인지 구하기
        // 그리고 set에 더하면서 chartAt을 활용한 끝과 첫 단어도 비교하면 됨! 와 이렇게 쓰면서 하고 자료구조 예시 문제 풀면서 하니까
        // 갑자기 보이네?!! 바로 풀어보자
        int[] answer = new int[2];
        Set<String> set = new LinkedHashSet<>();
//        int bomb = 0;
//        int num = wordArray.length/n; // 각 사람마다 말한 차례 증가되는 수
//        for(int i=0; i<wordArray.length; i++) {
//            if(set.isEmpty()|| !set.contains(wordArray[i])) {
//                set.add(wordArray[i]);
//            }
//            if(set.contains(wordArray[i])) {
//                bomb = i;
//            }else if(i>0){
//                if(wordArray[i-1].charAt(wordArray[i-1].length() - 1) != wordArray[i].charAt(0) ) {
//                    bomb = i;
//                }
//            }else {
//                System.out.println(answer[0]);
//                break;
//            }
//        }
//        n = bomb%num; //말한 번째 / 증가수 -> 몇번째 사람이 말했는지
//        answer[0] = n+1; // 이렇게 하면 몇번째 사람이 말했는지는 됨
//        answer[1] = (bomb/num)+1; // 이게  실제 말한 번째 수 인데 이게 결국 해당 번째 수 사람이 말한거의 차례가 되어야하는데
//      위 풀이의 문제점 말하는참가자를 굳이 지정하지 않아도됨 어차피 규칙어긋나는 인덱스만 찾으면 답을 찾을 수 있기 때문

        for(int i = 0; i< wordArray.length; i++){
            String curr = wordArray[i];

            if(!set.add(curr)){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            } if(i>0){
                String prev = wordArray[i-1];
                char prevLast = prev.charAt(prev.length()-1);
                char currFirst = curr.charAt(0);
                if(prevLast != currFirst){
                    answer[0] = (i%n)+1;
                    answer[1] = (i/n)+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
