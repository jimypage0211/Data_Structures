import toDos.MyQueue;

public class Main {
    public static void main(String[] args) throws Exception {

        MyQueue q = new MyQueue(4);
        q.push("1st");
        q.push("2nd");
        q.push("3rd");
        q.push("4th");

        System.out.println(q.peek());
        // aaaaaaaaaaaaaaaaa
        System.out.println(q);
    }
}
