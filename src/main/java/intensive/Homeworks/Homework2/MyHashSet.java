package intensive.Homeworks.Homework2;

public class MyHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private Node<E>[] table;
    private int size;

    private static class Node<E> {
        final E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public MyHashSet() {
        table = (Node<E>[]) new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    // Вставить элемент
    public boolean insert(E element) {
        if (element == null) {
            throw new NullPointerException("Null elements are not allowed");
        }

        // Проверяем, нужно ли увеличивать таблицу
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }

        int index = getIndex(element);
        Node<E> head = table[index];

        // Проверяем существует ли такой элемент
        for (Node<E> node = head; node != null; node = node.next) {
            if (element.equals(node.item)) {
                return false; // элемент уже существует
            }
        }

        // Добавляем новый элемент в начало
        table[index] = new Node<>(element, head);
        size++;
        return true;
    }

    // Удалить элемент
    public boolean remove(E element) {
        if (element == null) {
            throw new NullPointerException("Null elements are not allowed");
        }

        int index = getIndex(element);
        Node<E> head = table[index];
        Node<E> prev = null;

        for (Node<E> node = head; node != null; prev = node, node = node.next) {
            if (element.equals(node.item)) {
                if (prev == null) {
                    table[index] = node.next; // удаляем первый элемент цепочки
                } else {
                    prev.next = node.next; // удаляем из середины/конца
                }
                size--;
                return true;
            }
        }

        return false;
    }

    // Получить индекс в таблице
    private int getIndex(E element) {
        return Math.abs(element.hashCode()) % table.length;
    }

    // Увеличить размер таблицы
    private void resize() {
        Node<E>[] oldTable = table;
        table = (Node<E>[]) new Node[table.length * 2];
        size = 0;

        // Перехешируем все элементы
        for (Node<E> head : oldTable) {
            for (Node<E> node = head; node != null; node = node.next) {
                insert(node.item);
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        if (element == null) {
            throw new NullPointerException("Null elements are not allowed");
        }

        int index = getIndex(element);
        for (Node<E> node = table[index]; node != null; node = node.next) {
            if (element.equals(node.item)) {
                return true;
            }
        }
        return false;
    }
}
