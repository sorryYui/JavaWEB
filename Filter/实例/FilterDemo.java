package ServletDemoTest;
import javax.servlet.Filter;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FilterDemo implements Filter
{
    public void init(FilterConfig filterConfig)
    {
        System.out.println("invoke init.");
    }
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain)
        throws IOException,ServletException
    {
        System.out.println("before");
        filterChain.doFilter(request,response);
        System.out.println("after");
    }
    public void destroy()
    {
        System.out.println("has been destroy");
    }
}
