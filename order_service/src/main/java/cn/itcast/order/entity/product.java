package cn.itcast.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品实体类
 */
@Data
public class product {
    private  int  id;
    private  String name;
}
