package dsa.linkedlist;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void simpleLinkedList(){
        Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);
        Node<Integer> node4 = new Node<>(120);
        Node<Integer> node5 = new Node<>(10);

        MyLinkedList list = new MyLinkedList();
        list.addNode(node3);
        list.addNode(node2);
        list.addNode(node1);
        list.appendNode(node4);
        list.insertNode(node3,node5);
        list.pop();
        list.popLast();
        list.printList();

    }

}
