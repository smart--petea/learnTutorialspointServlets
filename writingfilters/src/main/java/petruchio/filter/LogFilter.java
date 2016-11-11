package petruchio.filter;

import javax.servlet.ServletException;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        String testParam = config.getInitParameter("test-param");

        System.out.println("Test Param: " + testParam);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        String ipAddress = request.getRemoteAddr();
        System.out.println("IP " + ipAddress + ", Time " + new java.util.Date().toString());
        chain.doFilter(request, response);
    }

    public void destroy(){}
}
