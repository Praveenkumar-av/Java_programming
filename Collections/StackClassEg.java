// Stack class
// A stack represents a  group of elements stored in LIFO(Last In First Out) order.

import java.util.*;

class StackClassEg
{
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();

        // the int type is conerted into Integer object during compole time and then stored into stack.
        // the primitive datatype is converted into an object form automatically is called 
        // 'auto boxing'. Auto boxing is done in generic datatypes.

        st.push(10);  // pushes an element obj onto top of stack and returns the element.
        st.push(20);
        st.push(30);

        System.out.println("is stack empty :"+st.empty());

        System.out.println("search :"+st.search(20));  // returns the posotion of element from top of stack
        // or returns -1 if not found.

        System.out.println(st.peek());  // returns top most element without removing it.
        System.out.println(st.pop());  // pops the top most element and returns it.
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}