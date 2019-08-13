package com.txl.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: springBoot+mybatis_xml+mysql分库
 * @description:
 * @author: txl
 * @create: 2019-08-08 11:19
 **/
@Entity
@Table(name="goods")
@Data
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;
}
