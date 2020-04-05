package cn.itcast.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品实体类
 */
@Data
@Entity
@Table(name="tb_product")
public class product {
    @Id
    private  int  id;
    private  String name;
}
