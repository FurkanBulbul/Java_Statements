package Java_Application;

import java.util.ArrayList;

public class JavaArrayLists {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");

        for (int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }

    }
}
