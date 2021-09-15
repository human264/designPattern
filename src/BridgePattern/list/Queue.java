package BridgePattern.list;

import BridgePattern.impl.AbstractList;

public class Queue<T>  extends List<T> {


    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("Queue 구현합니다.");
    }

    public void enQueue(T obj) {
        impl.addElement(obj);

    }

    public T deQueue() {
        return impl.deleteElement(0);

    }

    public String toString() {


        return impl.toString();


    }

}
