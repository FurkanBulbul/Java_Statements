package Java_Application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");

        Iterator<String> it = animals.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());


    }
}
