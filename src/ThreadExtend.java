package Java_Application;


public class ThreadExtend extends Thread {

    public static void main(String[] args) {

        ThreadExtend thread = new ThreadExtend();
        thread.start();

        System.out.println("Outside of a thread");
    }

    public void run(){
        System.out.println("Inside of a thread");
    }
}
