package com.soloStudy.coffee.domain.payment;

import com.soloStudy.coffee.domain.account.Account;
import com.soloStudy.coffee.domain.order.Order;

public class Payment {
    // 주문에 따른 결제금액을 계산하고, 계좌에 등록하는 과정
    Order order; //결제할 주문 정보
    int paymentPrice; // 결제 금액

    public Payment(Order order) {
        this.order = order; // 주문정보 저장
        this.paymentPrice = order.orderPrice; // 주문금액 저장
    }

    public void proceed() {
        System.out.println("결제 완료 : "+ paymentPrice + "원");
        Account.getInstance();
    }
}

