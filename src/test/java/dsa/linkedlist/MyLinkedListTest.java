package dsa.linkedlist;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void simpleLinkedList(){
        Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);
        MyLinkedList list = new MyLinkedList();
        list.addNode(node1);

    }

}
