package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author IrisCheng
 * @date Created in 2019/1/14 11:00
 */
@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String order() {
        return restTemplate.getForEntity("http://SERVICE-ORDER/order?", String.class).getBody();
    }

}
