package ServletDemoTest;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class SimpleTagTest extends SimpleTagSupport
{
    private int count;
    public void setCount(int count)
    {
        this.count = count;
    }
    @Override
    public void doTag()
        throws IOException,JspException
    {
        JspFragment jspFragment = this.getJspBody();
        for (int i = 0;i < count;i++)
            jspFragment.invoke(null);
    }
}
