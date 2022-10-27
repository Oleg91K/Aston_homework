package ru.home.task.task1;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayList<T> implements InterfaceArrayList {
    private static final int DEFAULT_SIZE = 10;
    private T[] elements;
    private int size;

    public ArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }
    @Override
    public void add(Object element) {
        if (isaFullArray()) {
            resize();
        }
        this.elements[size] = (T) element;
        size++;
    }
    @Override
    public void add(int index, Object element) {
        if (index >= 0 && index < size) {
            if (isEmpty()) {
                this.add(element);
                return;
            }
            for (int i = size - 1; i > index; i--) {
                if (isaFullArray()) {
                    resize();
                }
                this.elements[i + 1] = this.elements[i];
            }
            this.elements[index] = (T) element;
        }
    }
    @Override
    public Object set(int index, Object element) {
        elements[index] = (T) element;
        return (T) element;

    }
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            return null;
        }
    }
    @Override
    public Object delete(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return index;
    }

    @Override
    public Object delete(Object element) {
        if (!this.isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (this.elements[i].equals(element)) {
                    T target = this.elements[i];
                    if (i == size - 1) {
                        size--;
                        return target;
                    }
                    for (int j = i + 1; j < size; j++) {
                        this.elements[j - 1] = this.elements[j];
                    }
                    size--;
                    return target;
                }
            }
        }
        return null;
    }
    @Override
    public int index(Object element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (this.get(i).equals(element)) {
                    return i;
                }
            }
        }
        return -1;
    }
    @Override
    public void clear() {
        this.size = 0;
    }
    @Override
    public int size() {
        return elements.length;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(elements, 0, size, comparator);
    }


    public void display() {
        for (Object element : elements) {
            System.out.println(element + " ");
        }
    }

    private boolean isaFullArray() {
        return size == elements.length;
    }

    private void resize() {
        Object[] oldElements = this.elements;
        this.elements = (T[]) new Object[oldElements.length + oldElements.length/2];
        for (int i = 0; i < size; i++) {
            this.elements[i] = (T) oldElements[i];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements,size));
    }

}

