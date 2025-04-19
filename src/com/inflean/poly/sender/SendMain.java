package com.inflean.poly.sender;

public class SendMain {
    // 다형성을 활용하여
    // sender 인터페이스를 사용하고
    // EmailSender,SmSender,FaceBookSender을 구현해라
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(),new SmSender(),new FaceBookSender()};
        for(Sender sender : senders){
            sender.sendMessage("환영합니다!");
        }
    }
}
