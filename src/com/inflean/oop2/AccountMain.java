package com.inflean.oop2;

public class AccountMain {

    public static void main(String[] args) {
        /*
        * 계좌에 10000원을 입급해라
        * 계좌에서 9000원을 출금해라
        * 계좌에서 2000원을 출금 시도해라 -> 잔액 부족 출력을 확인해라
        * 잔고를 출력해라 잔고 : 1000
        * */
        Account account = new Account();
        account.deposit(10000);
        account.wihtdraw(9000);
        account.wihtdraw(2000);
        System.out.println(account.balance);
    }
}
