package com.soloStudy.coffee.domain.sale;

import com.soloStudy.coffee.domain.order.Order;
import com.soloStudy.coffee.domain.payment.Payment;

public class Sale {
    public void takeOrder(Order order){
        // 주문에따른 상품을 제공하고 결제를 진행하는 과정
        // 주문 = order.procced() 이고
        // 상품을 제공한다 = provide() -> procced()안에 포함되어있음
        // 결제를 진행한다 = sale에서 결제쪽으로 진행을 요청해야함
        order.proceed();
        Payment payment = new Payment(order);
        payment.proceed();



    }
}
