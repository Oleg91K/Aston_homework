package ru.home.task.task1;

import java.util.Arrays;

public class ArrayList<T> {
    private static final int DEFAULT_SIZE = 10;
    private T[] elements;
    private int size;

    public ArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add (T element) {
        if (isaFullArray()) {
            resize();
        }
        this.elements[size] = element;
        size++;
    }
    public void add(int index,T element) {
        for (int i = size; i > index ; i--) {
            elements[index] = elements[i-1];
        }
        size++;
    }

    public T set (int index, T element) {
        elements[index] = element;
        return element;

    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            return null;
        }
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void delete(T element) {
       int position = index(element);
       if(position < 0) {
           return;
       }
       delete(position);
    }

    public int index (T element) {
        if(element == null)
            return -1;
        for(int i = 0; i < size; i++) {
            if (element.equals(elements[i])) ;
            return i;
             }
        return -1;
        }

    public void clear() {
        this.size = 0;
    }

    public int size() {
        return elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        for (T element : elements) {
            System.out.println(element + " ");
        }
    }

    private boolean isaFullArray() {
        return size == elements.length;
    }

    private void resize() {
        T[] oldElements = this.elements;
        this.elements = (T[]) new Object[oldElements.length + oldElements.length/2];
        for (int i = 0; i < size; i++) {
            this.elements[i] = oldElements[i];
        }
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements,size));
    }
}
