package exame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyStack<T> implements Iterable<T> {
    private int counter = 0;

    private LinkedList<T> stack = new LinkedList<>();

    public LinkedList<T> getStack() {
        return stack;
    }

    public void push(T value){
        this.stack.add(value);
        this.counter++;
    }

    public T pop(){
        T res = this.stack.get(this.stack.size()-1);
        this.stack.remove(res);
        this.counter--;
        return res;
    }

    public int size(){
//        return this.counter;
        return this.stack.size();
    }


    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }
}
