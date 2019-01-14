package start.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author IrisCheng
 * @date Created in 2019/1/14 13:40
 */
public class ZuulFilterTest extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(ZuulFilterTest.class);

    @Override
    public Object run() {
        //这个filter的功能就是校验访问者有没有携带code参数,如果没有就会返回error,拒绝访问
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String code = request.getParameter("code");
        if (code==null) {
            logger.warn("code is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        logger.info("code is ok");
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public String filterType() {
        return "pre";
    }
}
