package com.txl.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: springBoot+Elasticsearch
 * @description:
 * @author: txl
 * @create: 2019-08-06 16:44
 **/
@JsonIgnoreProperties(value={"hibernateLazyInitializer"})
@Document(indexName="bank3",type="account3")
public class EsBlog implements Serializable {
    @Id
    private Long id;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
