package com.proCode.level1;

import java.util.Scanner;

public class SumOfDivisors {
    // 약수의 합
    // 정수 n을 입력 받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution 을 완성해주세요.
    // n 은 0이상 3000이하인 정수입니다.
    // ex) n =12 출력 28 --> 12이의 약수는 1,2,3,4,5,12 이를 모두 더하면 28
    public static void main(String[] args) {
        Soultion1();
        // 이 문제는 약수를 구하는 문제 즉, 약수에 대해 개념을 숙지하고 있어야함 but 난 잘모름
        // 이에 따라 예시를 통해 알고리즘 발견
        // 12 -> 1,2,3,4,6,12
        // 5 -> 1,5
        // 1과 자기 자신으로 나누어지는 뭐 그거였던거 같은데
        // 일단 약수 나누어 지는 값들 인거 같은데 나머지가 0인거? 로 생각하면 될꺼같은데
        // 오케이 그럼 1부터n 까지 나눴을 때 나머지가 0인 값 저장 하는데 중복 허용 가능? 차피 필요없음
    }
    private static int Soultion1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {  // --> n/2로 인해 시간복잡도 O(n/2)로 빨라짐
            if(n % i == 0){
                answer += i;
            }
        }
        System.out.println(answer);
        return answer;
    }
    // 풀이로는 for문에서 n만큼 돌필요가없고 n/2로 해도된다고함
    // 약수의 정의 : 어떤 정수를 나누어 떨어지게 만드는 정수를 뜻함. 즉, 어떤 수를 나누었을 때 나머지가 0이 되는 수
    /*✅ 약수의 특징
1. 모든 자연수는 1과 자기 자신을 약수로 가진다.
        예: 7의 약수 → 1, 7 (소수의 경우)
2. 어떤 수의 약수 개수는 짝을 이루는 경우가 많다.
        예: 24의 약수 (1, 2, 3, 4, 6, 8, 12, 24) → (1,24), (2,12), (3,8), (4,6)
3. 완전수(perfect number)
        : 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
        예: 6 (1+2+3 = 6), 28 (1+2+4+7+14 = 28)
*/
}
