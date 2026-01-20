package com.proCode.level2;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        /*
        [문제 설명]
        N명의 참가자 -> (1,2) , (3,4) , .... , (N-1, N) 진행
        다음 진출 -> 다시 1부터 N/2의 번호를 받게 됨

        [상황]
        첫 라운드에서 A참가자가 라이벌인 B와 몇번째로 만나는지 궁금
        게임 참가자 수 : N
        참가자 번호 : A
        경쟁자 번호 : B
        매개변수로 주어짐 (단, A,B는 무조건 이김)
        제한 : 2^1 <= N <= 2^20

        [예시]
        입출력 : N = 8, A = 4, B = 7 , 답 : 3
        * */

        // 초기 매개 변수 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("참가자 수를 입력하시오. : ");
        int N = sc.nextInt();
        System.out.println();
        System.out.print("A의 번호를 입력하시오. : ");
        int A = sc.nextInt();
        System.out.println();
        System.out.print("B의 번호를 입력하시오. : ");
        int B = sc.nextInt();


        int answer = solution(N,A,B);
    }

    /*
    [내 생각]
    1열 : 1,2 3,4 5,6 7,8  --- N까지 n과 n+1
    2열 : 1or2, 3or4 | 5or6, 7or8 ---- N/2까지 n과 n+1
    갑자기 든 생각 : 이거 List로 담아야하나?
    리스트의 배열은 동일하고 안의 값은 달라지니까 그 값이랑 비교할때 answer인거지 i의 값으로

    여기서는 이겨야 올라간다는 표현을 했는데 어차피 A와 B의 값은 이걸 사용할때의 수를 확인하면 될꺼같고
    결국 N까지 n과 n+1을 비교하는것에 관해서 공식을 찾아야함
    TODO: 자료구조 다시 복습하기 (최대 2시간)
    * */
    private static int solution(int N, int A, int B) {
        int result = 0;

        int[] list = new int[N];
        list[0] = 0;

        for (int i = 1; i < N+1; i++) {
            list[i+1] = i;


        }



        return result;
    }
}