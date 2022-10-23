package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SimpleHashSetTest {

    @Test
    public void testSize() {
        SimpleHashSet<String> t = new SimpleHashSet<>();
        t.add("India");
        assertEquals(1,t.size());
    }

    @Test
    public void testIsEmpty(){
        SimpleHashSet<String> t = new SimpleHashSet<>();
        assertTrue(t.isEmpty());
    }

    @Test
    public void testContains(){
        SimpleHashSet<String> t = new SimpleHashSet<>();
        t.add("India");
        t.add("Africa");
        t.add("America");
        assertTrue(t.contains("Africa"));
    }

    @Test
    public void testRemove(){
        SimpleHashSet<String> t = new SimpleHashSet<>();
        t.add("India");
        t.add("Africa");
        t.add("America");
        assertTrue(t.remove("India"));
    }

    @Test
    public void testRetainAll(){
        SimpleHashSet<String> t = new SimpleHashSet<>();
        t.add("India");
        t.add("Africa");
        t.add("America");
        assertTrue(t.retainAll(Arrays.asList("India","America")));
    }
    
}
