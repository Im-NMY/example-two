package MyLinkedList;

public interface LinkedInterface<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();

    E getElementByIndex(int x);
}
