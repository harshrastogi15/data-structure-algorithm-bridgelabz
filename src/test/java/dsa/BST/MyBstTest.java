package dsa.BST;

import org.junit.Assert;
import org.junit.Test;

public class MyBstTest {
    @Test
    public void myBstTest(){
        MyBST<Integer> tree = new MyBST<>();
        tree.add(60);
        tree.add(30);
        tree.add(10);
        tree.add(200);
        tree.add(70);

        System.out.println(tree);
        Integer fd = tree.search(70);

        Assert.assertEquals((Integer) 70,fd);
    }
}
