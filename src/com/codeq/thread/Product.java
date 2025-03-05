package com.codeq.thread;

public class Product implements Runnable {

    @Override
    public void run() {

        System.out.println("Hi");
    }

    public static void main(
            String arg[]) {

        Runnable ru = () -> System.out.println("Hi");
        ru.run();
        Runnable ruo = new Product();
        ruo.run();
    }

}
