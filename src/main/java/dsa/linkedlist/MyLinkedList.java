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

    public void appendNode(Node node){
        if(this.head == null){
            this.head = node;
        }
        if(this.tail == null){
            this.tail = node;
        }else{
            Node temp = tail;
            tail = node;
            temp.setNext(tail);
        }
    }

    public void insertNode(Node prev, Node inserted){
        Node temp = prev.getNext();
        prev.setNext(inserted);
        inserted.setNext(temp);
    }

    public void pop(){
        head = head.getNext();
    }

    public void popLast(){
        Node temp=head;
        while((temp.getNext() != null) &&  (temp.getNext().getNext()!=null)){
            temp = temp.getNext();
        }
        tail = temp;
        temp.setNext(null);
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
