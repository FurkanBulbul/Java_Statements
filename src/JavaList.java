package Java_Application;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");

        for (int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i));
            
        }

    }
}
