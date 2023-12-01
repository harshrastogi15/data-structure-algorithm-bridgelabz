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
        }else{
            Node temp = head;
            head = node;
            head.setNext(temp);
        }
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
