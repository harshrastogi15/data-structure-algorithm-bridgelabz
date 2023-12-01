package dsa.linkedlist;

public class MyLinkedList {
    private Node head;
    private Node tail;
    MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addNode(Node node){
        if(this.tail == null){
            this.tail = node;
        }
        if(this.head == null){
            this.head = node;
        }
    }
}
