package intensive.Homeworks.Homework2;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    // Добавить элемент в конец списка
    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    // Добавить элемент по индексу
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Добавить все элементы из коллекции
    public boolean addAll(Collection<? extends E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection cannot be null");
        }

        Object[] a = collection.toArray();
        int numNew = a.length;
        ensureCapacity(size + numNew);
        System.arraycopy(a, 0, elements, size, numNew);
        size += numNew;
        return numNew != 0;
    }

    // Получить элемент по индексу
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    // Удалить элемент по индексу
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;

        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }

        elements[--size] = null; // очищаем последний элемент
        return oldValue;
    }

    // Удалить первое вхождение элемента
    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (elements[index] == null) {
                    fastRemove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (o.equals(elements[index])) {
                    fastRemove(index);
                    return true;
                }
            }
        }
        return false;
    }

    // Быстрое удаление без проверки границ
    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    // Проверяем размер, при необходимости увеличиваем массив
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elements.length > 0) {
            int oldCapacity = elements.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1); // увеличиваем на 50%
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
