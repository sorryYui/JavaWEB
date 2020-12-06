package ServletDemoTest;
public class Book
{
    public Book(String name,String id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public boolean equals(Object book)
    {
       if (this == book)
           return true;
       if (book == null)
           return false;
        if (!(book instanceof Book))
            return false;
        Book obj = (Book)book;
        return obj.getId().compareTo(id) == 0 && obj.getName().compareTo(name) == 0;
    }
    public int hashCode()
    {
        return id.hashCode() + name.hashCode();
    }
    private String name;
    private String id;
}
