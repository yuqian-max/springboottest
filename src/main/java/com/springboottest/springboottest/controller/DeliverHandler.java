package com.springboottest.springboottest.controller;

import com.springboottest.springboottest.entity.Deliver;
import com.springboottest.springboottest.repository.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deliver")
public class DeliverHandler {
    @Autowired
    private DeliverRepository deliverRepository;

    @GetMapping("/findAll")
    public List<Deliver>findAll(){
        return deliverRepository.findAll();
    }
}
