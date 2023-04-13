package Homework;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hw4_MyQueue {
    Queue queue = new LinkedList();
    private int size = 0;

    void enqueue(Object obj){
        queue.add(obj);
    }
    Object dequeque (){
        return queue.poll();
    }
    Object first(){
        return queue.peek();
    }
}
