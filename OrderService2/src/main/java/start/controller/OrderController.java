package start.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IrisCheng
 * @date Created in 2019/1/11 17:44
 */
@RestController
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/order")
    public String order() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("被调用了");
        return "这是订单服务";
    }
}
