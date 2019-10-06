package lab9_3;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}

	public boolean enqueue(int value) {
		if (rear == arr.length) {
			reSize();
		}
		size++;
		arr[rear++] = value;
		return true;
	}



	public int dequeue() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}
		--size;
		return arr[front++];
	}

	public int peek() {
		

		return arr[front];
	}
	private void reSize() {
		int len = (int) (arr.length * (arr.length * 0.75));
		int[] newArray = new int[len];
		System.arraycopy(arr, front, newArray, 0, size);
		front = 0;
		rear = size;
		size = rear - front;
		arr = newArray;
	}




	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		try {
		System.out.printf("is empty :%s\nLoading ...\n", q.isEmpty());
		for (int i = 1; i <4; i++) {
			System.out.println(
					q.enqueue(i) + " " + i + " is added so -> size : " + q.size() + " and peek is: " + q.peek());
		}
		System.out.println("\nis empty :" + q.isEmpty());
		for (int i = 0; i < 4; i++) {
			System.out.println(q.dequeue() + " is removed so : ->size : " + q.size() + " and peek is : " + q.peek());
		}
		System.out.println("\n-------additional check after all data is removed----------");
		System.out.println("\nis empty :" + q.isEmpty());
		System.out.println("size : " + q.size());
		System.out.println("peek : " + q.peek());
	}

		catch(NumberFormatException ex) {
			System.out.println("out of range");
		}
	


	//uncomment when ready
	//		for(int i = 0; i < 15; i ++)
	//			q.enqueue(i);
	//		for(int i = 0; i < 14; i ++)
	//			q.dequeue();
	//		System.out.println(q.size());
	//		System.out.println(q.peek());
}}


