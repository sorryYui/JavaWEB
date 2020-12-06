package ServletDemoTest;
import java.util.Map;
import java.util.HashMap;
public class DataBase
{
    private static Map<String,Book> map = new HashMap<String,Book>();
    static
    {
        map.put("1",new Book("弟弟","1"));
        map.put("2",new Book("大弟弟","2"));
        map.put("3",new Book("特大弟弟","3"));
        map.put("4",new Book("巨弟弟","4"));
        map.put("5",new Book("特巨大弟弟","5"));
    }
    public static Map<String,Book> getAll()
    {
        return map;
    }
}
