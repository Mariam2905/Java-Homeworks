package org.example.homeworks.collections.list.custom_array_list;

import org.example.experiments.bank.BankAccount;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E> implements List<E> {
    private int initialCapacity = 10;
    private int size;
    private int index;
    private E[] array = (E[]) new Object[initialCapacity];

    /**
     * If array size bigger than capacity, this method creating new array whose size equals size + capacity.
     */
    public void createNewArray() {
        int newCapacity = initialCapacity * 2;
        E[] arr = (E[]) new Object[newCapacity];
        System.arraycopy(array, 0, arr, 0, initialCapacity);
        array = arr;
        initialCapacity = newCapacity;
    }

    /**
     * This method print all array's elements.
     */
    public void printAllElements() {
        for (E item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * This method adds an element in array.
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can't must be negative");
        }
        if (index >= array.length) {
            createNewArray();
        } else {
            array[index++] = element;
            size++;
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    /**
     * This method removes the given o element.
     *
     * @param o element to be removed from this list, if present
     * @return removed or not;
     */
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                {
                    for (int j = i; j < size - 1; j++) {
                        array[j] = array[j + 1];
                    }
                }
                size--;
            }
        }
        return false;
    }

    /**
     * This method removes the element of given index.
     *
     * @param index the index of the element to be removed
     * @return null;
     */
    @Override
    public E remove(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return null;
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     * This method checks if the array is empty or not.
     *
     * @return array is empty or not;
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * This method return array's size.
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * This method checks if the array contains that element.
     *
     * @param o element whose presence in this list is to be tested;
     * @return Given array contains or not;
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o))
                return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    /**
     * This method takes a parameter (E element and index) and assigns it to the name variable.
     *
     * @param index   index of the element to replace;
     * @param element element to be stored at the specified position;
     * @return assigned variable;
     */
    @Override
    public E set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    array[index] = element;
                }
                return array[index];
            }
        }
        return array[index];
    }

//    /**
//     * Method doing reverse array elements.
//     *
//     * @return
//     */
//    public E[] reverse() {
//        E[] arr = (E[]) new Object[array.length];
//        int index = 0;
//        for (int i = size - 1; i >= 0; i--) {
//            arr[index] = array[i];
//            index++;
//        }
//        for (int i = 0; i < size; i++) {
//            array[i] = arr[i];
//        }
//        return array;
//    }
//    /**
//     * Method updating with index.
//     *
//     * @param index
//     * @param e
//     * @return
//     */
//    public E[] update(int index, E e) {
//
//        if (index >= size || index < 0) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//
//        array[index] = e;
//        return array;
//    }
//    /**
//     * Method copy other list elements.
//     *
//     * @param list
//     * @return
//     */
//    public E[] clone(List list) {
//        Object o;
//        for (int i = 0; i < list.size(); i++) {
//            o = list.get(i);
//            array[i] = (E) o;
//            size++;
//        }
//        return array;
//    }
//
//    /**
//     * Method doing swap two elements in an array list.
//     *
//     * @param index_1
//     * @param index_2
//     * @return
//     */
//    public E[] swap(int index_1, int index_2) {
//        if ((index_1 >= size || index_1 < 0) || (index_2 < 0 || index_2 >= size)) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//        E tmp = array[index_1];
//        array[index_1] = array[index_2];
//        array[index_2] = tmp;
//        return array;
//    }
//
//    /**
//     * Method adding an element into the array list at the first position.
//     *
//     * @param o
//     * @return
//     */
//    public E[] insert(Object o) {
//        size++;
//        for (int i = size - 1; i > 0; i--) {
//            array[i] = array[i - 1];
//        }
//        array[0] = (E) o;
//        return array;
//    }
//    /**
//     * Method pops the first found element with the element we gave.
//     *
//     * @param o
//     * @param element
//     * @return
//     */
//    public E[] replace(Object o, Object element) {
//        for (int i = 0; i < size; i++) {
//            if (array[i].equals(o)) {
//                array[i] = (E) element;
//                return array;
//            }
//        }
//        System.out.print("\nList does not contains that element");
//        return array;
//    }
//
//    /**
//     * Method searching by using index.
//     *
//     * @param index
//     * @return
//     */
//    public E search(int index) {
//        if (index >= size) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//        System.out.println(array[index]);
//        return array[index];
//    }
//
//    /**
//     * Method searching by using object.
//     *
//     * @param o
//     */
//    public void search(Object o) {
//        for (int i = 0; i < size; i++) {
//            if (o.equals(array[i])) {
//                System.out.println("\n " + i);
//                return;
//            }
//        }
//        System.out.println("\nThe list not contains this element.");
//    }

}
