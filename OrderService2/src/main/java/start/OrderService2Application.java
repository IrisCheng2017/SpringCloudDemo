package start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author IrisCheng
 * @date Created in 2019/1/11 17:19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderService2Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderService2Application.class).web(true).run(args);
    }
}
