package com.example.demospring.gilad_generic;



public interface MyList <E> {
    void add(E x);
    MyIterator<E> iterator();
}
