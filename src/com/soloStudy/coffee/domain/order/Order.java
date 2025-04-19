package com.soloStudy.coffee.domain.order;

import com.soloStudy.coffee.domain.coffee.Coffee;
import java.time.LocalDateTime;

public class Order {
    String name;
    Coffee coffee;
    int orderCnt;
    public int orderPrice;
    LocalDateTime orderTime = LocalDateTime.now();

    public void proceed(){
        // Coffee에게 주문 수량을 알려줌
        // 그랬을때 coffee에서는 provide를 수행하는데
        // 그 조건에 만족하지 못했을 때 주문을 취소함
        if(!coffee.provide(orderCnt)){
            System.out.println("주문이 취소 되었습니다.");
            return;
        }
        System.out.println("주문이 완료되었습니다.");
    }
}


