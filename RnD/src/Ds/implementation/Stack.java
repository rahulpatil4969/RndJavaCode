package Ds.implementation;

public class Stack {

	private int top;
	private int capacity;
	private int[] arr;
	
	
	Stack(int size){
		
		capacity=size;
		top =-1;
		arr =new int [size];
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is Full...");
			System.exit(1);
		}
		arr[++top]=element;
		System.out.println("Pushing Element :"+element);
	}

	public int peek() {
		if(isEmpty()) {
			System.err.println("Stack is Empty...");
			System.exit(1);
		}
			return arr[top];
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
		}
		return arr[top--];
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}

	public  boolean isFull() {
		if(top == capacity-1)
			return true;
		else
			return false;
	}

	public void stackPrint() {
		System.out.print("Stack : ");
		
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		
		st.push(10);
		st.push(10);
		st.push(30);
		
		st.stackPrint();
		
		st.push(40);
		st.stackPrint();
		
		System.out.println(st.peek());
		st.stackPrint();
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.stackPrint();
	}

}
