package com.example.shoppro.repository;

import com.example.shoppro.entity.Cart;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class CartRepositoryTest {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void a() {

        // 카트 만들기

        //회원 필요
        Cart cart = new Cart();
        cart.setMember(memberRepository.findByEmail("test@a.a"));

        cartRepository.save(cart);
    }

}