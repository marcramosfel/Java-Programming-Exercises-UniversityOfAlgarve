package exame;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T>{
    private MyStack<T> stack;
    private int currentIndex;

    public MyIterator(MyStack<T> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {

        return this.currentIndex< this.stack.size();}

    @Override
    public T next() {
        return stack.getStack().get(this.currentIndex++);
    }
}
