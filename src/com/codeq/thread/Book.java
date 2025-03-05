package com.codeq.thread;

public class Book extends Thread {

    @Override
    public void run() {

        System.out.println("Hi");
    }

    public static void main(
            String str[]) {

        Book book = new Book();
        book.start();
    }

}
