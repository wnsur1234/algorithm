package com.inflean.poly.pay0;

public class NewPay implements HowtoPay{

    @Override
    public void pay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        System.out.println("New페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        System.out.println("결제가 성공했습니다.");
    }
}
