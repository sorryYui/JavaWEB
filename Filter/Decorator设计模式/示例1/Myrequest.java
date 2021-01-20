package ServletDemoTest;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
public class MyRequest extends HttpServletRequestWrapper
{

    public MyRequest(HttpServletRequest request)
    {
        super(request);
        this.request = request;
    }
    public String getParameter(String name)
    {
        String value = request.getParameter(name);
        if (value == null)
            return value;
        try {
            value = request.getMethod().equalsIgnoreCase("get") ? new String(value.getBytes(StandardCharsets.UTF_8),
                    request.getCharacterEncoding()) : value;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }
    private HttpServletRequest request;
}
