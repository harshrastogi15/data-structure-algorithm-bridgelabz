package dsa.linkedlist;

public class MyLinkedList<T> {
    public Node head;
    public Node tail;
    public MyLinkedList(){
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

    public Node searchNode(T data){
        Node temp = head;
        while(temp!=null){
            if(temp.getData() == data){
                System.out.println(temp.getData());
                break;
            }
            temp = temp.getNext();
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
