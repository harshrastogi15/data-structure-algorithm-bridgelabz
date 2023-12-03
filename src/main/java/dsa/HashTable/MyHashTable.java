package dsa.HashTable;

import dsa.linkedlist.MapNode;
import dsa.linkedlist.MyLinkedList;

import java.util.Map;

public class MyHashTable<K,T> {
    MyLinkedList<K> list;

    MyHashTable(){
        list = new MyLinkedList<>();
    }

    public T get(K key){
        MapNode<K,T> node = (MapNode<K, T>) this.list.searchNode(key);
        return (node == null)?null:node.getVal();
    }

    public void add(K key, T val){
        MapNode<K,T> node = (MapNode<K, T>) this.list.searchNode(key);
        if(node == null){
            node = new MapNode<>(key,val);
            list.addNode(node);
        }else{
            node.setVal(val);
        }
    }

    public String toString(){
        return "MyHash { " + list + " }";
    }



}
