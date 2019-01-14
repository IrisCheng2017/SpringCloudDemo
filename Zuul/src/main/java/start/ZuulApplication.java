package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author IrisCheng
 * @date Created in 2019/1/14 13:38
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        //在启动类上加入@EnableZuulProxy注解,启动zuul功能,然后新建一个filter包,创建ZuulFilterTest类,来实现校验口令的功能
        SpringApplication.run(ZuulApplication.class, args);
    }
}
