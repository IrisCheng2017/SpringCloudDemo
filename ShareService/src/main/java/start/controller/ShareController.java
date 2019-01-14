package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IrisCheng
 * @date Created in 2019/1/11 17:41
 */
@RestController
public class ShareController {
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/share")
    public String share() {
        ServiceInstance instance = client.getLocalServiceInstance();
        return "这是分享服务";
    }
}
