package Java_Application;


public class ThreadImplements implements Runnable {

    public static void main(String[] args) {

        ThreadImplements thread = new ThreadImplements();
        Thread threadObject = new Thread(thread);
        threadObject.start();
        System.out.println("Outside of a thread");
    }

    public void run() {
        System.out.println("Inside of a thread");
    }
}
