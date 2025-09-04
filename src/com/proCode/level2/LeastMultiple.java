package com.proCode.level2;

import java.util.*;

public class LeastMultiple {
    public static void main(String[] args) {
        /*
         * 두 수의 최소공배수(Least Common Multiple)란
         * 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
         * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
         * n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
         * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
         * 제한사항 : 1<= arr <= 15
         *           a<= 100
         * ex) arr : [2,6,8,14] result : 168
         *           [1,2,3] result : 6
         * */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int result = solution(arr);
        System.out.println(result);
    }

    private static int solution(int[] arr) {
////        갑자기 해법 떠오름 결국 각 수를 2로 나눠서 홀수가 있다면 그 홀수 포함 곱해지는 수로 분리하면 됨
////        ex) 2 = 2*1, 6 = 2*3, 8 = 2^3 14 = 2*7 2로나눠지지 않을 떄까지 몫을 추가
////        그렇게 해서 각 수 중 공통된 값은 최대로 곱해지는 수 + 다른 값 을해 보면
////        2^3 * 3 * 7  = 168 이 됨
////        이걸 어떤 자료구조에 담냐 문제 인데
////        1. arr의 각 배열의 값을 순환한다.
////        2. 각 배열의 수마다 2로 나누어 2로 나누어떨어지지 않을 때 나머지까지 구한다.
////        3. 각 배열의 2로 나눈 수 중 공통되는 값이 있다면 가장 많이 사용한 배열의 값을 선택한다.
////        4. 그 외 나머지 값은 그냥 곱한다.
////        * */
//        // 근데 지금 또 생각해보면 만약 배열에 주어진 수가 8, 16 이런식으로 된다면 지금 밑에 식은
//        // 2^3을 num에 곱하고 또 2^4를 곱하게 됨
//        // 그래서 주어진 배열에 for 문을 통해 각 배열/다음 배열 = 0 이라면 배열에서 빼도 될듯
//        // 그래서 list를 만들어서 나눈값이 0이 되는건 빼자
//        // 일단 오름 차순 정렬
//        List<Integer> list = new ArrayList<>(); // 중복 ex) 8,16 이되는 수 제거
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        Collections.sort(list);
//        // 결국 이중 포문을 써야하나?
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(j) % list.get(i) == 0) {
//                    list.remove(i);
//                }
//            }
//        }
//        System.out.println(list);
//        int num = 1; // 각 배열의 나눈 최소공배수를 담기 위함
//        for (int i = 0; i < list.size(); i++) {
//            while (true) {
//                if (list.get(i) / 2 == 0 || list.get(i) / 2 == 1) {
//                    break;
//                } else if ((list.get(i) / 2) % 2 != 0) {
//                    // 나눈 몫이 0이 아니라면 = 홀수라면
//                    // ex ) 14/2 = 7 -> 홀수
//                    num = num * (list.get(i) / 2);
//                } else if ((list.get(i) / 2) % 2 == 0) {
//                    // 기본 2로 나눈어 진다면 ex) 8 -> 8%2 = 0 2 한번 곱하기
//                    num *= 2;
//                }
//            }
//        }
        /*
        걍 풀이 망했고 결국 해법 찾아봤는데 최소 공배수 공식 알아야함
        로 GCD(최대공약수)로 LCM을 누적하는 방법이에요. 수학 공식을 쓰지만 구현은 훨씬 간단합니다:

𝐿
𝐶
𝑀
(
𝑎
,
𝑏
)
=
𝑎
×
𝑏
𝐺
𝐶
𝐷
(
𝑎
,
𝑏
)
LCM(a,b)=
GCD(a,b)
a×b
	​


배열이면 앞에서부터 차례로 LCM을 누적하면 끝입니다. 코드로 보면 훨씬 직관적이에요 👇

private static int solution(int[] arr) {
    int lcm = arr[0];
    for (int i = 1; i < arr.length; i++) {
        lcm = lcm(lcm, arr[i]); // 앞의 결과랑 현재 수로 LCM
    }
    return lcm;
}

private static int lcm(int a, int b) {
    return a / gcd(a, b) * b;
}

private static int gcd(int a, int b) {
    while (b != 0) {
        int tmp = a % b;
        a = b;
        b = tmp;
    }
    return a;
}

난이도 비교

소인수분해 방식 (모든 수를 1로 만들기)
→ 아이디어는 재밌지만 과정이 길고 머리로 따라가기 힘듦.

GCD/LCM 누적 방식
→ 수학 공식을 한 줄로 구현 가능, 직관적이고 실전 코테에서 거의 항상 이거 씀.

👉 그래서 “너무 어렵다”는 느낌이 드셨다면 GCD 방식으로 바꾸시는 걸 추천드려요.
그게 사실상 프로그래머스 같은 문제에서 기대하는 정답 풀이거든요.

원하시면 제가 같은 입력 예시로 두 방법을 동시에 실행해서 과정 비교(중간 출력 포함)도 보여드릴까요?
2. 코테에서 LCM을 모르면?

맞습니다. LCM 공식 자체를 모른다면, 결국은 님이 시도하신 것처럼
“각 수를 소인수분해 → 필요한 만큼 곱해서 만들기”
혹은
“1부터 숫자를 늘려가며 모든 수로 나눠 떨어지는 최소값 찾기 (브루트포스)”
밖에 없습니다.

예) arr = [2,6,8,14]

1부터 올려가며 x % 2==0 && x % 6==0 && x % 8==0 && x % 14==0 확인

최소로 걸리는 수가 LCM

→ 다만 이건 비효율적이라 입력 크기가 크면 바로 시간 초과납니다.

3. 실제 코테 난이도

Level 1~2 문제: 브루트포스(하나씩 증가시키며 확인)로도 통과 가능하게 제한을 줍니다.
(예: 숫자 ≤ 100, 배열 길이 ≤ 15 → 최악의 경우에도 LCM 값은 제한적이라 brute force 가능)

Level 3 이상: 효율성까지 신경써야 해서 GCD/LCM 공식을 반드시 알아야 합니다.

4. 정리

LCM/GCD 공식은 프로그래밍 언어나 공식문서에 내장된 게 아니라, 수학적 성질이에요.

코테 준비라면 유클리드 호제법 + LCM 공식은 반드시 암기해 두시는 게 좋아요.

모르면 님처럼 소인수분해/브루트포스 방식으로라도 풀 수 있지만, 그건 “돌려서 겨우 맞추는 방법”이고, 실전에서는 보통 효율성 테스트에서 탈락합니다.

그냥 일반 풀이
private static int solution(int[] arr) {
    // 0이나 음수는 제한사항에 없다고 가정(모두 1~100)
    int n = arr.length;
    int[] a = Arrays.copyOf(arr, n);

    int ans = 1;
    int d = 2;

    // 모든 원소가 1이 될 때까지 반복
    while (true) {
        boolean allOne = true;
        for (int v : a) {
            if (v != 1) { allOne = false; break; }
        }
        if (allOne) break;

        boolean divided = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % d == 0) {
                a[i] /= d;
                divided = true;
            }
        }
        if (divided) {
            ans *= d;     // 이번 라운드에 d로 나눠진 게 있었으면 d를 정답에 반영
            // d는 유지해서 같은 d로 더 나눌 수 있는지 한 번 더 본다
        } else {
            d++;          // 이번 라운드에 아무도 안 나눠졌으면 다음 수로
        }
    }
    return ans;
}

        * */
        return num;
    }
}
