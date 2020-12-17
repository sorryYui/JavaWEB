package ServletDemoTest;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
public class SimpleTagTest extends SimpleTagSupport
{
    @Override
    public void doTag()
            throws JspException,IOException
    {
        JspFragment jfrag = this.getJspBody();
        //jfrag.invoke(null);
    }
}
