package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface HashSet<T> extends Set<T> {

    @Override
    default int size() {
        return -1;
    }

    @Override
    default boolean isEmpty() {
        return true;
    }

    @Override
    default boolean contains(Object o) {
        return true;
    }

    @Override
    default Iterator<T> iterator() {
        return null; }

    @Override
    default Object[] toArray() { return new Object[0]; }

    @Override
    default <t> t[] toArray(t[] a) { return a; }

    @Override
    default boolean add(T e) {
        return true;
    }

    @Override
    default boolean remove(Object o) {
        return true;
    }

    @Override
    default boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    default boolean addAll(Collection<? extends T> c) {
        return true;
    }

    @Override
    default boolean retainAll(Collection<?> c) {
        return true;
    }

    @Override
    default boolean removeAll(Collection<?> c) {
        return true;
    }

    @Override
    default void clear() { }
    
}
