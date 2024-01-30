package Chap04;

public class Queue<E> {
	//���� �� ���� : ť�� ��� ����
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {}
	}
	
	//���� �� ���� : ť�� ���� ��
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {}
	}
	
	private E[] que; //ť ��ü
	private int capacity; //ť�� �뷮
	private int num; //���� ������ ����
	private int front; //�Ǿ� ��� Ŀ��
	private int rear; //�ǳ� ��� Ŀ��
	
	//������
	public Queue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = (E [])new Object[capacity]; //ť�� ��ü�� �迭 ����.
		}catch(OutOfMemoryError e) { //������ �� ����.
			capacity = 0; 
			
		}
	}
	
	//ť�� �����͸� ��ť
	public E enque(E x) throws OverflowGqueueException {
		if (num >= capacity)
			throw new OverflowGqueueException();
		que[rear ++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}
	
	//ť�� �����͸� ��ť
	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();
		E x = que[front ++];
		num --;
		if (front == capacity)
			front = 0;
		return x;
	}
	
	//ť���� �����͸� ��ũ (�� �� �����͸� �鿩�ٺ�)
	public E peek() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();
		return que[front]; //ť�� �������.
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(�߰����� ���ϸ� -1)�� ��ȯ�մϴ�.
	public int indexOf(E x) throws EmptyGqueueException {
		for (int i = 0; i<num; i++) {
			if(que[(i+front)%capacity].equals(x)) //�˻� ����
				return i + front;	
		}
		return -1;
	}
	
	//ť���� x�� �˻��Ͽ� �� �տ��� �� ��°�ΰ� (�߰����� ���ϸ� -1)�� ��ȯ�մϴ�.
	public int search(E x) {
		for (int i = 0; i<num; i++)
			if (que[(i+front)%capacity].equals(x)) //�˻� ����
				return i+1;
		return -1; //�˻� ����
		
	}
	
	//ť�� ���ϴ�.
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť�� �뷮�� ��ȯ�մϴ�.
	public int getcapacity() {
		return capacity;
	}
	
	//ť�� �׿��ִ� �����ͼ��� ��ȯ�մϴ�.
	public int size() {
		return num;
	}
	
	//ť�� ��� �ִ°�?
	public boolean isEmpty() {
		return num<=0;
	}
	
	//ť�� ���� á�°�?
	public boolean isFull() {
		return num >= capacity;
	}
	
	//ť ���� ��� �����͸� �Ǿ� -> �� ���� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ������ϴ�.");
		else {
			for (int i = 0; i<num; i++)
				System.out.println(que[(i+front) % capacity].toString() + " ");
			System.out.println();
		}
	}
	
}
