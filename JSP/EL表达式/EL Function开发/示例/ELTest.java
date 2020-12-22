package ServletDemoTest;

import java.nio.charset.StandardCharsets;

public class ELTest
{
    public static String filter(String message)
    {
        StringBuffer result = new StringBuffer(message.length());
        char buffer[] = new char[message.length()];
        message.getChars(0,message.length() - 1,buffer,0);
        for (int i = 0;i < message.length();i++)
            switch(buffer[i])
            {
                case '<' :
                    result.append("&lt");break;
                case '>' :
                    result.append("&gt");break;
                case '&' :
                    result.append("&amp");break;
                case '"' :
                    result.append("&quot");break;
                default:
                    result.append(buffer[i]);
            }
        return result.toString();
    }
}
