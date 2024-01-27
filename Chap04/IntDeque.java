package Chap04;

public class IntDeque {
	// ���� �� ���� : ť�� ��� ����.
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	private int[] que; // ���� ��ü
	private int capacity; // ���� �뷮
	private int num; // ���� ������ ����
	private int front; // �Ǿ� ��� Ŀ��
	private int rear; // �ǳ� ��� Ŀ��

	// ������
	public IntDeque(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity]; // ����ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			capacity = 0;
		}
	}

	// ���� �� �տ� �����͸� ��ť
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException(); // ���� ������
		if (--front < 0)
			front = capacity - 1;
		que[front] = x;
		return x;
	}

	// ���� �� ���� �����͸� ��ť
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= capacity)
			throw new OverflowIntDequeException(); // ���� ������.
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// ���� �� �տ� �����͸� ��ť
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ���� �����.
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	// ���� �� ���� �����͸� ��ť
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0) {
			throw new EmptyIntDequeException(); // ���� �����.
		}
		num--;
		if (--rear < 0)
			rear = capacity - 1;
		return que[rear];

	}

	// ���� �� �� �����͸� ��ũ (�� �� �����͸� �鿩�ٺ�)
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ���� �������.
		return que[front];
	}

	// ���� �� �� �����͸� ��ũ (�� �� �����͸� �鿩�ٺ�)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ���� �������.
		return que[rear == 0 ? capacity - 1 : rear - 1];
	}

	// ������ x�� �˻��Ͽ� �ε���(�߰����� ���ϸ� -1)
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x)
				return idx;
		}
		return -1; // �˻� ����
	}

	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % capacity] == x)
				return i + 1; // �˻� ����
		return 0;
	}

	// ���� ���ϴ�.
	public void clear() {
		num = front = rear = 0;
	}

	// ���� �뷮�� ��ȯ�մϴ�.
	public int getCapacity() {
		return capacity;
	}

	// ���� �׿��ִ� ������ ���� ��ȯ�մϴ�.
	public int size() {
		return num;
	}

	// ���� ��� �ִ°� ?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ���� ���� á�°� ?
	public boolean isFull() {
		return num >= capacity;
	}

	// �� ���� ��� �����͸� �Ǿ� -> �ǳ��� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("���� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}

}

