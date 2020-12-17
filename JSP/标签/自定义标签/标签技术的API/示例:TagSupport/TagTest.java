package ServletDemoTest;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
public class TagTest extends TagSupport
{
    @Override
    public int doStartTag()
        throws JspException
    {
        return Tag.SKIP_BODY;
    }
}
