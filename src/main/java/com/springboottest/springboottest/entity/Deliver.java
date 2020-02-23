package com.springboottest.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Deliver {
    @Id
    private Integer deliver_id;
    private String deliver_name;
    private Integer deliver_phone;
}
