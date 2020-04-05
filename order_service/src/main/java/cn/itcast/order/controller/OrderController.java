package cn.itcast.order.controller;


import cn.itcast.order.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate ;
    @RequestMapping(value = "/by/{id}",method = RequestMethod.GET)
    public product findById(@PathVariable Integer id){
        product product =restTemplate.getForObject("http://127.0.0.1:9001/product/1",product.class);
        return  product;
    }

}
