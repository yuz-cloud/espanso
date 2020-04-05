package cn.itcast.product.service.impl;

import cn.itcast.product.dao.ProductDao;
import cn.itcast.product.entity.product;
import cn.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductSeriveImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public product findById(Integer id) {
        return productDao.findById(id).get();
    }

    @Override
    public void save(product product) {
       productDao.save(product);
    }

    @Override
    public void update(product product) {
        productDao.save(product);
    }

    @Override
    public void date(Integer id) {
          productDao.deleteById(id);
    }
}
