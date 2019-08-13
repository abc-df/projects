package com.txl.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @program: springBoot+Elasticsearch
 * @description:
 * @author: txl
 * @create: 2019-08-06 16:44
 **/
public class SaveEsBlog implements Serializable {
    private String firstname;
    private String lastname;


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
