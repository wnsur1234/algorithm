package com.proCode.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;

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
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        LinkedHashMap<String, String> clothesMap = new LinkedHashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            String[] c = new String[2];
            for(int j = 0; j < clothes.length; j++) {
                c = clothes[i][j].split(",");
                clothesMap.put(c[1], c[0]);
            }
        }
        clothesMap.forEach( (key, value) -> { clothesMap.get(key)});

    }
}
