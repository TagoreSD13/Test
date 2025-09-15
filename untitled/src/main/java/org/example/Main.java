package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Call HeapOOM
        HeapOOM heap = new HeapOOM();
        heap.print();

        // Call Newloop
        Newloop loop = new Newloop();
        loop.print();

        // A simple for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
