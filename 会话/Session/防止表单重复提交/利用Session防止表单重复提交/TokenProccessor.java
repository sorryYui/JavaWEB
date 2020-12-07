package ServletDemoTest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Base64;
public class TokenProccessor
{
    private TokenProccessor()
    {

    }
    private static final TokenProccessor instance = new TokenProccessor();
    public static TokenProccessor getInstance()
    {
        return instance;
    }
    public String makeToken()
    {
        String token = System.currentTimeMillis() + new Random(99999).nextInt() + "";
        try
        {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte []md5 = md.digest(token.getBytes());
            Base64.Encoder encoder = Base64.getEncoder();
            return encoder.encodeToString(md5);
        }catch(NoSuchAlgorithmException e)
        {
           throw new RuntimeException(e);
        }
    }
}
