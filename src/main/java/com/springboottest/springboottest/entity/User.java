package com.springboottest.springboottest.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    private Integer user_id;
    private String user_password;
    private String user_name;


}
