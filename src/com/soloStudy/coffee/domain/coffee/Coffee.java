package com.soloStudy.coffee.domain.coffee;

public class Coffee {
    String name;
    int price;
    int purchasePrice;
    int stock;
    int safetyStock;
    int salesCnt;

    public boolean provide(int orderCnt){
        // 재고 차감 (안전재고)
        // 판매량 추가(누적 판매량)
        if(stock < orderCnt){
            System.out.println("주문 실패 : 재고 부족");
            return false;
        }
        stock -= orderCnt;
        salesCnt += orderCnt;
        System.out.println("주문완료 : "+ orderCnt + "잔 판매됨");
        return true;
    }
}
