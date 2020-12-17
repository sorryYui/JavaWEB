package ServletDemoTest;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
public class TagTest implements Tag
{
    private PageContext pageContext;
    @Override
    public int doEndTag()
        throws JspException
    {
        System.out.println("doEndTag");
        return 0;
    }
    @Override
    public int doStartTag()
        throws JspException
    {
        System.out.println("dpStartTag");
        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        JspWriter out = pageContext.getOut();
        String ip = request.getRemoteAddr();
        try
        {
            out.write(ip);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return 0;
    }
    @Override
    public Tag getParent()
    {
        return null;
    }
    @Override
    public void release()
    {
        System.out.println("release");
    }
    @Override
    public void setPageContext(PageContext pageContext)
    {
        System.out.println("setPageContext");
        this.pageContext = pageContext;
    }
    @Override
    public void setParent(Tag args)
    {

    }
}
