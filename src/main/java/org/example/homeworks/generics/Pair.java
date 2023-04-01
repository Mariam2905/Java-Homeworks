package org.example.homeworks.generics;

/**
 * 5.
 * This class represent a pair of objects.
 * The two objects in the pair can be of different types.
 *
 * @param <T1>;
 * @param <T2>;
 */
public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
