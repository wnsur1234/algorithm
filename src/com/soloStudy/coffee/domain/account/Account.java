package com.soloStudy.coffee.domain.account;

public class Account {
    public int balance; // 계좌 잔고
    private int sales;  // 총 매출
    private int expences; // 총 지출
    // (매출,지출,잔고) 내역을 기록한 정보
    // 여기서 Account 클래스는 하나의 계좌를 통해 모든 결제 정보를 관리해야함
    // 이에 따라 single톤을 사용하여 하나의 객체만 생성
    private static Account instance;

    public Account(int balance) {
        this.balance = balance;
    }

// 얘는 instance에 객체를 생성해서 balance(잔고)를 초기화 할 수 있게 하는 것
// 최초로 생성하였기때문에 지정해주어야함
    public static Account getInstance(int balance) {
        if (instance == null) {
            instance = new Account(balance);
        }
        return instance;
    }
    public static Account getInstance() {
        if (instance == null) {
            instance = new Account(0);
        }
        return instance;
    }
    // 지출 내역 기록
    public void registerSales(int paymentPrice){
        balance += paymentPrice;
        sales += paymentPrice;
        System.out.println("매출 등록 : "+ paymentPrice+ "원");
    }
    // 매출 내역 기록
    public void registerExpenses(int expences){
        balance -= sales;

    }
}
