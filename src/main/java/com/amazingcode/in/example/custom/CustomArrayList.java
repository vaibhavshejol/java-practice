package com.amazingcode.in.example.custom;

public class CustomArrayList<T> {
    private Object[] array;
    private int size; // Number of elements in the list

    // Initial capacity
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Add an element at the end
    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    // Add an element at a specific index
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        // Shift elements to the right
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    // Remove an element at a specific index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedElement = (T) array[index];
        // Shift elements to the left
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null; // Avoid memory leak
        return removedElement;
    }

    // Get the current size of the list
    public int size() {
        return size;
    }

    // Ensure enough capacity to add new elements
    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    // Clear the list
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}
