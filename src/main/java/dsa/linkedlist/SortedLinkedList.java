package dsa.linkedlist;

public class SortedLinkedList <T>{
    public Node head;
    public Node tail;
    SortedLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addNode(Integer data){
        Node<Integer> node = new Node<>(data);
        if(this.tail == null){
            this.tail = node;
        }
        if(this.head == null){
            this.head = node;
        }else{
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                Integer val = (Integer) temp.getData();
                if(val > data){
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
            if(prev == null){
                prev = head;
                head = node;
                head.setNext(prev);
            }else{
                insertNode(prev,node);
            }
        }
    }


    private void insertNode(Node prev, Node inserted){
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
