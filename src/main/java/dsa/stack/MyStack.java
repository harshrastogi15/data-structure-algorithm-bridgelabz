package dsa.stack;

import dsa.linkedlist.MyLinkedList;
import dsa.linkedlist.Node;

public class MyStack<T> {
    public Node top;
    private MyLinkedList list;
    MyStack(){
        list = new MyLinkedList();
    }

    public void push(T data){
        Node<T> node = new Node<>(data);
        list.addNode(node);
    }

    public void pop(){
        if(list==null){
            return ;
        }
        list.pop();
    }

    public T top(){
        return (T) list.head.getData();
    }
    public void showdata(){
        list.printList();
    }

}
