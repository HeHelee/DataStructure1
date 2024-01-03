package Chap04;

public class Stack<E> {
	private E[] stk; //���ÿ� �迭
	private int capacity; //���� �뷮
	private int ptr; //���� ������
	
	//���� �� ���� : ������ ��� ����.
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {}
	}
	//���� �� ���� : ������ ���� ��.
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {}
	}
	
	//������
	public Stack (int maxlen) {	
		ptr = 0;
		capacity = maxlen;
		try {
			stk = (E[])new Object[capacity]; //���� ��ü�� �迭�� ����
		}catch(OutOfMemoryError e) { //������ �� ����.
			capacity = 0;
		}
	}
	
	//���ÿ� x�� Ǫ��
	public E push(E x) throws OverflowGstackException {
		if (ptr >= capacity)
	//������ ������
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}
	
	//���ÿ��� �����͸� �� (������� �����͸� ����)
	public E pop() throws EmptyGstackException {
		if (ptr<=0)
			throw new EmptyGstackException();
		return stk[--ptr];
	}
	
	//���ÿ��� �����͸� ��ũ (������� �����͸� �����ٺ�)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0)
			throw new EmptyGstackException();
		return stk[ptr-1];
	}
	
	//������ ���ϴ�.
	public void clear() {
		ptr = 0;
	}
	
	//���ÿ��� x�� �˻��Ͽ� �ε����� �߰����� ���ϸ� ��ȯ�մϴ�.
	public int indexOf(E x) {
		for (int i = ptr-1; i>=0; i--) {
			if(stk[i].equals(x))
				return i; //�˻� ����
		}
		return -1; //�˻� ����
	}
	
	//���� �뷮�� ��ȯ�մϴ�.
	public int getCapacity() {
		return capacity;
	}
	
	//���ÿ� �׿��ִ� ������ ���� ��ȯ�մϴ�.
	public int size() {
		return ptr;
	}
	
	//������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//������ ���� á�°�?
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//���� ���� ��� �����͸� �ٴ� -> ������� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i<ptr; i++) 
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
