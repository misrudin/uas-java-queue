package com.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Product[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Product[capacity];
    }

    public void add(Product product) {
        if (back == queue.length) {
            Product[] newArray = new Product[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = product;
        back++;
    }

    public Product remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Product product = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return product;
    }

    public Product peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
