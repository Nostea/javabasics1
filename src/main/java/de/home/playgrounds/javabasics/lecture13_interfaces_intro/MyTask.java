package de.home.playgrounds.javabasics.lecture13_interfaces_intro;

public class MyTask implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("Hi, ich laufe parrallel");
            try {
                Thread.sleep(100l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
