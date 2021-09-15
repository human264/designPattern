package BridgePattern.list;

import BridgePattern.impl.AbstractList;

public class Stack<T> extends List<T> {


    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack 구현합니다.");
    }

    public void push(T obj) {
        impl.insertElement(obj, 0);

    }

    public T pop() {
        return impl.deleteElement(0);
    }

    public String toString() {


        return impl.toString();


    }


}
