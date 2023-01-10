package day39_collections.multiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);

        thread1.start(); // it starts at the same time but if we use run it waits
        thread2.start();

    }
}
