package com.springboottest.springboottest;

import com.springboottest.springboottest.entity.Deliver;
import com.springboottest.springboottest.repository.DeliverRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


@SpringBootTest
class SpringboottestApplicationTests {
    @Autowired
    private DeliverRepository repository;

    @Test
    void contextLoads() {
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<Deliver> page = repository.findAll(pageRequest);
        int i = 0;
    }

}
