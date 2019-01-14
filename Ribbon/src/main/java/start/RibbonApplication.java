package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author IrisCheng
 * @date Created in 2019/1/14 10:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        //这里的启动类与之前的不一样,因为要通过@LoadBalanced注解来开启负载均衡
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
