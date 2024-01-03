package Chap04;

public class IntArrayQueue {
	private int[] que; //ť�� �迭
	private int capacity; //�뷮
	private int num; //���� ������ ����

	//���� �� ���� : ť�� �������.
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//���� �� ���� : ť�� ������.
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public IntArrayQueue(int maxlen) {
		num = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		}catch(OutOfMemoryError e) {
			//������ �� ����.
			capacity = 0;
		}
	}
	
	//ť�� �����͸� ��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) 
			throw new OverflowIntQueueException(); //ť�� ������.
		que[num++] = x;
		return x;
	}
	
	//ť���� �����͸� ��ť
	public int deque() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException(); //ť�� ��� ����.
		int x = que[0];
		
		
		return x;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
