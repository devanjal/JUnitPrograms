package testing;
public class Stack {
	   private int sizeMax;
	   private long[] stackArray;
	   private int first;
	   public Stack() {
	      sizeMax = 10;
	      stackArray = new long[sizeMax];
	      first = -1;
	      int f= first++;
	  }
	   public void push(long j) {
	      stackArray[++first] = j;
	   }
	   public long pop() {
	      return stackArray[first--];
	   }
	   public long peek() {
		   Stack s = new Stack();
	      return stackArray[first];
	   }
	   public boolean isEmpty() {
	      return (first == -1);
	   }
	   public boolean isFull() {
	      return (first == sizeMax - 1);
	   }
	   public static long stacky() 
	   {
	      Stack theStack = new Stack(); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      return theStack.peek();
	   }
	   }
