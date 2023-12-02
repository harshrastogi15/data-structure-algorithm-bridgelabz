package dsa.queue;

import dsa.linkedlist.MyLinkedList;
import dsa.linkedlist.Node;

public class MyQueue<T> {
    private MyLinkedList list;
    MyQueue(){
        list = new MyLinkedList();
    }

    public void enqueue(T data){
        Node<T> node = new Node<>(data);
        list.appendNode(node);
    }

    public void dequeue(){
        if(list==null){
            return ;
        }
        list.pop();
    }

    public T front(){
        return (T) list.head.getData();
    }
    public T back(){
        return (T) list.tail.getData();
    }
    public void showdata(){
        list.printList();
    }
}
