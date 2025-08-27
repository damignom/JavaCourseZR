package intensive2.Homework1;

import java.util.Objects;

public class MyHashMap<K, V> {
    // Начальная размер
    private static final int INITIAL_CAPACITY = 16;
    // Коэффициент загрузки
    private static final float LOAD_FACTOR = 0.75f;

    // Количество элементов
    private int size = 0;
    // Массив "бакетов"
    private Node<K, V>[] table;

    // Узел ключ-значение
    private static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new Node[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % table.length);
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> current = table[index];

        // Проверка на существование ключа
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value; // обновление
                return;
            }
            current = current.next;
        }

        // Вставка нового узла в начало списка
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;

        // Проверка на расширение
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }
    }

    public V remove(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        Node<K, V>[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;

        for (Node<K, V> head : oldTable) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Пример использования
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 3);

        System.out.println(map.get("two"));   // 2
        System.out.println(map.remove("one")); // 1
        System.out.println(map.get("one"));   // null
        System.out.println(map.size());       // 2
    }
}

