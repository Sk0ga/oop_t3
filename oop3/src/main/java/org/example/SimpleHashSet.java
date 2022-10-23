package org.example;

import java.util.*;

public class SimpleHashSet<T> implements HashSet<T> {

    private List<T> values = new ArrayList<>();

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return values.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }

    @Override
    public Object[] toArray() {
        return values.toArray();
    }

    @Override
    public <t> t[] toArray(t[] a) {
        return (t[]) values.toArray();
    }

    @Override
    public boolean add(T e) {
        if(!values.contains(e)){
            values.add(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if(values.contains(o)){
            values.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return values.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for(T t : c){
            if(add(t)){
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        for (T t:values){
            if (!c.contains(t)){
                values.remove(t);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        for (T t:values){
            if (c.contains(t)){
                values.remove(t);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        values.clear();
    }

}
