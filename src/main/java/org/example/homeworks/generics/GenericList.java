package org.example.homeworks.generics;

/**
 * 8.
 * This GenericList<T> that keeps a list of elements of some parametric type T.
 * Keep the elements of the list in an array with fixed capacity
 * which is given as parameter in the class constructor.
 * Implement methods for adding element, accessing element by index, removing element by index,
 * inserting element at given position, clearing the list, finding element by its value and ToString().
 * Check all input parameters to avoid accessing elements at invalid positions.
 * Implement auto-grow functionality: when the internal array is full,
 * create a new array of double size and move all elements to it.
 *
 * @param <T>;
 */
public class GenericList<T> {
    private T[] elements;
    private int size;
    private int capacity;

    public GenericList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public void add(T element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        size--;
    }

    public void insert(int index, T element) {
        checkIndex(index);
        if (size == capacity) {
            grow();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int find(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        T[] newElements = (T[]) new Object[capacity * 2];
        System.arraycopy(elements, 0, newElements, 0, capacity);
        capacity *= 2;
        elements = newElements;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range. Index" + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
