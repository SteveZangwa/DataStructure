import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MapClassTest {

    Map map=new HashMap();

    @Test
public void display(){
        map.put(1,"John");
        map.put(5,"Irvin");


        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}