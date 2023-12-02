package dsa.queue;

import dsa.stack.MyStack;
import org.junit.Test;

import java.util.Queue;

public class MyQueueTest {
    @Test
    public void myQueueTest(){

        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.dequeue();
        q.showdata();
    }
}
