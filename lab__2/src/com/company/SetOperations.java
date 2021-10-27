package com.company;

import com.company.Person.NameCompare;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetOperations {
    HashSet<Person> HashSetCollection = new HashSet();
    TreeSet<Person> TreeSetCollection = new TreeSet(new NameCompare());

    public SetOperations() {
    }

    public void HashSetPrintOperation() {
        System.out.println();
        System.out.println("Hash Set:");
        Iterator var1 = this.HashSetCollection.iterator();

        while (var1.hasNext()) {
            Person i = (Person) var1.next();
            PrintStream var10000 = System.out;
            String var10001 = i.getFirstName();
            var10000.println(var10001 + " " + i.getLastName() + " " + i.getBirthYear());
        }

        System.out.println();
    }

    public void HashSetAddOperation(Person p) {
        this.HashSetCollection.add(p);
        this.HashSetPrintOperation();
    }

    public void HashSetRemoveOperation(Person p) {
        this.HashSetCollection.remove(p);
        this.HashSetPrintOperation();
    }

    public void TreeSetPrintOperation() {
        System.out.println();
        System.out.println("Tree Set:");
        Iterator var1 = this.TreeSetCollection.iterator();

        while (var1.hasNext()) {
            Person i = (Person) var1.next();
            PrintStream var10000 = System.out;
            String var10001 = i.getFirstName();
            var10000.println(var10001 + " " + i.getLastName() + " " + i.getBirthYear());
        }

        System.out.println();
    }

    public void TreeSetAddOperation(Person p) {
        this.TreeSetCollection.add(p);
        this.TreeSetPrintOperation();
    }

    public void TreeSetRemoveOperation(Person p) {
        this.TreeSetCollection.remove(p);
        this.TreeSetPrintOperation();
    }
}
