package com.proCode.level2;

import java.util.HashMap;
import java.util.Map;

public class Clothes {
    public static void main(String[] args) {
        /*
        [내생각]
        1. 2차원 배열이기에 이중 for문으로돌며 Hash에 두번째 값이 종류이기에 [j]값을 Key값으로 가진다
        2. Hash에는 같은 key값에 대한 value는 LinkedList로 저장이 됨

        [이후 경우의수 구하기]
        1. 각종류의 개수(각 1개씩만 선택한경우)
        2. 각종류의개수 X 각 종류의개수 -> ex) 상의 개수 * 하의 개수
        -> 1번 + 2번 = result

        근데 지금 Hash 다루는 법을 잘 모르겠음 까먹었음
        * */
        String[][] clothes = new String[][]{{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
        Map<String, Integer> clothesMap = new HashMap<>();
        int n = clothes.length;
//        for(int i = 0; i < n; i++) {
//            String[] c = new String[2];
//            for(int j = 0; j < clothes.length; j++) {
//                int count = 0;
//
//                // getOrDefault몰랐다는 가정 구현해봄
//                if(clothesMap.containsKey(c[1])) {
//                    count +=1;
//                    clothesMap.put(c[1], count);
//                }else{
//                    count++;
//                    clothesMap.put(c[1], count);
//                }
//                // clothesMap.put(c[1],1); //이렇게도 +1 되나? 증가하나? clothesMap.getOrDefault(c[1],0)+1을 몰랐을 때 경우를 구현하고싶음
//            }
//        }
        for(int i = 0; i < n; i++){
            String s = clothes[i][1];
            if(clothesMap.containsKey(s)){
                clothesMap.put(s, clothesMap.get(s)+1);
            }else{
                clothesMap.put(s, 1);
            }
        }
        int result = 1;
        for(int i : clothesMap.values()){
            result *= (i+1);
        }
        System.out.println(result-1);
    }
}
