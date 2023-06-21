package org.example;

// односвязный список с произвольным типом данных
public class LinkedList<T> {

    private Node<T> head; // ссылка на первый элемент списка
    private int size; // количество элементов в списке

    // добавление элемента в конец списка
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    // вставка элемента по индексу
    public void insert(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            while (currentIndex < index - 1) {
                current = current.getNext();
                currentIndex++;
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    // удаление первого вхождения элемента из списка
    public void remove(T data) {
        if (head == null) {
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getData().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    // извлечение элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        return current.getData();
    }

    public int size() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}