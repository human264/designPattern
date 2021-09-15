package BridgePattern.impl;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

    ArrayList<T> arrary;


    public ArrayImpl() {
        arrary = new ArrayList<T>();
        System.out.println("Array로 구현 합니다.");
    }


    @Override
    public void addElement(T obj) {
        arrary.add(obj);
    }

    @Override
    public int insertElement(T obj, int i) {
        arrary.add(i, obj);
        return 0;
    }

    @Override
    public T deleteElement(int i) {
        return arrary.remove(i);
    }

    @Override
    public T getElements(int i) {
        return arrary.get(i);
    }

    @Override
    public int getElementSize() {
        return arrary.size();
    }


    public String toString() {

        return arrary.toString();


    }




}
