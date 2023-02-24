package Java_Application;

public class JavaParameters {

    public static void main(String[] args) {

        getName("John", "Smith");
    }

    public static void getName(String firstName, String lastName) {
        System.out.println("Hello my name is" + firstName + " " + lastName);
    }

}