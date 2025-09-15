package org.example;

public class HeapOOM {
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("This will eventually cause an OutOfMemoryError...");
        System.out.println(sb);
    }
}

