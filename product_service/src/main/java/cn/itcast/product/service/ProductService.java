package cn.itcast.product.service;
import cn.itcast.product.entity.product;

public interface ProductService {
    /**
     * 根据id查询
     */
    product findById(Integer id);
    /**
     * 保存
     */
     void save(product product);
    /**
     * 更新
     */
     void update(product product);
    /**
     * 删除
     */
    void date(Integer id);
}
