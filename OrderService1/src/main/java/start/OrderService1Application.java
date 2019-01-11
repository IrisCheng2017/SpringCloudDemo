package start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author IrisCheng
 * @date Created in 2019/1/11 17:06
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderService1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderService1Application.class).web(true).run(args);
    }

}

