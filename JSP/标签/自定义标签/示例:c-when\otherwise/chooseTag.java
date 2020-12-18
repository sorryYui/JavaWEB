package ServletDemoTest;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class chooseTag extends SimpleTagSupport
{
    private boolean isAlive;
    public void doTag()
            throws IOException,JspException
    {
        JspFragment jf = this.getJspBody();
        jf.invoke(null);
    }
    public boolean isAlive()
    {
        return this.isAlive;
    }
    public void setAlive(boolean isAlive)
    {
        this.isAlive = isAlive;
    }
}
