package MyArrayList;
//создаем интерфейс для нашего ArrayList:
public interface MyInterface<E> extends Iterable<E> {
//Интерфейс будет содержать методы:
    boolean add(E e);
    //Добовление элемента!
    void delete(int i);
    //Удаление элемента по индексу!
    E get(int i);
    //Получение элемента по индексу!
    int size();
    //Получение размера!
    void update(int i, E e);
    //Обновление элемента по индексу!
}
