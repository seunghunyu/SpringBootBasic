package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //천원할인

    @Override
    public int discount(Member member, int price) {
        // enum은 == 쓰는게 맞음

        if(member.getGrade() == Grade.VIP) {
            System.out.println("1");
            return discountFixAmount;
        }else{
            System.out.println("2");
            return 0;
        }

    }
}
