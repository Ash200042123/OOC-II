

import java.util.LinkedList;

public class GenericMaxStack<E>{

    LinkedList<E> stck= new LinkedList<>();
    LinkedList<E> stck2= new LinkedList<>();


    void push(E x){
        stck.add(x);
        stck2.add(x);
    }

    E pop() throws Exception{
        if(stck.isEmpty()) {
            throw new Exception("Popping from empty stack is not allowed!");
        }
        Object x= stck.getLast();
        stck2.remove(x);
        return stck.removeLast();
    }

    boolean isEmpty(){
        if(stck.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    E max() throws Exception{
        if(stck.isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return stck2.peek();
    }
    }

