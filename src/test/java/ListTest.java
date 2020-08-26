import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ListTest {

    LinkedList<String> mylist = new LinkedList<>();

    @Test
    public void display(){
        mylist.add("Steve");
        mylist.add("Anitha");

        System.out.println(mylist);
    }

}