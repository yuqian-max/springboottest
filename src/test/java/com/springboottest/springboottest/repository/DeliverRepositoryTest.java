package com.springboottest.springboottest.repository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DeliverRepositoryTest {

    @Autowired
    private DeliverRepository deliverRepository;

    @Test
    void findAll(){
        System.out.println(deliverRepository.findAll());

    }

}
