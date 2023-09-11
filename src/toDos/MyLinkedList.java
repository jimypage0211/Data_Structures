package toDos;

public class MyLinkedList {
    Node root = new Node();
    private int length = 0;

    public MyLinkedList(){}

    //Add element to the head of the list
    public void addFirst(Object data){
        if(isEmpty()){
            root.setData(data);
            length++;
        } else {
            Node first = new Node(data);
            length++;
            first.setNext(root);
            root = first;
        }
    }

    //Remove first element  in the list.
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        } else if (length == 1) {
            root.setData(null);
            length--;
        } else {
            root = root.getNext();
            length--;
        }
    }

    //Gets the first element in the list
    public Object getFirst () throws Exception{
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        return root.getData();
    }

    //Add element to the end of the list
    public void addLast(Object data){
        if(isEmpty()){
            root.setData(data);
            length++;
        } else if(root.isLast()) {
            root.setNext(new Node(data));
            length++;
        } else {
            Node iter = root.getNext();
            length++;
            while (!iter.isLast()){
                iter = iter.getNext();
            }
            Node last = new Node(data);
            iter.setNext(last);
        }
    }

    //Removes last element of the list
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        if(length == 1){
            root.setData(null);
            length--;
        } else {
            Node iter = root;
            while (!iter.getNext().isLast()){
                iter = iter.getNext();
            }
            iter.setNext(null);
        }
    }

    public Object getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        if(length == 1){
            return root.getData();
        } else {
            Node iter = root.getNext();
            while (!iter.isLast()){
                iter = iter.getNext();
            }
            return iter.getData();
        }
    }

    public void addAtIndex(Object data, int index) {
        if(index>length-1){
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()){
            root.setData(data);
            length++;
        } else if(index == 0){
            root.setData(data);
        } else {
            Node iter = root.getNext();
            int currentIndex = 1;
            while (currentIndex != index){
                iter = iter.getNext();
                currentIndex++;
            }
            iter.setData(data);
        }
    }
    public void removeAtIndex(int index) throws Exception {
        if (index > length - 1) {
            throw new IndexOutOfBoundsException();
        }
        if(isEmpty()){
            throw new Exception("List is empty");
        }
        if(length == 1){
            root.setData(null);
            length--;
        } else if(index == length-1) {
            removeLast();
            length--;
        }else if(index == 0){
            removeFirst();
            length--;
        }else {
            Node iter = root;
            int currentIndex = 0;
            while (index-1 != currentIndex){
                iter = iter.getNext();
                currentIndex++;
            }
            iter.setNext(iter.getNext().getNext());
            length--;
        }
    }

    public Object getItemAt(int index) throws Exception{
        if (isEmpty()){
            throw new Exception("List is empty");
        }
        if (index > length - 1) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            return getFirst();
        } else if (index == length-1){
            return getLast();
        } else {
            Node iter = root.getNext();
            int currentIndex = 1;
            while (index != currentIndex){
                iter = iter.getNext();
                currentIndex++;
            }
            return iter.getData();
        }
    }
    public boolean isEmpty(){
        return length == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[]";
        }
        if (root.isLast()){
            return "[" + root.getData() + "]";
        }
        String print = "[" + root.getData() + ",";
        Node iter = root.getNext();
        while (iter != null){
            print = print + iter.getData() + ",";
            iter = iter.getNext();
        }
        print = print.substring(0,print.length()-1) + ']';
        return print;
    }
}
