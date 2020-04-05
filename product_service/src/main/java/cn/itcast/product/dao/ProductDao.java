package cn.itcast.product.dao;

import cn.itcast.product.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * 接口继承
 */

public interface ProductDao extends JpaRepository<product,Integer>, JpaSpecificationExecutor<product> {
}
