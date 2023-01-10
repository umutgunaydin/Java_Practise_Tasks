package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread{

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world "+i+" from thread "+threadNumber);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
