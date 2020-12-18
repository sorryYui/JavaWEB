package ServletDemoTest;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class otherWiseTag extends SimpleTagSupport
{
    public void doTag()
        throws IOException,JspException
    {
        JspFragment jf = this.getJspBody();
        chooseTag chooseTag = (chooseTag)this.getParent();
        if (!chooseTag.isAlive())
        {
            jf.invoke(null);
            chooseTag.setAlive(true);
        }
    }

}
