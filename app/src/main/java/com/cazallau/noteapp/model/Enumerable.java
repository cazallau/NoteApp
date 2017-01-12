package com.cazallau.noteapp.model;

import java.util.List;

/**
 * Created by gemabeltran on 11/1/17.
 */

public interface Enumerable<T> {

    int count();
    void add(T element);
    void remove(int index);
    void update (int index, T newElement);
    List<T> getAll();
}
