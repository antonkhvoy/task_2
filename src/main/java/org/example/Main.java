package org.example;
import org.example.Main;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // добавление элементов в список
        linkedList.append("Toyota");
        linkedList.append("Kia");
        linkedList.append("Lada");

        // вставка нового элемента вместо элемента с индексом 1
        linkedList.insert(1, "BMW");

        // удаление элемента "Kia"
        linkedList.remove("Kia");

        // получить и вывести элемент с индексом 2
        String element = linkedList.get(2);
        System.out.println("Element at index 2: " + element);

        // получить и вывести количество элементов в списке
        int size = linkedList.size();
        System.out.println("Size of the list: " + size);
    }
}