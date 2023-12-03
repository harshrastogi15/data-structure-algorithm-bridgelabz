package dsa.HashTable;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {
    @Test
    public void Abilitytofindfrequencyofwords(){
        String st = "to be or not to be";
//        String[] arr2 = st.toLowerCase().split(" ");
//        System.out.println(arr2);
        String[] arr = {"to","be","not","to","be"};
        MyHashTable<String,Integer> hash = new MyHashTable<>();
        for(String word : arr){
            Integer val = hash.get(word);
            if(val == null)val =1;
            else{
                val = val+1;
            }
            hash.add(word,val);
        }
        Integer fr = hash.get("to");
        System.out.println(hash);
        Assert.assertEquals((Integer)2,fr);
    }
}
