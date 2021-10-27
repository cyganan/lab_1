package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListOperations {
    LinkedList<Person> LinkedListCollection = new LinkedList();
    ArrayList<Person> ArrayListCollection = new ArrayList();

    public ListOperations() {
    }

    public void ArrayListPrintOperation() {
        System.out.println();
        System.out.println("Array List:");
        Iterator var1 = this.ArrayListCollection.iterator();

        while (var1.hasNext()) {
            Person person = (Person) var1.next();
            PrintStream var10000 = System.out;
            String var10001 = person.getFirstName();
            var10000.println(var10001 + " " + person.getLastName() + " " + person.getBirthYear());
        }

        System.out.println();
    }

    public void ArrayListRemoveOperation(int index) {
        this.ArrayListCollection.remove(index);
        this.ArrayListPrintOperation();
    }

    public void ArrayListAddOperation(Person p) {
        this.ArrayListCollection.add(p);
        this.ArrayListPrintOperation();
    }

    public void LinkedListPrintOperation() {
        System.out.println();
        System.out.println("Linked list:");
        Iterator var1 = this.LinkedListCollection.iterator();

        while (var1.hasNext()) {
            Person person = (Person) var1.next();
            PrintStream var10000 = System.out;
            String var10001 = person.getFirstName();
            var10000.println(var10001 + " " + person.getLastName() + " " + person.getBirthYear());
        }

        System.out.println();
    }

    public void LinkedListAddOperation(int index, Person p) {
        this.LinkedListCollection.add(index, p);
        this.LinkedListPrintOperation();
    }

    public void LinkedListRemoveOperation(int index) {
        this.LinkedListCollection.remove(index);
        this.LinkedListPrintOperation();
    }
}
