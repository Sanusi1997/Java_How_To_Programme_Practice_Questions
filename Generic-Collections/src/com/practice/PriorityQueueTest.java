package com.practice;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String []args){

        PriorityQueue<Double>  queue = new PriorityQueue<>();

        queue.offer(8.9);
        queue.offer(2.2);
        queue.offer(4.8);
        System.out.print("Polling from queue: ");



        while(queue.size() > 0){
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }
    }
}
