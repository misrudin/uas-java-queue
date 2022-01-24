package com.queue;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        Product kaos = new Product(1, "Kaos", 100000);
        Product kemeja = new Product(2, "Kemeja", 150000);
        Product sepatu = new Product(3, "Sepatu", 200000);
        Product topi = new Product(4, "Topi", 100000);
        Product hp = new Product(4, "Handphone", 500000);

        queue.add(kaos);
        queue.add(kemeja);
        queue.add(sepatu);
        queue.add(topi);

        queue.remove();

        queue.add(hp);

        queue.printQueue();
    }
}
