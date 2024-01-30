package Chap04;

public class IntQueue {
	//int�� ���� ���� ť
	private int[] que; //ť�� �迭
	private int capacity; //ť�� �뷮
	private int front; //�� ���� ��� Ŀ��
	private int rear; //�� ���� ��� Ŀ��
	private int num; //���� ������ ����
	
	//����� ���� : ť�� ��� ����.
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//����� ���� : ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public IntQueue (int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];		
		}catch(OutOfMemoryError e) {
			//������ �� ����
			capacity = 0;
		}
	}
	
	//ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
 	}
	
	//ť�� �����͸� ��ť
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); //ť�� �������.
		int x = que[front++];
		num --;
		if (front == capacity)
			front = 0;
		return x;
	}
	
	//ť���� �����͸� ��ũ
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1�� ��ȯ)
	public int indexOf(int x) {
		for (int i = 0; i<num; i++) {
			int idx = (i+front) % capacity;
			if (que[idx] == x)
				return idx; //�˻� ����
		}
		return -1; //�˻� ����
	}
	
	//ť�� �뷮�� ��ȯ
	public int getCapacity() {
		return capacity;
	}
	
	//ť�� �׿� �ִ� ������ ������ ��ȯ
	public int size() {
		return num;
	}
	
	//ť�� ����ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//ť�� ���� á����?
	public boolean isFull() {
		return num >= capacity;
	}
	
	//ť���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ����ֽ��ϴ�.");
		else {
			for (int i = 0; i<num; i++)
				System.out.print(que[(i+front)%capacity] + " ");
			System.out.println();
		}
	}
	
	//���Ƿ� �˻��ϴ� �޼ҵ�
	public int search(int x) {
		for (int i = 0; i<num; i++)
			if(que[(i+front)%capacity] == x)
				return i+1;
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
