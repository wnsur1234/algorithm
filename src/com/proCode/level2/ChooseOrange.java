package com.proCode.level2;

import java.util.*;

public class ChooseOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 상자에 담으려는 개수 : k
        // 귤의 크기 : oranges
        System.out.print("K : ");
        int k = sc.nextInt();
        sc.nextLine();
        System.out.println("배열 입력하세요. " );
        String s = sc.nextLine();
        String[] oranges = s.split(",");
        int[] orangesInt = new int[oranges.length];
        for (int i = 0; i < orangesInt.length; i++) {
            orangesInt[i] = Integer.parseInt(oranges[i]);
        }
        int answer = solution(k,orangesInt);
        System.out.println(answer);
    }

    private static int solution(int k , int[] orangesInt) {
        if (k <= 0) return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int t : orangesInt) {
            freq.put(t, freq.getOrDefault(t, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(freq.values());
        counts.sort(Collections.reverseOrder()); // 많이 나온 순

        int picked = 0, kinds = 0;
        for (int c : counts) {
            picked += c;
            kinds++;
            if (picked >= k) break;
        }
        return kinds;
    }
}
