package com.inflean.map;

import java.util.HashMap;
import java.util.Map;
public class MapEx {

    public static void main(String[] args) {
        String[][] productArr = {{"Java","100000"},{"Spring","200000"},{"JPA","30000"}};
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> list = new HashMap<>();
        for(String[] product : productArr){ //productArr의 String[]은 1차원 배열로 꺼낸거고 한쌍이 나옴
            list.put(product[0],Integer.valueOf(product[1]));
        }

        // Map의 모든 데이털 출력 - 코드 작성
        for (String key : list.keySet()) {
            System.out.println("제품 : " + key + ", 가격 "+list.get(key));
        }
    }
}
