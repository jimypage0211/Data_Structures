package toDos;

public class MyQueue {
   private MyStack s1;
   private MyStack s2;
   private int size = 0;
   final int DEFAULT_CAPACITY = 10; // 10 for each stack , 20 in total
   public MyQueue (){
      s1 = new MyStack(DEFAULT_CAPACITY);
      s2 = new MyStack(DEFAULT_CAPACITY);
   }

   public MyQueue (int capacity){
      s1 = new MyStack(capacity);
      s2 = new MyStack(capacity);
   }

   public void push (Object data) throws Exception{
      if(s1.isFull()){
         throw new Exception("Queue is full");
      }
      if(s1.isEmpty()){
         s1.push(data);
      } else {
         while (!s1.isEmpty()){
            s2.push(s1.pop());
         }
         s1.push(data);
         while (!s2.isEmpty()){
            s1.push(s2.pop());
         }
      }
      size++;
   }

   public Object pop() throws Exception{
      if (s1.isEmpty()){
         throw new Exception("Queue is empty");
      }
      return s1.pop();
   }

   public Object peek(){
      return s1.peek();
   }

   public int search (Object data){
      return s1.search(data);
   }
   public int getSize(){
      return size;
   }

   public int getTotalCap (){
      return s1.getCap();
   }
   public boolean isEmpty(){
      return size == 0;
   }

   @Override
   public String toString() {
      return s1.toString();
   }

}
