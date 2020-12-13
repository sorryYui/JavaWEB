package ServletDemoTest;
public class BeanDemo
{
    public BeanDemo()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    private String name;
    private int age;
}
