package dsa.linkedlist;

public class MapNode<K,V> implements INode<K> {

    K key;
    V val;
    MapNode<K,V> next;
    public MapNode(K key,V val){
        this.key = key;
        this.val = val;
        this.next = null;

    }
    @Override
    public void setNext(INode<K> next) {
        this.next = (MapNode<K, V>) next;
    }

    @Override
    public INode<K> getNext() {
        return this.next;
    }

    @Override
    public K getData() {
        return this.key;
    }

    public V getVal(){
        return this.val;
    }
}
