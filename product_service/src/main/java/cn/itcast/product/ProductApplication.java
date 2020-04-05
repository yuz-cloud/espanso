package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"cn.itcast.product.service"})
@EntityScan("cn.itcast.product.entity")
@EnableJpaRepositories("cn.itcast.product.dao")
@EnableEurekaClient
/*激活eurekaclient*/
public class ProductApplication {
    public static void main(String[] args) {
        System.out.println("----------------项目启动开始-----------------------");
        SpringApplication.run(ProductApplication.class,args);
        System.out.println("----------------项目启动成功-----------------------");
    }
}
