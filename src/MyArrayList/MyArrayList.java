package MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/** создаем свой ArrayList:
**/
class MyArrayList<E> implements MyInterface<E> {
    E[] abc;
    MyArrayList(){
        abc = (E[]) new Object[0];
    }
    // Наш ArrayList имплиментируется от MyInterface и все методы:
    @Override
    public boolean add(E e) {
        try {
            E[] temp = abc;
            abc = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, abc,0, temp.length);
            abc[abc.length - 1] = e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
        //Метод для добавление елемента, но "(E[]) new Object[0]" может вызывать ошибку, поэтому делаем исключение!
    }
    @Override
    public void delete(int i) {
        try {
            E[] temp = abc;
            abc = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, abc, 0, i);
            int elemAfterIndex = temp.length - i - 1;
            System.arraycopy(temp, i + 1, abc, i, elemAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        //Метод для удаление елемента, но "(E[]) new Object[0]" может вызывать ошибку, поэтому делаем исключение!
    }
    @Override
    public E get(int i) {
        return abc[i];
    //Метод для получение елемента!
    }
    @Override
    public int size() {
        return abc.length;
    //Метод для получение размера елемента!
    }
    @Override
    public void update(int i, E e) {
        abc[i] = e;
    //Метод для замены елемента на другой элемент!
    }
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(abc);
    //Метод итерации нашего массива!
    }
    public static void main(String[] args) {
    //Тест нашего ArrayList:
        MyArrayList<String> test = new MyArrayList<String>();
        test.add("one");
        test.add("two");
        test.add("three");

        System.out.println("Проверка итератора:");
        for (String s: test) {
            System.out.println(s);
        }
        System.out.println("Проверка на чтение элемента: "+ test.get(1));
        System.out.println("Проверка размера: "+ test.size());

        test.update(1, "два");
        System.out.println("Проверка на замену элементов: "+test.get(1));

        test.delete(1);
        System.out.println("Проверка на удаление элементов: " + test.get(1)+ " , размер: " + test.size());

        System.out.println("Проверка:");
        for (String s: test) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Пример работы с оригинальным ArrayList<> :");
        System.out.println("");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("меня");
        strings.add("зовут");
        strings.add("Максим");

        for (String str: strings) {
            System.out.println(str);
        }
        System.out.println("");
        System.out.println("Пример получения элемента по индексу :");
        System.out.println(strings.get(3));
        System.out.println("Пример получения размера :");
        System.out.println(strings.size());
        System.out.println("-----------------------------------------");
        System.out.println("Пример удаления элемента по индексу :");

        strings.remove(0);
        for (String str1: strings) {
            System.out.println(str1);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("End");
    }
}
