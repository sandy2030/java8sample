package com.concurrency;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> chmap
                = new ConcurrentHashMap<Integer, String>();

        // Add elements using put()
        chmap.put(10, "Geeks");
        chmap.put(20, "for");
        chmap.put(30, "Geeks");
        chmap.put(40, "Welcome");
        chmap.put(50, "you");

        Set<Map.Entry<Integer, String>> set = chmap.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> me = it.next();
            me.getKey();
            System.out.println("key "+me.getKey()+" value "+me.getValue());
        }

    }
}
