package com.inflean.oop2;

public class Account {
    /*
    int balance 잔액
    deposit(int amount):입금 매서드
        - 입금시 잔액이 증가한다.
    withdraw(int amount) : 출금매서드
        - 출금시 잔액이 감소합ㄴ다,
        - 만약 잔액이 부족하면 잔액 부족을 출력해야한다
    * */
    // 잔액
    int balance;
    // 입금 액
    void deposit(int input){
        // 입금액이 들어오면 잔액이 증가한다.
        balance += input;
    }
    void wihtdraw(int output){
        // 잔액이 감소한다.
        if (balance < output) {
            System.out.println("잔액 부족 ");
        }else {
            balance -= output;
        }
    }
}
