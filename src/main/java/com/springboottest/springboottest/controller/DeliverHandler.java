package com.springboottest.springboottest.controller;

import com.springboottest.springboottest.entity.Deliver;
import com.springboottest.springboottest.repository.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/deliver")
public class DeliverHandler {
    @Autowired
    private DeliverRepository deliverRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Deliver> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return deliverRepository.findAll(request);
    }
}
