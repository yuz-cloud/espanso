package cn.itcast.product.controller;


import cn.itcast.product.entity.product;
import cn.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {
    @Autowired
     private ProductService productService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public product findById(@PathVariable Integer id){
        product  product = productService.findById(id);
        return  product;
    }
}
