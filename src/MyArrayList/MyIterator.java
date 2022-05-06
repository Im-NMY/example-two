package MyArrayList;

import java.util.Iterator;
// создаем свои iterator:
public class MyIterator<E> implements Iterator<E> {
// Наш iterator имплиментируется от java.util.Iterator т.к. необходимы методы hasNext(проверяет) и next(возвращает).
    int i = 0;
    E[] abc;
// Наш iterator будет обрабатывать массив:
    MyIterator(E[] abc){
        this.abc = abc;
    }
    @Override
    public boolean hasNext() {
        return i < abc.length;
    }
    @Override
    public E next() {
        return abc[i++];
    }
}
