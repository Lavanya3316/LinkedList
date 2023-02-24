package org.xyz;
public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print the list
        System.out.println("LinkedList: " + list);

        // Add an element at a specific index
        list.add(1, "Grape");

        // Print the modified list
        System.out.println("Modified LinkedList: " + list);

        // Remove an element from the list
        list.remove("Banana");

        // Print the modified list
        System.out.println("Modified LinkedList: " + list);

        // Get the element at a specific index
        String element = list.get(2);

        // Print the element
        System.out.println("Element at index 2: " + element);
    }
}
