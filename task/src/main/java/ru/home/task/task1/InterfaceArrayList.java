package ru.home.task.task1;

public interface InterfaceArrayList{
    void add(Object element);

    void add(int index, Object element);

    Object set(int index, Object element);

    Object get(int index);

    Object delete(int index);

    Object delete(Object element);

    int index(Object element);

    void clear();

    int size();

    boolean isEmpty();
}
