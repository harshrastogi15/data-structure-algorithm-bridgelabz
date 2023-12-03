package dsa.linkedlist;

public class MyLinkedList<T> {
    public INode<T> head;
    public INode<T> tail;
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
            INode<T> temp = head;
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
            INode<T> temp = tail;
            tail = node;
            temp.setNext(tail);
        }
    }

    public void insertNode(Node prev, Node inserted){
        INode<T> temp = prev.getNext();
        prev.setNext(inserted);
        inserted.setNext(temp);
    }

    public void pop(){
        head = head.getNext();
    }

    public void popLast(){
        INode<T> temp=head;
        while((temp.getNext() != null) &&  (temp.getNext().getNext()!=null)){
            temp = temp.getNext();
        }
        tail = temp;
        temp.setNext(null);
    }

    public INode<T> searchNode(T data){
        INode<T> temp = head;
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
        INode<T> temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
