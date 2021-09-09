package bridge.impl;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {

    LinkedList<T> linkedList;

    public LinkedListImpl() {
        linkedList = new LinkedList<>();
        System.out.println("LinkedList로 구현합니다.");
    }

    @Override
    public void addElement(T obj) {
        linkedList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return linkedList.remove(i);
    }

    @Override
    public void insertElement(T obj, int i) {
        linkedList.add(i, obj);
    }

    @Override
    public int getElementSize() {
        return linkedList.size();
    }

    @Override
    public T getElement(int i) {
        return linkedList.get(i);
    }

}
