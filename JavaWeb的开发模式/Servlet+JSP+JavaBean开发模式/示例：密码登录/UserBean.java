package ServletDemoTest;

public class UserBean
{
    private String username;
    private String password;
    public UserBean()
    {

    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean login()
    {
        return username.equals("HHH") && password.equals("123");
    }
}
