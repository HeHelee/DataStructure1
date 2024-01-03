package Chap04;
//int�� ���� ���� ����
public class IntStack {
	private int[] stk; //���ÿ� �迭
	private int capacity; //���� �뷮
	private int ptr; //���� ������
	
	//����� ����:������ ��� ����.
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//����� ����:������ ���� ��.
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//������
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; //���� ��ü�� �迭�� ����
		}catch (OutOfMemoryError e) { //������ �� ����.
			capacity = 0;
		}
	}
	
	//���ÿ� x�� Ǫ��
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//���ÿ��� �����͸� �� (����⿡ �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException {
		if (ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//���ÿ��� �����͸� ��ũ(����⿡ �ִ� �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//������ ���
	public void clear() {
		ptr = 0;
	}
	
	//���ÿ��� x�� ã�� �ε���(������ 0)�� ��ȯ
	public int indexOf(int x) {
		for(int i = ptr-1; i>=0; i--) //����� �ʺ��� �����˻�
			if (stk[i] == x)
				return i; //�˻� ����
		return -1; //�˻� ����
	}
	
	//������ �뷮�� ��ȯ
	public int getCapacity() {
		return capacity;
	}
	
	//���ÿ� �׿� �ִ� ������ ������ ��ȯ
	public int size() {
		return ptr;
	}

	//������ ����ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//������ ���� ã�°�?
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//���� �ȿ� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ����ֽ��ϴ�.");
		else {
			for (int i = 0; i<ptr; i++)
				System.out.print(stk[i] + "");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		

	}

}