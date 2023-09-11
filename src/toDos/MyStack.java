package toDos;

import java.util.ArrayList;

public class MyStack {
    private  ArrayList<Object> stack;
    private int cap;
    private int size = 0;


    public MyStack(){
        this.stack = new ArrayList<>(10);
        this.cap = 10;
    }
    public MyStack(int capacity){
        this.stack = new ArrayList<>(capacity);
        this.cap = capacity;
    }

    public void push(Object obj) throws Exception{
        if (this.stack.size() == this.cap){
            throw new Exception("Stack is full");
        }
        this.stack.add(obj);
        size++;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object ret = this.stack.get(stack.size()-1);
        this.stack.remove(stack.size()-1);
        size--;
        return ret;
    }

    public Object peek(){
        if (isEmpty()) {
            return null;
        }
        return this.stack.get(stack.size()-1);
    }

    public int search(Object obj){
        return this.stack.indexOf(obj);
    }

    public int getCap() {
        return cap;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull(){
        return size == cap;
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    @Override
    public String toString(){
        return stack.toString();
    }
}
