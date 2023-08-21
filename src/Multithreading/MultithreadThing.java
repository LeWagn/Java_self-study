package Multithreading;

public class MultithreadThing extends Thread {
    //instead of extending Thread class, you can also implement the Runnable interface.
    //Just need your own run Method in both cases.
    //Usecase for that: can only extend one other class but can implement as many interfaces as you like.
    //So you could extend another class and still implement Thread.
    //Difference: Have to create a new Thread before using it (currently creation and usage in one step).

    private int threadNumber;

    public MultithreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        //Write code that you want to run in multiple threads here.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        }
    }
}
