package com.gracjan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);

        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());



    }
}
