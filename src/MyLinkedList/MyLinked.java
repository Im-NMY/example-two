package MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**   Создаем класс своего LinkedList (не замкнутого!)
 *  с добавлением элементов в начала и в конец  :  */

public class MyLinked<E> implements LinkedInterface<E>, Iterable<E> {
    //    Метод добавления элемента в конец MyLinked<E> :
    @Override
    public void addLast(E e) {
        Node<E> prev = LastNode;
        prev.setCurrentElement(e);
        LastNode = new Node<E>(null, prev, null);
        prev.setNextElement(LastNode);
        size++;
    }
    //    Метод добавления элемента в начало MyLinked<E> :
    @Override
    public void addFirst(E e) {
        Node<E> next = FirstNode;
        next.setCurrentElement(e);
        FirstNode = new Node<>(null, null, next);
        next.setPrevElement(FirstNode);
        size++;
    }
    //    Метод для определения количества элементов в MyLinked<E> :
    @Override
    public int size() {
        return size;
    }
    //    Метод для определения элемента по индексу элементов в MyLinked<E> :
    @Override
    public E getElementByIndex(int x) {
        Node<E> target = FirstNode.getNextElement();
        for (int i = 0; i < x; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }
    //    Метод "рекурся" для определения нужного индекса элемента в MyLinked<E> :
    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }
    //Итератор:
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int x = 0;
            @Override
            public boolean hasNext() {
                return x < size;
            }
            @Override
            public E next() {
                return getElementByIndex(x++);
            }
        };
    }
/**    процес создания конструктора по аналогии из документации LinkedList   **/
    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }
    private Node<E> FirstNode;
    private Node<E> LastNode;
    private int size = 0;

    public MyLinked() {
        LastNode = new Node<E>(null, FirstNode, null);
        FirstNode = new Node<E>(null, null, LastNode);
    }


    public static void main(String[] args) {
    //Тест нашего LinkedList:
        MyLinked<String> test = new MyLinked<>();
    //Добавление елемента в начало:
        test.addFirst("6");
        test.addFirst("7");
        test.addFirst("8");
        test.addFirst("9");
        test.addFirst("10");
    //Добавление елемента в конец:
        test.addLast("1");
        test.addLast("2");
        test.addLast("бинго");
        test.addLast("4");
        test.addLast("5");
        test.addLast("11");
        test.addLast("12");
   //Итератор тест:
        for (String s: test) {
            System.out.println(s);
        }
        System.out.println("Количество элементов:");
        System.out.println(test.size());
        System.out.println("Поиск элемента по индексу:");
        System.out.println(test.getElementByIndex(7));

        System.out.println("-----------------------------------------");
        System.out.println("Пример работы с оригинальным LinkedList<> :");

        LinkedList<String> Strings = new LinkedList<>();
        Strings.add("Привет ");
        Strings.add("моё ");
        Strings.add("имя");
        Strings.add("Максим");

        for (String str:Strings) {
            System.out.println(str);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Пример получения размера :");
        System.out.println(Strings.size());
        System.out.println("Пример получения элемента по индексу :");
        System.out.println(Strings.get(3));
        System.out.println("-----------------------------------------");
        System.out.println("Пример удаления элемента по индексу :");
        Strings.remove(0);
        for (String str1: Strings) {
            System.out.println(str1);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Пример добавления элемента в начало :");
        Strings.addFirst("Hello");
        for (String str2: Strings) {
            System.out.println(str2);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("End");
    }
}