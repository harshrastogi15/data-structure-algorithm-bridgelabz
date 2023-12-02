package dsa.stack;

import org.junit.Test;

public class MyStackTest {
    @Test
    public void mystacktest(){
        MyStack<Integer> st = new MyStack<>();
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.pop();
        st.pop();
        System.out.println(st.top());
        st.showdata();
    }
}
