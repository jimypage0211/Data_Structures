package toDos;

public class Node {
    private Object data;
    private Node next;
    private Node prev;


    public Node (){
        this.data = null;
        this.next = null;
        this.prev = null;
    }
    public Node (Object data){
        this.next = null;
        this.prev = null;
        this.data = data;
    }

    public Node (Object data, Node next){
        this.next = null;
        this.data = data;
        this.next = next;
    }

    public Node (Object data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Object getData() {
        return data;
    }
    public boolean isLast() {
        return next==null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
