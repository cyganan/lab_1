package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapOperations {
    HashMap<String, Person> HashMapCollection = new HashMap();
    TreeMap<String, Person> TreeMapCollection = new TreeMap();

    public MapOperations() {
    }

    public void HashMapPrintOperation() {
        System.out.println();
        System.out.println("Hash Map:");
        Iterator var1 = this.HashMapCollection.keySet().iterator();

        while (var1.hasNext()) {
            String i = (String) var1.next();
            System.out.println(i + " " + this.HashMapCollection.get(i).getLastName() + " " + this.HashMapCollection.get(i).getBirthYear());
        }

        System.out.println();
    }

    public void HashMapAddOperation(String key, Person p) {
        this.HashMapCollection.put(key, p);
        this.HashMapPrintOperation();
    }

    public void HashMapRemoveOperation(String l) {
        this.HashMapCollection.remove(l);
        this.HashMapPrintOperation();
    }

    public void TreeMapPrintOperation() {
        System.out.println();
        System.out.println("Tree Map:");
        Iterator var1 = this.TreeMapCollection.keySet().iterator();

        while (var1.hasNext()) {
            String i = (String) var1.next();
            System.out.println(i + " " + this.HashMapCollection.get(i).getLastName() + " " + this.HashMapCollection.get(i).getBirthYear());
        }

        System.out.println();
    }

    public void TreeMapAddOperation(String key, Person p) {
        this.TreeMapCollection.put(key, p);
        this.TreeMapPrintOperation();
    }

    public void TreeMapRemoveOperation(String s) {
        this.TreeMapCollection.remove(s);
    }
}
