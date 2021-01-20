package ServletDemoTest;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class filter implements Filter
{
    public void doFilter(ServletRequest req,ServletResponse resp, FilterChain chain)
        throws ServletException,IOException
    {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String charset = config.getInitParameter("charset");
        charset = charset == null ? defaultCharset : charset;
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);
        response.setContentType("text/html;charset="+charset);
        MyRequest myRequest = new MyRequest(request);
        chain.doFilter(myRequest,response);
    }
    public void init(FilterConfig config)
    {
        this.config = config;
    }
    private FilterConfig config;
    private final String defaultCharset = "UTF-8";
}
