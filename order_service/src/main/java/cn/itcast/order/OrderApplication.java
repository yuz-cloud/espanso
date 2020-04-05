package cn.itcast.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("cn.itcast.order.entity")
public class OrderApplication {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    public static void main(String[] args) {
        System.out.println("----------------项目启动开始-----------------------");
        SpringApplication.run(OrderApplication.class);
        System.out.println("----------------项目启动成功-----------------------");
    }
}
