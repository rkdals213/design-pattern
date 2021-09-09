package bridge.impl;

public interface AbstractList<T> {

    void addElement(T obj);

    T deleteElement(int i);

    void insertElement(T obj, int i);

    T getElement(int i);

    int getElementSize();
}
